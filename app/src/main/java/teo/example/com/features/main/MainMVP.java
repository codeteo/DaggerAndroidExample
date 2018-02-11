package teo.example.com.features.main;

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

        void loadData();

    }



}
