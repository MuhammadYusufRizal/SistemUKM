package com.example.sistemukm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void loginUKM(View view) {
        Intent intent = new Intent(MainActivity.this, LoginUKM.class);
        startActivity(intent);
    }

    public void loginMahasiswa(View view) {
        Intent intent = new Intent(MainActivity.this, LoginMahasiswa.class);
        startActivity(intent);
    }
}