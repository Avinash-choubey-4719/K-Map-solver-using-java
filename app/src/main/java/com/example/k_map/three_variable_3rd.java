package com.example.k_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class three_variable_3rd extends AppCompatActivity {

    String exp_pos_form;
    public static final String key_for_pos = "androidx.appcompat.app.AppCompatActivity.next";

    public void PosForm(View view){
        Intent intent = new Intent(this,three_variable4th_for_pos.class);
        intent.putExtra(key_for_pos,exp_pos_form);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_variable3rd);

        Intent intent = getIntent();
        String expression = intent.getStringExtra(three_variable_2nd.exp_key_for_sop);
        exp_pos_form = intent.getStringExtra(three_variable_2nd.exp_key_for_pos);
        TextView text = findViewById(R.id.textView23);
        int pos = expression.length() - 3;
        expression = expression.substring(0 , pos);
        text.setText(expression);


        ImageView imageView = findViewById(R.id.imageView3);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.zoom);
        imageView.startAnimation(animation);

        Handler handler = new Handler();
        handler.postDelayed(() -> imageView.setAlpha(0f), 2000);
    }
}