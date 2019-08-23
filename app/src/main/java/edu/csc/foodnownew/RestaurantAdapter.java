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

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    public interface OnRestaurantItemClickListener{
        void onRestaurantItemClick(Restaurant restaurant);
    }

    private List<Restaurant> mRestaurants;
    private OnRestaurantItemClickListener mListener;

    public RestaurantAdapter(List<Restaurant> mRestaurants, OnRestaurantItemClickListener mListener) {
        this.mRestaurants = mRestaurants;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_restaurant, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Restaurant restaurant = mRestaurants.get(position);
        holder.tvName.setText(restaurant.name);
        holder.ivImage.setImageResource(restaurant.logo);
        holder.tvAddress.setText(restaurant.address);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onRestaurantItemClick(restaurant);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

       TextView tvName, tvAddress;
       ImageView ivImage;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);

           tvName = itemView.findViewById(R.id.tvName);
           ivImage = itemView.findViewById(R.id.ivImage);
           tvAddress = itemView.findViewById(R.id.tvAddress);

       }
   }

}
