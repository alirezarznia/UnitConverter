package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

public class EnhancedActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        G.currentActivity = this;
        super.onResume();
    }
}
