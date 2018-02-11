package teo.example.com.data.repository.main;

import javax.inject.Inject;

import io.reactivex.Observable;
import teo.example.com.data.database.dao.PopularDao;
import teo.example.com.data.repository.main.entities.PopularMovie;
import teo.example.com.features.main.MainMVP;

/**
 * Implementation of a local data source for popular movies feature.
 */

public class MainLocalDataSource implements MainMVP.Model {

    private PopularDao dao;

    @Inject
    public MainLocalDataSource(PopularDao dao) {
        this.dao = dao;
    }

    @Override
    public Observable<PopularMovie> loadData() {
        return null;
    }
}
