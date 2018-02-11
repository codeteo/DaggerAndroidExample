package teo.example.com.features.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerFragment;
import teo.example.com.R;
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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);

        presenter.onLoadData();

        return view;
    }

    @Override
    public void showData() {

    }
}
