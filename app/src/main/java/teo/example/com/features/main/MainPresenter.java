package teo.example.com.features.main;

import android.util.Log;

import javax.inject.Inject;

import teo.example.com.data.repository.main.MainRepository;
import timber.log.Timber;

/**
 * Listens to user actions from the UI ({@link MainFragment}), retrieves the data and updates the
 * UI as required.
 */

public class MainPresenter implements MainMVP.Presenter {

    private MainRepository repository;

    @Inject
    MainPresenter(MainRepository repository) {
        this.repository = repository;
    }

    @Override
    public void onLoadData() {
        repository.loadData()
                .subscribe(
                        movies -> Timber.i("MESA STO MOVIES"),
                        throwable -> Log.i("MAIN-PRESENTER", "onLoadData "));
    }
}
