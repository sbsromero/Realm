package com.sbsromero.section_04_room.app;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.facebook.stetho.Stetho;


/**
 * Created by sumset on 1/11/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "tableros").build();
    }

}
