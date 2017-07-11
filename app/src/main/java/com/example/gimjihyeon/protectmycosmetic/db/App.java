package com.example.gimjihyeon.protectmycosmetic.db;

/**
 * Created by gimjihyeon on 2017. 4. 9..
 */

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by gimjihyeon on 16. 10. 27..
 */
public class App extends Application {
    public static Gson gson;

    @Override
    public void onCreate() {
        super.onCreate();
        gson = new GsonBuilder().create();
    }
}
