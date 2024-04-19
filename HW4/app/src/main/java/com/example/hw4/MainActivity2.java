package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText firstNameInput;
    EditText lastNameInput;
    EditText addressInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstNameInput = findViewById(R.id.firstName);
        lastNameInput = findViewById(R.id.lastName);
        addressInput = findViewById(R.id.address);
    } public void submitBtn(View view){
        String firstName = firstNameInput.getText().toString();
        String lastName = lastNameInput.getText().toString();
        String address = addressInput.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        Person person = new Person(firstName, lastName, address);
        intent.putExtra("person",person);
        startActivity(intent);
    }
}