package com.example.mad_project_gender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Indexpage extends AppCompatActivity {

    Button btn1 , btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indexpage);

        btn1 = findViewById(R.id.buttonloginindex);
        btn2 = findViewById(R.id.buttonregisterindex);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Indexpage.this, LoginActivity2.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Indexpage.this, RegisterActivity.class));
            }
        });

    }
}