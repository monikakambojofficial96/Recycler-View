package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.activity_main_recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] fruitsNames = {"Apple", "Orange", "Banana", "Watermelon", "Kiwi", "Grapes", "Mango", "Cucumbers", "Bluebarry", "Cherry", "Apricot", "Guava", "Dates"};
        Integer[] imageId = {R.drawable.apple, R.drawable.orange, R.drawable.banana, R.drawable.watermelon, R.drawable.kiwi, R.drawable.grapes, R.drawable.mango, R.drawable.cucumbers, R.drawable.blueberry,
                R.drawable.cherry, R.drawable.apricot, R.drawable.guava, R.drawable.dates};

        recyclerView.setAdapter(new FruitsAdapter(fruitsNames, imageId));

    }
}
