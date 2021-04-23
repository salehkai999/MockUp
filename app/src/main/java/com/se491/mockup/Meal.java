package com.se491.mockup;

import android.util.Log;

public class Meal {
    private static final String TAG = "Meal";
    private String name;
    private int calories;
    private String imgUrl;

    public Meal() {
        Log.d(TAG, "Meal: Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
