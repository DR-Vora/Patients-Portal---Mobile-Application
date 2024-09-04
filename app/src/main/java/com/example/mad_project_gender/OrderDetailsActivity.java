package com.example.mad_project_gender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class OrderDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        CardView exit = findViewById(R.id.cardperExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderDetailsActivity.this, HomeActivity.class));
            }
        });

        CardView phy = findViewById(R.id.cardLabP);
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(OrderDetailsActivity.this,CheckoutActivity.class);
                it.putExtra("tittle","LAB RECORDS");
                startActivity(it);
            }
        });

        CardView die = findViewById(R.id.cardMedicinep);
        die.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(OrderDetailsActivity.this,CheckoutActivity.class);
                it.putExtra("tittle","MEDICINE RECORDS");
                startActivity(it);
            }
        });

        CardView den = findViewById(R.id.cardAppointmentp);
        den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(OrderDetailsActivity.this,CheckoutActivity.class);
                it.putExtra("tittle","APPOINTMENT RECORDS");
                startActivity(it);
            }
        });

    }
}