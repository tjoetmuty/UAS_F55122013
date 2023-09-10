package com.example.uas_f55122013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView project1;
    private TextView project2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        project1 = findViewById(R.id.project1);
        project1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik =new Intent(MainActivity.this, project1.class);
                startActivity(klik);
            }
        });

        project2 = findViewById(R.id.project2);
        project2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik2 = new Intent(MainActivity.this, project2.class);
                startActivity(klik2);
            }
        });
    }
}