package teo.example.com.data.repository.main.mappers;

import javax.inject.Inject;

import teo.example.com.common.mappers.Mapper;
import teo.example.com.data.database.entities.PopularMovieEntity;
import teo.example.com.data.repository.main.entities.PopularMovie;

/**
 * Transforms view model objects to {@link PopularMovieEntity}
 * (in the data layer).
 */

public class PopularMovieModelMapper implements Mapper<PopularMovie, PopularMovieEntity> {

    @Inject
    public PopularMovieModelMapper() {
    }

    @Override
    public PopularMovieEntity transform(PopularMovie popularMovie) {
        PopularMovieEntity movieEntity = new PopularMovieEntity();

        if (popularMovie != null) {
            movieEntity.setId(popularMovie.getId());
            movieEntity.setBackdropPath(popularMovie.getBackdropPath());
            movieEntity.setOverview(popularMovie.getOverview());
            movieEntity.setPosterPath(popularMovie.getPosterPath());
            movieEntity.setReleaseDate(popularMovie.getReleaseDate());
            movieEntity.setTitle(popularMovie.getTitle());
            movieEntity.setVoteAverage(popularMovie.getVoteAverage());
            movieEntity.setVoteCount(popularMovie.getVoteCount());
            movieEntity.setAdult(popularMovie.getAdult());
            movieEntity.setOriginalLanguage(popularMovie.getOriginalLanguage());
            movieEntity.setVideo(popularMovie.getVideo());
        }
        return movieEntity;
    }
}
