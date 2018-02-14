package teo.example.com.data.repository.main.sources.local;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import teo.example.com.data.database.dao.PopularDao;
import teo.example.com.data.database.entities.PopularMovieEntity;
import teo.example.com.data.repository.main.entities.PopularMovie;
import teo.example.com.data.repository.main.mappers.PopularMovieEntityMapper;
import teo.example.com.data.repository.main.mappers.PopularMovieModelMapper;
import teo.example.com.data.repository.main.sources.MainDataSource;

/**
 * Implementation of a local data source for popular movies feature.
 */

public class MainLocalDataSource implements MainDataSource {

    private PopularDao dao;
    private PopularMovieEntityMapper mapper;
    private PopularMovieModelMapper popularMapper;

    @Inject
    public MainLocalDataSource(PopularDao dao, PopularMovieEntityMapper mapper,
                               PopularMovieModelMapper popularMapper) {
        this.dao = dao;
        this.mapper = mapper;
        this.popularMapper = popularMapper;
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

    @Override
    public void saveData(List<PopularMovie> movies) {
        List<PopularMovieEntity> movieEntities = new ArrayList<>();

        for (PopularMovie movie: movies){
            movieEntities.add(popularMapper.transform(movie));
        }

        dao.saveMovies(movieEntities);
    }
}
