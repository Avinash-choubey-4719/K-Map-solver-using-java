package com.example.k_map;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class four_variable_3rd extends AppCompatActivity {

    String expression_pos_form;
    public static final String key_for_pos = "androidx.appcompat.app.AppCompatActivity.posform";
    public void PosForm(View view){
        Intent intent = new Intent(this,four_variable_4th_for_pos.class);
        intent.putExtra(key_for_pos,expression_pos_form);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_variable3rd);

        TextView textView13 = findViewById(R.id.textView13);
        Intent intent = getIntent();
        String expression_sop_form = intent.getStringExtra(four_variable_2nd.exp_key_for_sop);
        int pos = expression_sop_form.length() - 3;
        expression_sop_form = expression_sop_form.substring(0 , pos);
        expression_pos_form = intent.getStringExtra(four_variable_2nd.exp_key_for_pos);
        textView13.setText(expression_sop_form);

        ImageView imageView = findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.zoom);
        imageView.startAnimation(animation);

        Handler handler = new Handler();
        handler.postDelayed(() -> imageView.setAlpha(0f), 2000);
    }
}