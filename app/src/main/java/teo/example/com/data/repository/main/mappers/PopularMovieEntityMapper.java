package teo.example.com.data.repository.main.mappers;

import javax.inject.Inject;

import teo.example.com.common.mappers.Mapper;
import teo.example.com.data.database.entities.PopularMovieEntity;
import teo.example.com.data.repository.main.entities.PopularMovie;

/**
 * Mapper class used to transform {@link PopularMovieEntity} (in the data layer)
 * to {@link PopularMovie} in the domain layer.
 */

public class PopularMovieEntityMapper implements Mapper<PopularMovieEntity, PopularMovie> {

    @Inject
    PopularMovieEntityMapper() {
    }

    @Override
    public PopularMovie transform(PopularMovieEntity movieEntity) {
        PopularMovie popularMovie = new PopularMovie();

        popularMovie.setId(movieEntity.getId());
        popularMovie.setBackdropPath(movieEntity.getBackdropPath());
        popularMovie.setOverview(movieEntity.getOverview());
        popularMovie.setPosterPath(movieEntity.getPosterPath());
        popularMovie.setReleaseDate(movieEntity.getReleaseDate());
        popularMovie.setTitle(movieEntity.getTitle());
        popularMovie.setVoteAverage(movieEntity.getVoteAverage());
        popularMovie.setVoteCount(movieEntity.getVoteCount());
        popularMovie.setAdult(movieEntity.getAdult());
        popularMovie.setOriginalLanguage(movieEntity.getOriginalLanguage());
        popularMovie.setVideo(movieEntity.getVideo());

        return popularMovie;
    }
}
