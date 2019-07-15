package com.example.alcphase1challenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    TextView textViewName, textViewTrack, textViewCountry, textViewEmail, textViewPhone, textViewSlack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        textViewCountry = findViewById(R.id.textViewCountry);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewName = findViewById(R.id.textViewName);
        textViewPhone = findViewById(R.id.textViewPhone);
        textViewSlack = findViewById(R.id.textViewSlack);
        textViewTrack = findViewById(R.id.textViewTrack);

        setTitle("My Profile");

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);

        }

        setTexts();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void setTexts() {
        textViewTrack.setText(getString(R.string.Track));
        textViewSlack.setText(getString(R.string.Slack));
        textViewPhone.setText(getString(R.string.Phone));
        textViewName.setText(getString(R.string.Name));
        textViewEmail.setText(getString(R.string.Email));
        textViewCountry.setText(getString(R.string.Country));
    }
}

