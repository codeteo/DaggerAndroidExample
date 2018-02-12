package teo.example.com.features.main.dagger;

import dagger.Binds;
import dagger.Module;
import teo.example.com.common.mappers.Mapper;
import teo.example.com.data.api.entities.MoviesNestedItemResultsResponse;
import teo.example.com.data.repository.main.entities.PopularMovie;
import teo.example.com.features.main.utils.PopularMovieMapper;

@Module
abstract class PopularMovieMapperModule {

    @Binds
    abstract Mapper<MoviesNestedItemResultsResponse, PopularMovie> providesPopularMovieMapper(PopularMovieMapper mapper);

}
