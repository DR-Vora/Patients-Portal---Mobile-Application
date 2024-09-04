package com.example.mad_project_gender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        CardView exit = findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FindDoctorActivity.this, HomeActivity.class));
            }
        });

        CardView phy = findViewById(R.id.cardFDPhysician);
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("tittle","PHYSICIAN");
                startActivity(it);
            }
        });

        CardView die = findViewById(R.id.cardFDDitecian);
        die.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("tittle","DITECIAN");
                startActivity(it);
            }
        });

        CardView den = findViewById(R.id.cardFDDentist);
        den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("tittle","DENTIST");
                startActivity(it);
            }
        });

        CardView sur = findViewById(R.id.cardFDSurgen);
        sur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("tittle","SURGEN");
                startActivity(it);
            }
        });

        CardView car = findViewById(R.id.cardFDCardiologist);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("tittle","CARDIOLOGIST");
                startActivity(it);
            }
        });
    }
}