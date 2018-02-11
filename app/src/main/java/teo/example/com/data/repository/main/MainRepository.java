package teo.example.com.data.repository.main;

import javax.inject.Inject;

import teo.example.com.data.api.MoviesService;
import teo.example.com.features.main.MainMVP;

/**
 * Concrete implementation to load movies from the data sources.
 */

public class MainRepository implements MainMVP.Model {

    private MoviesService service;
    private

    @Inject
    public MainRepository() {
    }

    @Override
    public void loadData() {

    }
}
