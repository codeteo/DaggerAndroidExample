package teo.example.com.features.main;

import io.reactivex.Observable;
import teo.example.com.data.repository.main.entities.PopularMovie;

/**
 * Contract class for {@link MainActivity}.
 */

public interface MainMVP {

    interface View {

        void showData();

    }

    interface Presenter {

        void onLoadData();

    }

    interface Model {

        Observable<PopularMovie> loadData();

    }



}
