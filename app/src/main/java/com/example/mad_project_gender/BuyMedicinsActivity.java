package com.example.mad_project_gender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class BuyMedicinsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicins);

        CardView exit = findViewById(R.id.cardmedicineExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyMedicinsActivity.this, HomeActivity.class));
            }
        });

        CardView phy = findViewById(R.id.cardGeneral);
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BuyMedicinsActivity.this,MedicineDetailsActivity.class);
                it.putExtra("tittle","General");
                startActivity(it);
            }
        });

        CardView die = findViewById(R.id.cardAllergic);
        die.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BuyMedicinsActivity.this,MedicineDetailsActivity.class);
                it.putExtra("tittle","Allergic");
                startActivity(it);
            }
        });

        CardView den = findViewById(R.id.cardSkin);
        den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BuyMedicinsActivity.this,MedicineDetailsActivity.class);
                it.putExtra("tittle","Skin");
                startActivity(it);
            }
        });

        CardView sur = findViewById(R.id.cardCovid);
        sur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BuyMedicinsActivity.this,MedicineDetailsActivity.class);
                it.putExtra("tittle","Covid");
                startActivity(it);
            }
        });

        CardView car = findViewById(R.id.cardAntibodymedicine);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BuyMedicinsActivity.this,MedicineDetailsActivity.class);
                it.putExtra("tittle","Antibody");
                startActivity(it);
            }
        });
    }
}