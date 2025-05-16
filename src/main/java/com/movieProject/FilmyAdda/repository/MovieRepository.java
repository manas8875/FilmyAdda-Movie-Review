package com.movieProject.FilmyAdda.repository;

import com.movieProject.FilmyAdda.domain.Genre;
import com.movieProject.FilmyAdda.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    public Movie findByTitle(String title);

    public List<Movie> findByGenre(Genre genre);
}
