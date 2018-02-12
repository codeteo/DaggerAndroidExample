package teo.example.com.data.repository.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import retrofit2.Response;
import teo.example.com.data.api.MoviesService;
import teo.example.com.data.api.entities.MoviesNestedItemResultsResponse;
import teo.example.com.data.api.entities.MoviesResponse;
import teo.example.com.data.repository.main.entities.PopularMovie;
import teo.example.com.features.main.MainMVP;
import teo.example.com.features.main.utils.PopularMovieMapper;

import static teo.example.com.utils.Qualifiers.API_KEY;

/**
 * Implementation of a remote data source for popular movies feature.
 */

public class MainRemoteDataSource implements MainMVP.Model {

    private MoviesService service;
    private String apiKey;
    private PopularMovieMapper mapper;

    @Inject
    public MainRemoteDataSource(MoviesService service, @Named(API_KEY) String apiKey,
                                PopularMovieMapper mapper) {
        this.service = service;
        this.apiKey = apiKey;
        this.mapper = mapper;
    }

    @Override
    public Observable<List<PopularMovie>> loadData() {
        return service.getMostPopular(apiKey)
                .map(this::movieMapper)
                .toObservable();
    }

    private List<PopularMovie> movieMapper(Response<MoviesResponse> response) {
        if (response.isSuccessful()) {
            MoviesResponse body = response.body();
            if (body != null) {
                List<PopularMovie> popularMovies = new ArrayList<>();
                for (MoviesNestedItemResultsResponse movie: body.getResults()){
                    PopularMovie popularMovie = mapper.transform(movie);
                    popularMovies.add(popularMovie);
                }
                return popularMovies;
            } else {
                return Collections.emptyList();
            }
        } else {
            return Collections.emptyList();
        }
    }
}
