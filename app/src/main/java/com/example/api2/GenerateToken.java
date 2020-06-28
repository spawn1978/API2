package com.example.api2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class GenerateToken extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_token);

        spinner1 = (Spinner)findViewById(R.id.spinner2);
        String [] opciones = {"Carlos", "Pablo", "Edgar"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }


    }
