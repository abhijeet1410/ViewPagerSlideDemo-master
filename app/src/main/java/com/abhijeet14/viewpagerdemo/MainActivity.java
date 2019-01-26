package com.abhijeet14.viewpagerdemo;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = findViewById(R.id.viewpager);
        pager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));

    }

    private class MyViewPagerAdapter extends FragmentPagerAdapter {
        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos){
                case 0:
                    return FragmentViewPager.newInstance(getString(R.string.title_section1),R.drawable.white_tshirt);
                case 1:
                    return FragmentViewPager.newInstance(getString(R.string.title_section2),R.drawable.black_tshirt);
                case 2:
                    return FragmentViewPager.newInstance(getString(R.string.title_section3),R.drawable.grey_tshirt);
                default:
                    return FragmentViewPager.newInstance(getString(R.string.title_section1),R.drawable.white_tshirt);
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
