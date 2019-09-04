package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.unitconvertor.R;

public class TemperatureActivity extends EnhancedActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);
        final EditText edtCel = findViewById(R.id.edtcel);
        final EditText edtFah = findViewById(R.id.edtfah);
        final EditText edtKel = findViewById(R.id.edtkel);
        edtFah.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtCel.setText("") ; edtKel.setText("");
            }
        });
        edtCel.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtFah.setText("") ; edtKel.setText("");
            }
        });
        edtKel.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtCel.setText("") ;
                edtFah.setText("");
            }
        });
        Button btncnv= findViewById(R.id.btncnv4);
        btncnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cel = 0.0;
                if(edtCel.getText().toString().length()!=0)
                    cel= Double.parseDouble(edtCel.getText().toString());
                else if(edtFah.getText().toString().length()!=0)
                    cel= (Double.parseDouble(edtFah.getText().toString())-32)*10.0/18.0;
                else if(edtKel.getText().toString().length()!=0)
                    cel= Double.parseDouble(edtKel.getText().toString())-273.0;
                else return;
                edtCel.setText(""+cel);
                edtFah.setText(""+((cel*1.8)+32));

                edtKel.setText(""+(cel+273.0));
            }
        });

    }
}
