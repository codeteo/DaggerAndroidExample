package teo.example.com.data.repository.main;

import javax.inject.Inject;

import io.reactivex.Single;
import teo.example.com.data.repository.main.entities.PopularMovie;
import teo.example.com.features.main.MainMVP;
import teo.example.com.utils.schedulers.BaseSchedulerProvider;

/**
 * Concrete implementation to load movies from the data sources.
 */

public class MainRepository implements MainMVP.Model {

    private MainRemoteDataSource remoteDataSource;
    private MainLocalDataSource localDataSource;
    private BaseSchedulerProvider schedulerProvider;

    @Inject
    MainRepository(MainRemoteDataSource remoteDataSource, MainLocalDataSource localDataSource,
                   BaseSchedulerProvider schedulerProvider) {
        this.remoteDataSource = remoteDataSource;
        this.localDataSource = localDataSource;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    public Single<PopularMovie> loadData() {
        return null;
    }
}
