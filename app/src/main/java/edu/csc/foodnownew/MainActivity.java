package edu.csc.foodnownew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private TabLayout tabLayout;
    RestaurantFragment frgRestaurant;
    OrderFragment frgOrder;
    ProfileFragment frgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        createTabs();
        tabLayout.addOnTabSelectedListener(this);

        frgRestaurant = new RestaurantFragment();
        frgOrder = new OrderFragment();
        frgProfile = new ProfileFragment();

        displayFragment(frgRestaurant);


    }

    private void createTabs() {
        TextView tabHome = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_custom_tab, null);
        tabHome.setText(getString(R.string.text_home));
        tabHome.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icon_home, 0, 0);
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.getTabAt(0).setCustomView(tabHome);

        TextView tabOrder = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_custom_tab, null);
        tabOrder.setText(getString(R.string.text_order));
        tabOrder.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icon_order, 0, 0);
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.getTabAt(1).setCustomView(tabOrder);

        TextView tabProfile = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_custom_tab, null);
        tabProfile.setText(getString(R.string.text_profile));
        tabProfile.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icon_profile, 0, 0);
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.getTabAt(2).setCustomView(tabProfile);

    }

    private void displayFragment(Fragment fragment) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layoutContainer, fragment);
        ft.commit();

    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        int tabPos = tab.getPosition();
        switch (tabPos) {
            case 0: // Home
                displayFragment(frgRestaurant);
                break;
            case 1: // Order
                displayFragment(frgOrder);
                break;
            case 2: // Profile
                displayFragment(frgProfile);
                break;

        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
