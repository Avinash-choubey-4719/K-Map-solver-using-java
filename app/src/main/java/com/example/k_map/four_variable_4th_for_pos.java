package com.example.k_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class four_variable_4th_for_pos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_variable4th_for_pos);

        Intent intent = getIntent();
        String text = intent.getStringExtra(four_variable_3rd.key_for_pos);

        TextView textView = findViewById(R.id.textView51);
        textView.setText(text);
    }
}