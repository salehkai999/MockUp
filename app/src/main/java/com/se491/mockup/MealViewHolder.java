package com.se491.mockup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MealViewHolder extends RecyclerView.ViewHolder{

    TextView title;
    TextView calories;
    ImageView img;


    public MealViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.titleId);
        calories = itemView.findViewById(R.id.caloriesNum);
        img = itemView.findViewById(R.id.imageView);
    }
}
