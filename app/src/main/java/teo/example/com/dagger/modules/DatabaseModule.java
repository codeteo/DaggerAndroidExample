package teo.example.com.dagger.modules;

import android.app.Application;
import android.arch.persistence.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import teo.example.com.data.database.MyDatabase;
import teo.example.com.data.database.dao.PopularDao;

/**
 * Dagger Module with database dependencies.
 */

@Module
public class DatabaseModule {

    private static final String DATABASE_NAME = "database.db";

    @Singleton
    @Provides
    MyDatabase providesDatabase(Application context) {
        return Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, DATABASE_NAME)
                .build();
    }

    @Singleton
    @Provides
    PopularDao providesPopularDao(MyDatabase db) {
        return db.dao();
    }

}
