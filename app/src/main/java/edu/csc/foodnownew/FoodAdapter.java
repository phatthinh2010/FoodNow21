package edu.csc.foodnownew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    public interface OnFoodItemClickListener {
        void onFoodItemClick(Food food);
    }

    private List<Food> mFoods;
    private OnFoodItemClickListener mListener;

    public FoodAdapter(List<Food> mFoods, OnFoodItemClickListener mListener) {
        this.mFoods = mFoods;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_food, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Food food = mFoods.get(position);
        holder.tvName.setText(food.name);
        holder.ivImage.setImageResource(food.image);
        holder.tvPrice.setText(food.price + " VND");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onFoodItemClick(food);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mFoods.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvPrice;
        ImageView ivImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            ivImage = itemView.findViewById(R.id.ivImage);
            tvPrice = itemView.findViewById(R.id.tvPrice);

        }
    }

}
