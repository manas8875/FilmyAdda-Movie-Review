package com.movieProject.FilmyAdda.service.response;

import com.movieProject.FilmyAdda.domain.Genre;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {
    private String title;
    private Genre genre;
    private Double rating;
    private List<ReviewResponse> reviews;
}
