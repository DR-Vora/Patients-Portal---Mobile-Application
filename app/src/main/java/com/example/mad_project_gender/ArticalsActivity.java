package com.example.mad_project_gender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ArticalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articals);

        CardView exit = findViewById(R.id.cardartExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticalsActivity.this, HomeActivity.class));
            }
        });

        CardView fd = findViewById(R.id.cardh1);
        fd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticalsActivity.this,h1Activity.class));
            }
        });

        CardView lt = findViewById(R.id.cardh2);
        lt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticalsActivity.this,h2Activity.class));
            }
        });

        CardView bm = findViewById(R.id.cardh3);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticalsActivity.this,h3Activity.class));
            }
        });

        CardView od = findViewById(R.id.cardh4);
        od.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticalsActivity.this,h4Activity.class));
            }
        });

        CardView hd = findViewById(R.id.cardh5);
        hd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticalsActivity.this,h5Activity.class));
            }
        });
    }
}