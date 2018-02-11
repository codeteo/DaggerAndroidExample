package teo.example.com.dagger.modules;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import teo.example.com.Constants;
import teo.example.com.MyApplication;
import teo.example.com.data.preferences.SharedPreferencesManagerImpl;
import teo.example.com.utils.BaseUrlInterceptor;

/**
 * Dagger Module with application(singleton) scoped dependencies.
 */


@Module
public class ApplicationModule {

    private static final HttpUrl PRODUCTION_API_BASE_URL = HttpUrl.parse(Constants.BASE_URL);

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

    @Provides
    @Singleton
    HttpUrl providesBaseUrl() {
        return PRODUCTION_API_BASE_URL;
    }

    @Provides
    @Singleton
    static BaseUrlInterceptor providesBaseUrlInterceptor(HttpUrl baseUrl) {
        return new BaseUrlInterceptor(baseUrl.toString());
    }

}