package edu.csc.foodnownew;

import java.util.ArrayList;

public class Food {
    String name;
    int image;
    int price;

    public Food(String name, int image, int price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public static ArrayList<Food> getMockData(){

        ArrayList<Food> foods = new ArrayList<>();
        String[] names = {"Black Coffee", "Banh Mi", "Milk Tea"};
        int[] images = {R.drawable.ic_black_coffee, R.drawable.ic_banh_mi, R.drawable.ic_milk_tea};
        int[] prices = {49000, 39000, 59000};
        for (int i = 0; i < names.length; i++) {
            Food food = new Food(names[i], images[i], prices[i]);
            foods.add(food);
        }
        return foods;
    }


}
