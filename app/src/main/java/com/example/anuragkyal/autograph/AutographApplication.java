package com.example.anuragkyal.autograph;

import android.app.Application;
import timber.log.Timber;

public class AutographApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

}
