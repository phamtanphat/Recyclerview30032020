package com.example.recyclerview30032020;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {
    // Kieu du lieu dang mang la duoc
    private List<Food> mFoodList;

    public FoodAdapter(List<Food> mFoodList) {
        this.mFoodList = mFoodList;
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Truyen layout vao de khoi tao ra FoodHolder
        // Can truyen item_food
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_food, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        // Lay du lieu cho tung dong
        Food food = mFoodList.get(position);
        holder.tvName.setText(food.getName());
        holder.tvAddress.setText(food.getAddress());
        holder.tvPrice.setText(food.getPrice() + "D");
        holder.img.setImageResource(food.getImage());
    }

    // Hien thi so luong dong trong danh sach
    @Override
    public int getItemCount() {
        return mFoodList != null ? mFoodList.size() : 0;
    }

    class FoodHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvName, tvPrice, tvAddress;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageFood);
            tvName = itemView.findViewById(R.id.textviewName);
            tvPrice = itemView.findViewById(R.id.textviewPrice);
            tvAddress = itemView.findViewById(R.id.textviewAddress);
            tvName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Log.d("BBB","Layout position " + getLayoutPosition());
//                    Khi muon lay index cua viewholder o vi tri hien tai :
//                    Toast.makeText(v.getContext(), mFoodList.get(getLayoutPosition()).getName(), Toast.LENGTH_SHORT).show();

                }
            });
        }
    }
}
