package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {

    TextInputEditText amountBox;
    Button but1;
    TextView space1;
    Slider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountBox = (TextInputEditText) findViewById(R.id.text_1);
        but1 = (Button) findViewById(R.id.Button1);
        slider = (Slider) findViewById(R.id.slider1);

        but1.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        String Text = amountBox.getText().toString();
                        float tipValue = (slider.getValue());
                        float value = tipCalculator(Text,tipValue);
                        Intent i = new Intent(MainActivity.this,Screen_2.class);
                        Bundle b = new Bundle();
                        b.putFloat("value",value);
                        i.putExtra("tipAmount",b);
                        startActivity(i);
                    }
                }
        );

    }

    private float tipCalculator(String Text, float tipPercent) {
        float amount = Float.valueOf(Text);
        float toPay = ((amount*tipPercent/100));
        toPay = Math.round(toPay);
        return toPay;
    }
}