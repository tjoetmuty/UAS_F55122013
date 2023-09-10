package com.example.uas_f55122013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class project1 extends AppCompatActivity {

    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);

        title =findViewById(R.id.title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(project1.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}