package com.example.uas_f55122013;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class project2_list extends AppCompatActivity {

    String[] mobileArray = {"Android", "Iphone", "WindowsMobile", "Blackberry", "WebOS", "Windows7", "Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2_list);

    }
}