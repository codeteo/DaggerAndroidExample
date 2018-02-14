package teo.example.com.features.main.dagger;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import teo.example.com.dagger.scopes.FragmentScope;
import teo.example.com.data.api.MoviesService;
import teo.example.com.data.database.dao.PopularDao;
import teo.example.com.data.repository.main.mappers.PopularMovieEntityMapper;
import teo.example.com.data.repository.main.mappers.PopularMovieModelMapper;
import teo.example.com.data.repository.main.sources.local.MainLocalDataSource;
import teo.example.com.data.repository.main.sources.remote.MainRemoteDataSource;
import teo.example.com.features.main.utils.PopularMovieMapper;

import static teo.example.com.utils.Qualifiers.API_KEY;

/**
 * Dagger module building data source dependencies.
 */

@Module
class MainDataSourceModule {

    @Provides
    @FragmentScope
    MainLocalDataSource providesMainLocalDataSource(PopularDao dao, PopularMovieEntityMapper mapper,
                                                    PopularMovieModelMapper popularMapper) {
        return new MainLocalDataSource(dao, mapper, popularMapper);
    }

    @Provides
    @FragmentScope
    MainRemoteDataSource providesMainRemoteDataSource(MoviesService service, @Named(API_KEY) String apiKey,
                                                      PopularMovieMapper mapper) {
        return new MainRemoteDataSource(service, apiKey, mapper);
    }

}
