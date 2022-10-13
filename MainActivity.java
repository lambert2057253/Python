package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button btabc;
    private TextView tvabc;
    private EditText etabc,etabc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btabc=(Button) findViewById(R.id.butnn);
        tvabc=(TextView) findViewById(R.id.txt3);
        etabc=(EditText) findViewById(R.id.editTextNumber);
        etabc2=(EditText)findViewById(R.id.editTextNumber2);

        btabc.setOnClickListener(btnDolistener);
    }
    private Button.OnClickListener btnDolistener = new Button.OnClickListener(){
        public void onClick(View v){
            float str1=Float.parseFloat(etabc.getEditableText().toString());//體重1
            float str2=Float.parseFloat(etabc2.getEditableText().toString());//身高
            str2=str2/100;
            str2=str2*str2;
            NumberFormat nf =NumberFormat.getInstance();
            nf.setMaximumFractionDigits(2);
            tvabc.setText(nf.format(str1/str2));
        }
    };

}