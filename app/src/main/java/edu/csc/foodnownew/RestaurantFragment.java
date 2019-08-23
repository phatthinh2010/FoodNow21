package edu.csc.foodnownew;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment implements RestaurantAdapter.OnRestaurantItemClickListener {

    RecyclerView rvRestaurants;
    RestaurantAdapter restaurantAdapter;
    ArrayList<Restaurant> restaurants;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        restaurants = Restaurant.getMockData();
        rvRestaurants = view.findViewById(R.id.rvRestaurants);
        restaurantAdapter = new RestaurantAdapter(restaurants, this);
        rvRestaurants.setAdapter(restaurantAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvRestaurants.setLayoutManager(layoutManager);
        return view;
    }

    @Override
    public void onRestaurantItemClick(Restaurant restaurant) {

    }
}
