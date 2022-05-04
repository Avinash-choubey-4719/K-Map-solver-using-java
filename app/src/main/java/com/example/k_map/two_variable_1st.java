package com.example.k_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class two_variable_1st extends AppCompatActivity {
    public static final String key = "androidx.appcompat.app.AppCompatActivity.next";

    public void OkProceed(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName5);
        if(TextUtils.isEmpty(editText.getText().toString()) || TextUtils.isEmpty(editText.getText().toString())
                || TextUtils.isEmpty(editText.getText().toString())){
            Toast.makeText(two_variable_1st.this,"Empty fields not allowed",Toast.LENGTH_SHORT).show();
        }
        else {
            String n = editText.getText().toString();
            if(Integer.parseInt(n) <= 4 && Integer.parseInt(n) >=1) {
                Intent intent = new Intent(this, two_variable_2nd.class);
                intent.putExtra(key, n);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "Number you have entered is beyond 4 or less than 1", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_variable1st);
    }
}