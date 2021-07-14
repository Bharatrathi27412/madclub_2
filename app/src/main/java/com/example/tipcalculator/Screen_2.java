package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Screen_2 extends AppCompatActivity {

    TextView box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Intent i = getIntent();
        Bundle b = i.getBundleExtra("tipAmount");
        float amount = b.getFloat("value");
        box = findViewById(R.id.textView);
        String display = "Tip Amount is "+amount;
        box.setText(display);
    }
}