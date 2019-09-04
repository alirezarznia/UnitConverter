package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.unitconvertor.R;

public class VolumeActivity extends EnhancedActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);
        final EditText edtLi = findViewById(R.id.edtli);
        final EditText edtMl = findViewById(R.id.edtml);
        final EditText edtCubem = findViewById(R.id.edtcubem);
        final EditText edtCc = findViewById(R.id.edtcc);
        final EditText edtGl = findViewById(R.id.edtgl);
        edtMl.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtLi.setText("") ; edtCubem.setText("");
                edtCc.setText(""); edtGl.setText("");
            }
        });
        edtLi.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtMl.setText("") ; edtCubem.setText("");
                edtCc.setText(""); edtGl.setText("");
            }
        });
        edtCc.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtLi.setText("") ; edtCubem.setText("");
                edtMl.setText(""); edtGl.setText("");
            }
        });
        edtCubem.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtLi.setText("") ; edtMl.setText("");
                edtCc.setText(""); edtGl.setText("");
            }
        });
        edtGl.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtLi.setText("") ; edtMl.setText("");
                edtCc.setText(""); edtCubem.setText("");
            }
        });
        Button btncnv= findViewById(R.id.btncnv2);
        btncnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double li = 0.0;
                if(edtLi.getText().toString().length()!=0)
                    li= Double.parseDouble(edtLi.getText().toString());
                else if(edtMl.getText().toString().length()!=0)
                    li= Double.parseDouble(edtMl.getText().toString())*0.001;
                else if(edtCubem.getText().toString().length()!=0)
                    li= Double.parseDouble(edtCubem.getText().toString())*1000.0;
                else if(edtCc.getText().toString().length()!=0)
                    li= Double.parseDouble(edtCc.getText().toString())*0.001;
                else if(edtGl.getText().toString().length() != 0)
                li= Double.parseDouble(edtGl.getText().toString())*3.78541178;
                else return;
                edtLi.setText(""+li);
                edtMl.setText(""+li*1000.0);
                edtCubem.setText(""+li*0.001);
                edtCc.setText(""+li*1000.0);
                edtGl.setText(""+li*0.26417205);
            }
        });

    }
}
