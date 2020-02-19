package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FruitsAdapter extends RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder> {

    private List<ModelFruits> modelList;

    @NonNull
    @Override
    public FruitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_layout, parent, false);
        return new FruitsViewHolder(view);
    }

    FruitsAdapter(List<ModelFruits> modelList) {
        this.modelList = modelList;
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final FruitsAdapter.FruitsViewHolder holder, final int position) {

        final ModelFruits model = modelList.get(position);
        holder.tvFruits.setText(model.fruitsNames);
        holder.ivView.setImageResource(model.imageId);
        holder.cbSelected.setChecked(model.isSelected);

        holder.cbSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.setGetSelected(holder.cbSelected.isChecked());

            }
        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    class FruitsViewHolder extends RecyclerView.ViewHolder {

        ImageView ivView;
        TextView tvFruits;
        CheckBox cbSelected;

        FruitsViewHolder(@NonNull View itemView) {
            super(itemView);
            ivView = itemView.findViewById(R.id.activity_recycler_view_layout_image_view);
            tvFruits = itemView.findViewById(R.id.activity_recycler_view_layout_tvfruits_name);
            cbSelected = itemView.findViewById(R.id.activity_recycler_view_layout_cb_selected);


        }
    }

}
