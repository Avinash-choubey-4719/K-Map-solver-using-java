package com.example.k_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class two_variable4th_for_pos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_variable4th_for_pos);

        Intent intent = getIntent();
        String expression = intent.getStringExtra(two_variable_3rd.key_for_pos);
        TextView text = findViewById(R.id.textView101);
        text.setText(expression);
    }
}