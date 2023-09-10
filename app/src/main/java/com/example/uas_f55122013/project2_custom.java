package com.example.uas_f55122013;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class project2_custom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2_custom);

        TextView simpelText = (TextView) findViewById(R.id.simple);
        simpelText.setText("That is a simple TextView");
    }
}