package com.example.portfolio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation extends AppCompatActivity implements  BottomNavigationView.OnNavigationItemSelectedListener {

    Context context = this;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        fragmentManager = getSupportFragmentManager();
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        bottom_navigation = findViewById(R.id.bottom_navigation);
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framLayout, fragment1).commitAllowingStateLoss();
        bottom_navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        transaction = fragmentManager.beginTransaction();
        switch (item.getItemId()){
            case R.id.page_1:
                transaction.replace(R.id.framLayout, fragment1).commitAllowingStateLoss();
                Log.d("","프레그먼트 1 ");
                return true;
            case R.id.page_2:
                transaction.replace(R.id.framLayout, fragment2).commitAllowingStateLoss();
                Log.d("","프레그먼트 2 ");
                return true;
            case R.id.page_3:
                transaction.replace(R.id.framLayout, fragment3).commitAllowingStateLoss();
                Log.d("","프레그먼트 3 ");
                return true;

        }
        return false;
    }
}