package teo.example.com.features.main.utils;

import javax.inject.Inject;

import teo.example.com.common.mappers.Mapper;
import teo.example.com.data.api.entities.MoviesNestedItemResultsResponse;
import teo.example.com.data.repository.main.entities.PopularMovie;

/**
 * Mapper class used to transform {@link MoviesNestedItemResultsResponse} (in the data layer)
 * to {@link PopularMovie} in the domain layer.
 */

public class PopularMovieMapper implements Mapper<MoviesNestedItemResultsResponse, PopularMovie> {

    @Inject
    PopularMovieMapper() {
    }

    @Override
    public PopularMovie transform(MoviesNestedItemResultsResponse movie) {
        PopularMovie popularMovie = new PopularMovie();

        popularMovie.setId(Integer.valueOf(movie.getId()));
        popularMovie.setBackdropPath(movie.getBackdropPath());
        popularMovie.setOverview(movie.getOverview());
        popularMovie.setPosterPath(movie.getPosterPath());
        popularMovie.setReleaseDate(movie.getReleaseDate());
        popularMovie.setTitle(movie.getTitle());
        popularMovie.setVoteAverage(movie.getVoteAverage());
        popularMovie.setVoteCount(movie.getVoteCount());

        return popularMovie;
    }
}
