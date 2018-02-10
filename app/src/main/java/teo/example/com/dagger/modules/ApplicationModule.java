package teo.example.com.dagger.modules;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import teo.example.com.MyApplication;
import teo.example.com.data.preferences.SharedPreferencesManagerImpl;

/**
 * Dagger Module with application(singleton) scoped dependencies.
 */


@Module
public class ApplicationModule {

    @Provides
    @Singleton
    Context providesContext(MyApplication application) {
        return application.getApplicationContext();
    }

    @Provides
    @Singleton
    SharedPreferencesManagerImpl provideSharedPreferences(Application application) {
        return new SharedPreferencesManagerImpl(application);
    }

}