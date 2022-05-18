package ru.mirea.tereshkin.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Fragment fragment_1, fragment_2;
    private FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment_1 = new Fragment1();
        fragment_2 = new Fragment2();
    }

    public void onClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment_1).commit();

    }

    public void onClick2(View view) {
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment_2).commit();
    }
}