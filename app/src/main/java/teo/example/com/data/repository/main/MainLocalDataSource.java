package teo.example.com.data.repository.main;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import teo.example.com.data.database.dao.PopularDao;
import teo.example.com.data.database.entities.PopularMovieEntity;
import teo.example.com.data.repository.main.entities.PopularMovie;
import teo.example.com.data.repository.main.mappers.PopularMovieEntityMapper;
import teo.example.com.features.main.MainMVP;

/**
 * Implementation of a local data source for popular movies feature.
 */

public class MainLocalDataSource implements MainMVP.Model {

    private PopularDao dao;
    private PopularMovieEntityMapper mapper;

    @Inject
    public MainLocalDataSource(PopularDao dao, PopularMovieEntityMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public Observable<List<PopularMovie>> loadData() {
        return dao.getPopularMovies()
                .map(entities -> {

                    List<PopularMovie> popularMovies = new ArrayList<>();
                    for (PopularMovieEntity entity: entities){
                        popularMovies.add(mapper.transform(entity));
                    }
                    return popularMovies;

                })
                .toObservable();
    }
}
