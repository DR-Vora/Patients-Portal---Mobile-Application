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

public class DoctorDetailsActivity extends AppCompatActivity {
    TextView tv;
    Button btn1,btn2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv=findViewById(R.id.textviewDDTittle);
        Intent it= getIntent();
        String t=it.getStringExtra("tittle");
        tv.setText(t);

        btn1=findViewById(R.id.buttonDDBack);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailsActivity.this, FindDoctorActivity.class));
            }
        });

        String[] s = new String[0];

        ListView l;
        if (t.compareTo("PHYSICIAN")==0){
            s = new String[]{"name:Yaju", "exp:400", "paisa:1000000", "no.:123456789109", "Rank (all over INDIA):5"};
        }

        else if (t.compareTo("DITECIAN")==0) {
            s = new String[]{"name:Arya", "exp:500", "paisa:1000000", "no.:123456789109", "Rank (all over INDIA):6"};
        }

        else if (t.compareTo("DENTIST")==0) {
            s = new String[]{"name:Dhruvlo", "exp:600", "paisa:1000000", "no.:123456789109", "Rank (all over INDIA):2"};
        }

        else if (t.compareTo("SURGEN")==0) {
            s = new String[]{"name:idk", "exp:700", "paisa:1000000", "no.:123456789109", "Rank (all over INDIA):3"};
        }

        else if (t.compareTo("CARDIOLOGIST")==0) {
            s = new String[]{"name:Dhairya THE LEGEND", "exp:800", "paisa:Tera pura ghar chala jayenga", "no.:Faltuka Time nai hai ", "Rank (all over UNIVERSSE):1"};
        }

        l=findViewById(R.id.ListviewDD);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,s);
        l.setAdapter(arr);

        btn2=findViewById(R.id.buttonDDBockAppointment);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailsActivity.this, BookAppointmentActivity.class));
            }
        });

    }
}