package com.example.mad_project_gender;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText edu , edp , edc , ede;
    Button btn;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edu = findViewById(R.id.editTextRegUsername);
        edp = findViewById(R.id.editTextRegPassword);
        btn = findViewById(R.id.buttonRegister);
        tv = findViewById(R.id.textViewExistingUser);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity2.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edu.length()==0||edp.length()==0||ede.length()==0||edc.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Fill all details",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (edp==edc){
                        Toast.makeText(getApplicationContext(), "Registeration Successfull", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this, LoginActivity2.class));
                    }
                    else {
                    Toast.makeText(getApplicationContext(), "password != confirmpassword", Toast.LENGTH_SHORT).show();}
                }
            }
        });
    }
}