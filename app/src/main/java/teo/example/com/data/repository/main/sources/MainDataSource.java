package teo.example.com.data.repository.main.sources;

import java.util.List;

import io.reactivex.Observable;
import teo.example.com.data.repository.main.entities.PopularMovie;

/**
 * Contract to be implemented by all data sources
 * for main(popular movies) feature.
 */

public interface MainDataSource {

    Observable<List<PopularMovie>> loadData();

    void saveData(List<PopularMovie> movies);

}
