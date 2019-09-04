package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.unitconvertor.R;

public class DistanceActivity extends EnhancedActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distance);
        final EditText edtMm = findViewById(R.id.edtmm);
        final EditText edtCm = findViewById(R.id.edtcm);
        final EditText edtM = findViewById(R.id.edtm);
        final EditText edtKm = findViewById(R.id.edtkm);
        final EditText edtIn = findViewById(R.id.edtin);
        edtCm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtMm.setText("") ; edtM.setText("");
                edtKm.setText(""); edtIn.setText("");
            }
        });
        edtMm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtCm.setText("") ; edtM.setText("");
                edtKm.setText(""); edtIn.setText("");
            }
        });
        edtKm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtMm.setText("") ; edtM.setText("");
                edtCm.setText(""); edtIn.setText("");
            }
        });
        edtM.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtMm.setText("") ; edtCm.setText("");
                edtKm.setText(""); edtIn.setText("");
            }
        });
        edtIn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtMm.setText("") ; edtCm.setText("");
                edtKm.setText(""); edtM.setText("");
            }
        });
        Button btncnv= findViewById(R.id.btncnv);
        btncnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double mm = 0.0;
                if(edtMm.getText().toString().length()!=0)
                    mm= Double.parseDouble(edtMm.getText().toString());
                else if(edtCm.getText().toString().length()!=0)
                    mm= Double.parseDouble(edtCm.getText().toString())*10.0;
                else if(edtM.getText().toString().length()!=0)
                    mm= Double.parseDouble(edtM.getText().toString())*1000.0;
                else if(edtKm.getText().toString().length()!=0)
                    mm= Double.parseDouble(edtKm.getText().toString())*1000000.0;
                else if(edtIn.getText().toString().length() != 0)
                mm= Double.parseDouble(edtIn.getText().toString())*25.4;
                else return;
                edtMm.setText(""+mm);
                edtCm.setText(""+mm*0.1);
                edtM.setText(""+mm*0.001);
                edtKm.setText(""+mm*0.000001);
                edtIn.setText(""+mm*10.0/(254.0));

            }
        });

    }
}
