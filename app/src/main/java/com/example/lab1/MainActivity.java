package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView MainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.MainText = findViewById(R.id.ViewText);
    }

    public void changeOnClick(View view) {this.MainText.setText("The text has been changed");}
    public void changeColor(View view) {this.MainText.setTextColor(Color.rgb(150, 10, 100));}
}