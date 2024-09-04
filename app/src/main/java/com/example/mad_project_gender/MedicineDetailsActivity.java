package com.example.mad_project_gender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MedicineDetailsActivity extends AppCompatActivity {

    TextView tv;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_details);

        tv=findViewById(R.id.textviewmedDTittle);
        Intent it= getIntent();
        String t=it.getStringExtra("tittle");
        tv.setText(t);

        btn1=findViewById(R.id.buttonmedDBack);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MedicineDetailsActivity.this, BuyMedicinsActivity.class));
            }
        });

        String[] s = new String[0];

        ListView l;
        if (t.compareTo("General")==0){
            s = new String[]{"General Med", "Raitings : 4.5", "paisa:1000000", "Available : 35"};
        }

        else if (t.compareTo("Allergic")==0) {
            s = new String[]{"Allergic", "Raitings : 5", "paisa:1000000", "Available : 85"};
        }

        else if (t.compareTo("Skin")==0) {
            s = new String[]{"Skin", "Raitings : 4.3", "paisa:1000000", "Available : 325"};
        }

        else if (t.compareTo("Covid")==0) {
            s = new String[]{"Covid", "Raitings: 4.9", "paisa:1000000", "Available : 45"};
        }

        else if (t.compareTo("Antibody")==0) {
            s = new String[]{"Antibody", "Raitings : 4.2", "paisa:10,000", "Available : 33" };
        }

        l=findViewById(R.id.ListviewmedD);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,s);
        l.setAdapter(arr);

        btn2=findViewById(R.id.buttonAddtoCart);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MedicineDetailsActivity.this, BuyMedicinsActivity.class));
                Toast.makeText(getApplicationContext(), "Added To The Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}