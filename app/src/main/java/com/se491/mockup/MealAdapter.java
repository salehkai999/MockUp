package com.se491.mockup;

import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MealAdapter extends RecyclerView.Adapter<MealViewHolder> {

    private static final String TAG = "MealAdapter";
    ArrayList<Meal> mealArrayList;
    MainActivity mainActivity;

    public MealAdapter(ArrayList<Meal> mealArrayList, MainActivity mainActivity) {
        this.mealArrayList = mealArrayList;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public MealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.meal_list_item, parent, false);
        itemView.setOnClickListener(mainActivity);
        itemView.setOnLongClickListener(mainActivity);
        return new MealViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MealViewHolder holder, int position) {

        Meal meal = mealArrayList.get(position);
        holder.calories.setText(String.valueOf(meal.getCalories()));
        holder.title.setText(meal.getName());
        ImageView img = holder.img;
        Picasso.get().load(meal.getImgUrl())
                .into(img,
                        new Callback() {
                            @Override
                            public void onSuccess() {
                                Log.d(TAG, "onSuccess: ");
                            }

                            @Override
                            public void onError(Exception e) {
                                Log.d(TAG, "onError: " + e.getMessage());
                            }
                        });

    }

    @Override
    public int getItemCount() {
        return mealArrayList.size();
    }
}
