package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity extends AppCompatActivity implements RecyclerViewClickInterface{

    public List<ModelFruits> modelList = new ArrayList<>();
    public TextView tvFruitsName;
    public ImageView ivFruitsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFruitsName=findViewById(R.id.activity_main_tv_view);
        ivFruitsImage=findViewById(R.id.activity_main_iv_image);

        RecyclerView recyclerView = findViewById(R.id.activity_main_recycler_view);
        modelData();
        FruitsAdapter fruitsAdapter=new FruitsAdapter(modelList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(fruitsAdapter);


    }

    private void modelData() {

        ModelFruits model=new ModelFruits("Apple",R.raw.apple);
        modelList.add(model);
        model=new ModelFruits("Orange",R.raw.orange);
        modelList.add(model);
        model=new ModelFruits("Banana",R.raw.banana);
        modelList.add(model);
        model=new ModelFruits("Watermelon",R.raw.watermelon);
        modelList.add(model);
        model=new ModelFruits("Kiwi",R.raw.kiwi);
        modelList.add(model);
        model=new ModelFruits("Grapes",R.raw.grapes);
        modelList.add(model);
        model=new ModelFruits("Mango",R.raw.mango);
        modelList.add(model);
        model=new ModelFruits("Cucumbers",R.raw.cucumbers);
        modelList.add(model);
        model=new ModelFruits("Blueberry",R.raw.blueberry);
        modelList.add(model);
        model=new ModelFruits("Cherry",R.raw.cherry);
        modelList.add(model);
        model=new ModelFruits("Apricot",R.raw.apricot);
        modelList.add(model);
        model=new ModelFruits("Guava",R.raw.guava);
        modelList.add(model);
        model=new ModelFruits("Dates",R.raw.dates);
        modelList.add(model);
    }

     @Override
     public void onItemClicked(int position) {
       ivFruitsImage.setImageResource(modelList.get(position).imageId);
       tvFruitsName.setText(modelList.get(position).fruitsNames);

     }
 }



