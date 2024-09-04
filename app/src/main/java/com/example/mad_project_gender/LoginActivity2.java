package com.example.mad_project_gender;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mad_project_gender.databinding.ActivityLogin2Binding;

import java.util.Locale;

public class LoginActivity2 extends AppCompatActivity {

    EditText edu , edp;
    Button btn;
    TextView tv;

    private ActivityLogin2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        binding = ActivityLogin2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        edu = findViewById(R.id.editTextLoginUsername);
        edp = findViewById(R.id.editTextLoginPassword);
        btn = findViewById(R.id.buttonLogin);
        tv = findViewById(R.id.textViewNewUser);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edu.length()==0||edp.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Fill all details",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity2.this, HomeActivity.class));
                }
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity2.this, RegisterActivity.class));
            }
        });

        binding.ChangeLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changelanguage();
            }
        });
    }

    private void changelanguage() {

        final String[] Lang;
        Lang = new String[]{"English", "Hindi" , "Guju"};
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
        mBuilder.setTitle("Choose lang");
        mBuilder.setSingleChoiceItems(Lang, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (which==0){

                    setLocale("");
                    recreate();
                }

                else if (which==1){

                    setLocale("hi");
                    recreate();
                }

                else if (which == 2){

                    setLocale("gu");
                    recreate();
                }

            }
        });
        mBuilder.create();
        mBuilder.show();

    }

    private void setLocale(String Language) {

        Locale locale = new Locale(Language);
        Locale.setDefault(locale);

        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration , getBaseContext().getResources().getDisplayMetrics());
    }
}