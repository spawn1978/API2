package com.example.api2;

import  androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class GenerateToken extends AppCompatActivity {
    private TextView textview;
    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_token);
        textview = (TextView) findViewById(R.id.textview);
        spinner1 = (Spinner)findViewById(R.id.spinner2);
        String [] opciones = {"Select a token name", "11111", "22222", "33333","44444"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }
    //metodo generar
    //public void generateToken(View view) {
    //    Random ran = new Random();
    //    int number = ran.nextInt(999999999) +1;
    //    textview.setText(String.valueOf(number));
    //}
    public void secure(View view){
        textview.setText(SecureToken.generateToken());
    }
}
