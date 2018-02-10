package teo.example.com.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import teo.example.com.MyApplication;
import teo.example.com.dagger.modules.ApplicationModule;

/**
 * This ia a Dagger component.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationModule.class
})
public interface ApplicationComponent extends AndroidInjector<MyApplication> {

    // Gives us syntactic sugar. We can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    interface Builder {

        @BindsInstance
        ApplicationComponent.Builder application(Application application);

        ApplicationComponent build();
    }

}
