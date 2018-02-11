package teo.example.com.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import teo.example.com.data.database.dao.PopularDao;
import teo.example.com.data.database.entities.PopularMovieEntity;

/**
 * Room database for persistence storage of data.
 */

@Database(entities = PopularMovieEntity.class, version = 1)
public abstract class MyDatabase extends RoomDatabase {

    public abstract PopularDao dao();

}
