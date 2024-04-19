package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstValue = findViewById(R.id.firstValue);
        TextView secondValue = findViewById(R.id.secondValue);
        TextView thirdValue = findViewById(R.id.thirdValue);
        ViewGroup info = (ViewGroup) findViewById(R.id.info).getParent();

        Person person = getIntent().getParcelableExtra("person");
        if(person != null){
            firstValue.setText(person.firstName);
            secondValue.setText(person.lastName);
            thirdValue.setText(person.address);
            info.removeView(findViewById(R.id.info));
        }
    }


    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }








































































}