package com.josepvictorr.tugas_uts_akb_genap_2021_if9_10118369;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    // 2 Juni 2021 - 10118369 - Josep Victor Rajadoli - IF 9

    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    private ViewPageAdapter viewPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    getSupportActionBar().setTitle("Note App");
    //menampilkan halaman yang pertama muncul
    getFragmentPage(new ProfileFragment());

    //insialisasi bottom nav
    bottomNavigationView = findViewById(R.id.bottomNavigationView);
    bottomNavigationView.setOnNavigationItemSelectedListener(this);

    viewPager = findViewById(R.id.view_pager);
    viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());
    viewPager.setAdapter(viewPageAdapter);

    viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            switch (position){
                case
                    0:
                    bottomNavigationView.getMenu().findItem(R.id.info).setChecked(true);
                break;
                case
                    1:
                    bottomNavigationView.getMenu().findItem(R.id.note).setChecked(true);
                break;
                case
                    2:
                    bottomNavigationView.getMenu().findItem(R.id.profile).setChecked(true);
                break;
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    });
}

    //menampilkan halaman fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.page_container, fragment);
            ft.commit();
            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.info:
                viewPager.setCurrentItem(0);
                break;
            case R.id.note:
                viewPager.setCurrentItem(1);
                break;
            case R.id.profile:
                viewPager.setCurrentItem(2);
                break;
        }
        return true;
    }
}