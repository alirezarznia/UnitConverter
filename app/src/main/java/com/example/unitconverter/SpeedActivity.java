package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.unitconvertor.R;

public class SpeedActivity extends EnhancedActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed);
        final EditText edtKmh = findViewById(R.id.edtkmh);
        final EditText edtFps = findViewById(R.id.edtfps);
        final EditText edtMph = findViewById(R.id.edtmph);
        final EditText edtMs = findViewById(R.id.edtms);
        final EditText edtIps = findViewById(R.id.edtips);
        edtFps.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtKmh.setText("") ; edtMph.setText("");
                edtMs.setText(""); edtIps.setText("");
            }
        });
        edtKmh.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtFps.setText("") ; edtMph.setText("");
                edtMs.setText(""); edtIps.setText("");
            }
        });
        edtMs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtKmh.setText("") ; edtMph.setText("");
                edtFps.setText(""); edtIps.setText("");
            }
        });
        edtMph.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtKmh.setText("") ; edtFps.setText("");
                edtMs.setText(""); edtIps.setText("");
            }
        });
        edtIps.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtKmh.setText("") ; edtFps.setText("");
                edtMs.setText(""); edtMph.setText("");
            }
        });
        Button btncnv= findViewById(R.id.btncnv3);
        btncnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kmh = 0.0;
                if(edtKmh.getText().toString().length()!=0)
                    kmh= Double.parseDouble(edtKmh.getText().toString());
                else if(edtFps.getText().toString().length()!=0)
                    kmh= Double.parseDouble(edtFps.getText().toString())*1.09728;
                else if(edtMph.getText().toString().length()!=0)
                    kmh= Double.parseDouble(edtMph.getText().toString())*1.60934;
                else if(edtMs.getText().toString().length()!=0)
                    kmh= Double.parseDouble(edtMs.getText().toString())*3.6;
                else if(edtIps.getText().toString().length() != 0)
                kmh= Double.parseDouble(edtIps.getText().toString())*0.09144;
                else return;
                edtKmh.setText(""+kmh);
                edtFps.setText(""+kmh*0.91134442);
                edtMph.setText(""+kmh*0.62137274);
                edtMs.setText(""+kmh*0.27777778);
                edtIps.setText(""+kmh*10.93613298);
            }
        });

    }
}
