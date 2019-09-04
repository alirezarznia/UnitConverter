package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.unitconvertor.R;

public class MenuActivity extends EnhancedActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Toast.makeText(G.context , "Hello :)" , Toast.LENGTH_SHORT).show();
        disFanc();
        volFanc();
        speFanc();
        temFanc();
    }
    private void disFanc(){
        Button dis_btn = (Button) findViewById(R.id.dis_btn);
        dis_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(G.currentActivity , DistanceActivity.class);
                G.currentActivity.startActivity(intent);
            }
        })
        ;
    }
    private void volFanc(){
        Button vol_btn = (Button) findViewById(R.id.vol_btn);
        vol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(G.currentActivity , VolumeActivity.class);
                G.currentActivity.startActivity(intent);
            }
        })
        ;
    }
    private void speFanc(){
        Button spe_btn = (Button) findViewById(R.id.spe_btn);
        spe_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(G.currentActivity , SpeedActivity.class);
                G.currentActivity.startActivity(intent);
            }
        })
        ;
    }
    private void temFanc(){
        Button tem_btn = (Button) findViewById(R.id.tem_btn);
        tem_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(G.currentActivity , TemperatureActivity.class);
                G.currentActivity.startActivity(intent);
            }
        })
        ;
    }
}
