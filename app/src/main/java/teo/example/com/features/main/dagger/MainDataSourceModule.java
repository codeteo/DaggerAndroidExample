package teo.example.com.features.main.dagger;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import teo.example.com.dagger.scopes.FragmentScope;
import teo.example.com.data.api.MoviesService;
import teo.example.com.data.database.dao.PopularDao;
import teo.example.com.data.repository.main.MainLocalDataSource;
import teo.example.com.data.repository.main.MainRemoteDataSource;

import static teo.example.com.utils.Qualifiers.API_KEY;

/**
 * Dagger module building data source dependencies.
 */

@Module
public class MainDataSourceModule {

    @Provides
    @FragmentScope
    MainLocalDataSource providesMainLocalDataSource(PopularDao dao) {
        return new MainLocalDataSource(dao);
    }

    @Provides
    @FragmentScope
    MainRemoteDataSource providesMainRemoteDataSource(MoviesService service, @Named(API_KEY) String apiKey) {
        return new MainRemoteDataSource(service, apiKey);
    }

}
