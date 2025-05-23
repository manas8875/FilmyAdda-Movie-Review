package com.movieProject.FilmyAdda.service.request;

import com.movieProject.FilmyAdda.domain.Genre;
import com.movieProject.FilmyAdda.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieRequest {
    private String title;
    private Genre genre;

    public Movie toMovie(){
        return Movie.builder().title(title).genre(genre).rating(0.0).build();
    }
}
