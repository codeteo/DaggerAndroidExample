package teo.example.com.features.main;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;
import teo.example.com.dagger.scopes.ActivityScope;

/**
 * Main view of the app presented to user.
 * Displays a grid of images.
 */

@ActivityScope
public class MainFragment extends DaggerFragment implements MainMVP.View {

    @Inject
    MainMVP.Presenter presenter;

    @Inject
    public MainFragment() {
        // Requires empty public constructor
    }

    @Override
    public void showData() {

    }
}
