package teo.example.com.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import teo.example.com.data.database.entities.PopularMovie;

/**
 * Dao class for "popular" movies table.
 */

@Dao
public interface PopularDao {

    /**
     * Select all movies from the "popular" table.
     *
     * @return all popular movies.
     */
    @Query("SELECT * FROM popular")
    List<PopularMovie> getPopularMovies();

}
