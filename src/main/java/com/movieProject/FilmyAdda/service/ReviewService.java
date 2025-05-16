package com.movieProject.FilmyAdda.service;

import com.movieProject.FilmyAdda.domain.Movie;
import com.movieProject.FilmyAdda.domain.Review;
import com.movieProject.FilmyAdda.repository.MovieRepository;
import com.movieProject.FilmyAdda.repository.ReviewRepository;
import com.movieProject.FilmyAdda.service.response.ReviewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MovieRepository movieRepository;

    public void addReview(Review review) {
        Movie movie=movieRepository.findById(review.getMovie().getId()).orElse(null);
        reviewRepository.save(review);
        //need to optimized
        //exception handling.
        if(movie!=null) {
            Double average = reviewRepository.getReviewAverage(movie.getId());
            movie.setRating(average);
            movieRepository.save(movie);
        }
    }

    public ReviewResponse getReviewById(Long reviewId) {
        Optional<Review> review= reviewRepository.findById(reviewId);
        return review.map(Review::toReviewResponse).orElse(null);
    }
}
