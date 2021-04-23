package com.se491.mockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private RecyclerView recyclerView;
    private ArrayList<Meal> mealArrayList = new ArrayList<>();
    private MealAdapter mealAdapter;
    private static final String imageURL = "https://www.heynutritionlady.com/wp-content/uploads/2018/01/winter_vegetable_meal_prep_bowls.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        mealAdapter = new MealAdapter(mealArrayList,this);
        recyclerView.setAdapter(mealAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for(int i=0;i<5;i++){
            Meal m = new Meal();
            m.setName("Meal #"+(i+1));
            m.setCalories(350);
            m.setImgUrl(imageURL);
            mealArrayList.add(m);
        }

    }

    @Override
    public void onClick(View v) {
        int pos = recyclerView.getChildAdapterPosition(v);
        Meal m = mealArrayList.get(pos);
        Toast.makeText(this, m.getName(), Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(this, "LONG CLICK", Toast.LENGTH_SHORT).show();
        return false;
    }
}