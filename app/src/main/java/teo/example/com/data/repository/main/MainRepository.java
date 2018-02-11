package teo.example.com.data.repository.main;

import javax.inject.Inject;

import teo.example.com.data.api.MoviesService;
import teo.example.com.data.database.dao.PopularDao;
import teo.example.com.features.main.MainMVP;

/**
 * Concrete implementation to load movies from the data sources.
 */

public class MainRepository implements MainMVP.Model {

    private MoviesService service;
    private PopularDao dao;

    @Inject
    public MainRepository(MoviesService service, PopularDao dao) {
        this.service = service;
        this.dao = dao;
    }

    @Override
    public void loadData() {

    }
}
