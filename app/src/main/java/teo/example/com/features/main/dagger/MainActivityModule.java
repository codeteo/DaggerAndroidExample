package teo.example.com.features.main.dagger;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import teo.example.com.dagger.scopes.ActivityScope;
import teo.example.com.dagger.scopes.FragmentScope;
import teo.example.com.features.main.MainFragment;
import teo.example.com.features.main.MainMVP;
import teo.example.com.features.main.MainPresenter;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link MainPresenter}.
 */

@Module
public abstract class MainActivityModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = MainDataSourceModule.class)
    abstract MainFragment providesMainFragment();

    @ActivityScope
    @Binds
    abstract MainMVP.Presenter bindsMainFragment(MainPresenter presenter);
}
