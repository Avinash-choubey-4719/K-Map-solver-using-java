package com.example.k_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class no_of_variables_page extends AppCompatActivity {

    public void ForFourVariable(View view){
        Intent intent = new Intent(this,four_variable_1st.class);
        startActivity(intent);
    }

    public void ForThreeVariable(View view){
        Intent intent = new Intent(this,three_variable_1st.class);
        startActivity(intent);
    }

    public void ForTwoVariable(View view){
        Intent intent = new Intent(this,two_variable_1st.class);
        startActivity(intent);
    }

    public void ForOneVariable(View view){
        Intent intent = new Intent(this,one_variable_1st.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_of_variables_page);
    }
}