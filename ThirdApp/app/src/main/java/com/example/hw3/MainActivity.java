package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void fruitBtnClickHandler(View view){
        showFoodview("Fruit", R.drawable.apple);
    }

    public void vegBtnClickHandler(View view){
        showFoodview("Vegetable", R.drawable.salad);
    }

    public void drinkBtnClickHandler(View view){
        showFoodview("Drink", R.drawable.drink);

    }

    public void callBtnClickHandler(View view){

        Uri number = Uri.parse("tel: 012717261");

        // create an intent with the ACTION_DIAL action
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, number);

        // check if there is a built in dialer app
        if(dialIntent.resolveActivity(getPackageManager()) != null){
            startActivity(dialIntent);
        }else {
            Toast.makeText(this, "No dialer app found on your device.", Toast.LENGTH_SHORT).show();
        }


    }

    public void searchBtnClickHandler(View view){
        Uri webpage = Uri.parse("https:limkokwing.com");

        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

        startActivity(webIntent);
    }


    private void showFoodview(String foodName, int drawableImage){

        Bundle dataBundle = new Bundle();
        dataBundle.putString("name", foodName);
        dataBundle.putInt("image", drawableImage);

        // set the sender and the receiver of the intent

        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), FoodDetails.class);
        intent.putExtras(dataBundle); // store the data you want to sent

        startActivity(intent); // transmit your intent


    }



}