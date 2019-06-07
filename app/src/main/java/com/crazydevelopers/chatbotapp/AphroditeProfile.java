package com.crazydevelopers.chatbotapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AphroditeProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aphrodite_profile);
    }
    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
