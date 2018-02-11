package teo.example.com.data.repository.main;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import teo.example.com.data.api.MoviesService;
import teo.example.com.data.repository.main.entities.PopularMovie;
import teo.example.com.features.main.MainMVP;

/**
 * Implementation of a remote data source for popular movies feature.
 */

public class MainRemoteDataSource implements MainMVP.Model {

    private static final String API_KEY = "api_key";

    private MoviesService service;
    private String apiKey;

    @Inject
    public MainRemoteDataSource(MoviesService service, @Named(API_KEY) String apiKey) {
        this.service = service;
        this.apiKey = apiKey;
    }

    @Override
    public Observable<PopularMovie> loadData() {
        return null;
    }
}
