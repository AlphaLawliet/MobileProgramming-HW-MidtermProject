package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text;
    TextView latiText;
    TextView longiText;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        text = findViewById(R.id.text);
        latiText = findViewById(R.id.latitude);
        longiText = findViewById(R.id.longitude);
        img = findViewById(R.id.img);
        if(bundle != null){
            text.setText(bundle.getString("name"));
            latiText.setText("Latitude: " + bundle.getDouble("latitude"));
            longiText.setText("Longitude: " + bundle.getDouble("longitude"));
            img.setImageResource(bundle.getInt("imageResource"));
        }
    }
}