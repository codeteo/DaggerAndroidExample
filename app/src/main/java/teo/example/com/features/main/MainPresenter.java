package teo.example.com.features.main;

import javax.inject.Inject;

import teo.example.com.data.repository.main.MainRepository;

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

    }
}
