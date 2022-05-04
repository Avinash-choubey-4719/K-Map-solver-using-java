package com.example.k_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class four_variable_1st extends AppCompatActivity {
    public static final String key = "androidx.appcompat.app.AppCompatActivity.next";

    public void OkProceed(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String n = editText.getText().toString();
        if(TextUtils.isEmpty(editText.getText().toString()) || TextUtils.isEmpty(editText.getText().toString())
                || TextUtils.isEmpty(editText.getText().toString())){
            Toast.makeText(four_variable_1st.this,"Empty fields not allowed",Toast.LENGTH_SHORT).show();
        }
        else {
            if(Integer.parseInt(n) <= 16 && Integer.parseInt(n) >=1) {
                Intent intent = new Intent(this, four_variable_2nd.class);
                intent.putExtra(key, n);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "Number you have entered is beyond 16 or less than 1", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_variable1st);
    }
}