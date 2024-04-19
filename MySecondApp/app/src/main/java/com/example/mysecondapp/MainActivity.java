package com.example.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputTempText;
    private Button convertButton;
    private TextView convertedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restoreState(savedInstanceState);
        //connect to views
        inputTempText= (EditText) findViewById(R.id.inputTempEditText);
        convertButton= (Button) findViewById(R.id.convertButton);
        convertedText=(TextView) findViewById(R.id.convertedTempTextView);
        //register and handle event click listener
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strFh=convertToFh(inputTempText.getText().toString());
                convertedText.setText(strFh + "F");

            }
        });


    }

    private String convertToFh(String pCelcius){
        try {
            double c= Double.parseDouble(pCelcius);
            double f=c * (9.0 / 5.0) + 32.0;
            return String.format("%3.2f", f);
        }catch (NumberFormatException nfe){
            return "Err";
        }
    }

    protected void onSaveInstanceState(Bundle state){
        super.onSaveInstanceState(state);
        inputTempText = (EditText) findViewById(R.id.inputTempEditText);
        convertedText = (TextView) findViewById(R.id.convertedTempTextView);
        String inputTemp = inputTempText.getText().toString();
        String convertedTemp = convertedText.getText().toString();
        state.putString("inputTemperature", inputTemp);
        state.putString("convertedTemp", convertedTemp);

    }

    private void restoreState(Bundle state){
        if(state == null) return;
        inputTempText = (EditText) findViewById(R.id.inputTempEditText);
        convertedText = (TextView) findViewById(R.id.convertedTempTextView);
        String inputTemp = state.getString("inputTemperature");
        String convertedTemp = state.getString("convertedTemp");
        inputTempText.setText(inputTemp);
        convertedText.setText(convertedTemp);
    }

}


