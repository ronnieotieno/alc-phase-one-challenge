package com.example.alcphase1challenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("ALC 4 phase 1");

        Toolbar toolbar = findViewById(R.id.toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);

        }
    }

    public void openAboutALC(View view) {

        Intent intent = new Intent(this, AboutAlcActivity.class);
        startActivity(intent);

    }

    public void openProfile(View view) {
        Intent intent = new Intent(this, MyProfileActivity.class);
        startActivity(intent);

    }
}
