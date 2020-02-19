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
    public  int selectedPosition=-1;
    RecyclerViewClickInterface recyclerViewClickInterface;


    @NonNull
    @Override
    public FruitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_layout, parent, false);
        return new FruitsViewHolder(view);
    }

    FruitsAdapter(List<ModelFruits> modelList,RecyclerViewClickInterface recyclerViewClickInterface) {
        this.modelList = modelList;
        this.recyclerViewClickInterface=recyclerViewClickInterface;
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final FruitsAdapter.FruitsViewHolder holder, final int position) {

        final ModelFruits model = modelList.get(position);
        holder.tvFruits.setText(model.fruitsNames);
        holder.ivView.setImageResource(model.imageId);

   //start code for selecting only one item at a time

        holder.cbSelected.setTag(position); // This line is important.

        if (position == selectedPosition) {
            holder.cbSelected.setChecked(true);
        } else {
            holder.cbSelected.setChecked(false);
        }
        holder.cbSelected.setOnClickListener(onStateChangedListener(holder.cbSelected, position));
    }

    private View.OnClickListener onStateChangedListener(final CheckBox checkBox, final int position) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewClickInterface.onItemClicked(position);

                if (checkBox.isChecked()) {
                    selectedPosition = position;
                } else {
                    selectedPosition = -1;
                }

                notifyDataSetChanged();
            }

        };
    }

    //end code for selecting one item at a time

//code for selecting multiple items

//        holder.cbSelected.setChecked(model.isSelected);
//
//        holder.cbSelected.setChecked(holder.cbSelected.isChecked());
//
//
//            holder.cbSelected.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               model.setGetSelected(holder.cbSelected.isChecked());
//
//            }
//        });
   // }

    //end code for multiple items

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
