package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitsAdapter extends RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>{

  private List<Model> modelList;

   @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public FruitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from ( parent.getContext () );
        View view=layoutInflater.inflate (R.layout.recycler_view_layout,parent,false  );
        return new FruitsViewHolder ( view );
    }

    public FruitsAdapter(List<Model> modelList){
      this.modelList=modelList;
    }


    @Override
    public void onBindViewHolder(@NonNull FruitsViewHolder holder, int position) {

        Model model=modelList.get(position);
      holder.tvFruits.setText ( model.fruitsNames );
      holder.ivView.setImageResource ( model.imageId);

    }

    @Override
    public int getItemCount() {
       return modelList.size();
    }

    public class FruitsViewHolder extends RecyclerView.ViewHolder{

      ImageView ivView;
      TextView tvFruits;

        public FruitsViewHolder(@NonNull View itemView) {
            super ( itemView );
            ivView =itemView.findViewById ( R.id.activity_recycler_view_layout_image_view );
            tvFruits=itemView.findViewById ( R.id.activity_recycler_view_layout_tvfruits_name );

        }
    }

}
