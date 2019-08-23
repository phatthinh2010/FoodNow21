package edu.csc.foodnownew;

import java.util.ArrayList;

public class Restaurant {
    String name;
    int logo;
    int cover;
    String address;
    String openHours;
    ArrayList<Food> menu;

    public Restaurant(String name, int logo, int cover, String address, String openHours) {
        this.name = name;
        this.logo = logo;
        this.cover = cover;
        this.address = address;
        this.openHours = openHours;
    }

    public void setMenu(ArrayList<Food> menu) {
        this.menu = menu;
    }

    public String getOpenHours() {
        return "Open Hours: " + openHours;
    }

    public static ArrayList<Restaurant> getMockData() {

        ArrayList<Restaurant> restaurants = new ArrayList<>();
        String[] names = {"Circle K", "Highland Coffee", "MiniStop", "7 Eleven", "VinMart"};
        int[] logos = {R.drawable.ic_circlek, R.drawable.ic_highland, R.drawable.ic_ministop, R.drawable.ic_seveneleven, R.drawable.ic_vinmart};
        int[] covers = {R.drawable.ic_circlek, R.drawable.ic_highland, R.drawable.ic_ministop, R.drawable.ic_seveneleven, R.drawable.ic_vinmart};
        String[] addresses = {"40 Hung Vuong", "30 Nguyen Van Cu", "70 Ly Thai To", "82 Nguyen Thi Minh Khai", "22 Pham Viet Chanh"};
        String[] openHours = {"8:00 - 22:30", "8:00 - 22:30", "8:00 - 22:30", "8:00 - 22:30", "8:00 - 22:30"};
        for (int i = 0; i < names.length; i++) {
            Restaurant restaurant = new Restaurant(names[i], logos[i], covers[i], addresses[i], openHours[i]);
            restaurants.add(restaurant);
        }
        return restaurants;

    }
}

