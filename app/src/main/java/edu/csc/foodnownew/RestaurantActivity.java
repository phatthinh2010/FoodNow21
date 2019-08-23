package edu.csc.foodnownew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity implements FoodAdapter.OnFoodItemClickListener {

    TextView tvName, tvAddress, tvOpenHours;
    ImageView ivCover;
    RecyclerView rvFoods;
    FoodAdapter foodAdapter;
    Restaurant restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        restaurant = new Restaurant("7 Eleven", R.drawable.ic_seveneleven, R.drawable.cover_menu_1, "82 Nguyen Thi Minh Khai, Phuong 6, Quan 3", "6:00 - 23:00");
        ArrayList<Food> foods = Food.getMockData();
        restaurant.setMenu(foods);
        rvFoods = findViewById(R.id.rvFoods);
        foodAdapter = new FoodAdapter(restaurant.menu, this);
        rvFoods.setAdapter(foodAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvFoods.setLayoutManager(layoutManager);

        tvName = findViewById(R.id.tvName);
        tvAddress = findViewById(R.id.tvAddress);
        tvOpenHours = findViewById(R.id.tvOpenHours);
        ivCover = findViewById(R.id.ivCover);
        tvName.setText(restaurant.name);
        tvAddress.setText(restaurant.address);
        tvOpenHours.setText(restaurant.getOpenHours());
        ivCover.setImageResource(R.drawable.cover_menu_1);

    }


    @Override
    public void onFoodItemClick(Food food) {

    }
}
