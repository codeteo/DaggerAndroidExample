package teo.example.com.data.api;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
import teo.example.com.data.api.entities.MoviesResponse;

/**
 * Retrofit service for api calls.
 */

public interface MoviesService {

    @GET("movie/popular")
    Single<MoviesResponse> getMostPopular(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    Single<MoviesResponse> getTopRated(@Query("api_key") String apiKey);

}

