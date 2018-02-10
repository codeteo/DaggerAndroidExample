package teo.example.com.data.preferences;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Implements {@link SharedPreferencesManager} with app scoped
 * preferences.
 */

public class SharedPreferencesManagerImpl implements SharedPreferencesManager {

    private SharedPreferences preferences;

    public SharedPreferencesManagerImpl(Application application) {
        preferences = PreferenceManager.getDefaultSharedPreferences(application);
    }
}
