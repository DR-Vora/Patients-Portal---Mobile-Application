package com.example.mad_project_gender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LabTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test);

        CardView exit = findViewById(R.id.cardLabTestExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestActivity.this, HomeActivity.class));
                Toast.makeText(getApplicationContext(), "Gareeb", Toast.LENGTH_SHORT).show();
            }
        });

        CardView phy = findViewById(R.id.cardBloodTest);
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LabTestActivity.this,LabDetailsActivity.class);
                it.putExtra("tittle","Blood Test");
                startActivity(it);
            }
        });

        CardView die = findViewById(R.id.cardBiopsy);
        die.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LabTestActivity.this,LabDetailsActivity.class);
                it.putExtra("tittle","Biopsy");
                startActivity(it);
            }
        });

        CardView den = findViewById(R.id.cardSkinTest);
        den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LabTestActivity.this,LabDetailsActivity.class);
                it.putExtra("tittle","Skin Test");
                startActivity(it);
            }
        });

        CardView sur = findViewById(R.id.cardBodyfluid);
        sur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LabTestActivity.this,LabDetailsActivity.class);
                it.putExtra("tittle","Body Fluid");
                startActivity(it);
            }
        });

        CardView car = findViewById(R.id.cardAntibody);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LabTestActivity.this,LabDetailsActivity.class);
                it.putExtra("tittle","Antibody");
                startActivity(it);
            }
        });
    }

}