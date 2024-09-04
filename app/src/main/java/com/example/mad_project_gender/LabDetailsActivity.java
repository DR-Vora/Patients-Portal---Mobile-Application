package com.example.mad_project_gender;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LabDetailsActivity extends AppCompatActivity {

    TextView tv;
    Button btn1,btn2;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_details);

        tv=findViewById(R.id.textviewLabDTittle);
        Intent it= getIntent();
        String t=it.getStringExtra("tittle");
        tv.setText(t);

        btn1=findViewById(R.id.buttonLabDBack);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabDetailsActivity.this, LabTestActivity.class));
            }
        });

        String[] s = new String[0];

        ListView l;
        if (t.compareTo("Blood Test")==0){
            s = new String[]{"Blood Test", "Waiting:400 hrs", "paisa:1000000", "no.:123456789109"};
        }

        else if (t.compareTo("Biopsy")==0) {
            s = new String[]{"Biopsy", "Waiting:500 hrs", "paisa:1000000", "no.:123456789109"};
        }

        else if (t.compareTo("Skin Test")==0) {
            s = new String[]{"Skin Test", "Waiting:600 hrs", "paisa:1000000", "no.:123456789109"};
        }

        else if (t.compareTo("Body Fluid")==0) {
            s = new String[]{"Body Fluid ", "Waiting:700 krs", "paisa:1000000", "no.:123456789109"};
        }

        else if (t.compareTo("Antibody")==0) {
            s = new String[]{"name:Antibody", "Waiting:800 hrs", "paisa:10,000", "Number : 12345679765 " };
        }

        l=findViewById(R.id.ListviewLabD);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,s);
        l.setAdapter(arr);

        btn2=findViewById(R.id.buttonLabDBookAppointment);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabDetailsActivity.this, LabBookAppointmentActivity.class));
            }
        });

    }
}
