package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Model> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.activity_main_recycler_view);
        modelData();

        FruitsAdapter fruitsAdapter=new FruitsAdapter(modelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(fruitsAdapter);

    }

    private void modelData() {

        Model model=new Model("Apple",R.drawable.apple);
        modelList.add(model);
        model=new Model("Orange",R.drawable.orange);
        modelList.add(model);
        model=new Model("Banana",R.drawable.banana);
        modelList.add(model);
        model=new Model("Watermelon",R.drawable.watermelon);
        modelList.add(model);
        model=new Model("Kiwi",R.drawable.kiwi);
        modelList.add(model);
        model=new Model("Grapes",R.drawable.grapes);
        modelList.add(model);
        model=new Model("Mango",R.drawable.mango);
        modelList.add(model);
        model=new Model("Cucumbers",R.drawable.cucumbers);
        modelList.add(model);
        model=new Model("Blueberry",R.drawable.blueberry);
        modelList.add(model);
        model=new Model("Cherry",R.drawable.cherry);
        modelList.add(model);
        model=new Model("Apricot",R.drawable.apricot);
        modelList.add(model);
        model=new Model("Guava",R.drawable.guava);
        modelList.add(model);
        model=new Model("Dates",R.drawable.dates);
        modelList.add(model);
    }


}
