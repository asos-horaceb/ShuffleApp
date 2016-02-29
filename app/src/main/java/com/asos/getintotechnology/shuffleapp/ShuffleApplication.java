package com.asos.getintotechnology.shuffleapp;

import android.app.Application;

import com.asos.getintotechnology.shuffleapp.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christos.oikonomou on 25/02/2016.
 */
public class ShuffleApplication extends Application {

    public static List<Product> savedProducts = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
