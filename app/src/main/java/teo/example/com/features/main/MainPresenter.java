package teo.example.com.features.main;

import javax.inject.Inject;

/**
 * Listens to user actions from the UI ({@link MainFragment}), retrieves the data and updates the
 * UI as required.
 */

public class MainPresenter implements MainMVP.Presenter {

    @Inject
    public MainPresenter() {
    }

    @Override
    public void onLoadData() {

    }
}
