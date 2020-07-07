package com.example.api2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void act_generate(View view) {
        Intent act_generate = new Intent(this, GenerateToken.class);
        startActivity(act_generate);
    }

    public void add_newtoken(View view) {
        Intent add_newtoken = new Intent(this, AddNewTokenName.class);
        startActivity(add_newtoken);
    }
/*
    public class GenerateToken {
        public static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        public static final int SECURE_TOKEN_LENGTH = 64;
        private static final SecureRandom random = new SecureRandom();
        private static final char[] symbols = CHARACTERS.toCharArray();
        private static final char[] buf = new char[SECURE_TOKEN_LENGTH];
        private  final SecureRandom random = new SecureRandom();
        private  final char[] symbols = CHARACTERS.toCharArray();
        private  final char[] buf = new char[SECURE_TOKEN_LENGTH];
        public  String nextToken() {
            for (int idx = 0; idx < buf.length; ++idx)
                buf[idx] = symbols[random.nextInt(symbols.length)];
            return new String(buf);
        }
    }
*/
    //package com.timebuddy.gae.server.service;
    public class GeneratorToken {
        protected  SecureRandom random = new SecureRandom();

        public synchronized String generateToken(String username) {
            long longToken = Math.abs(random.nextLong());
            String random = Long.toString(longToken, 16);
            return (username + ":" + random);
        }
    }
}

