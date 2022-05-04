package com.example.k_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class two_variable_2nd extends AppCompatActivity {
    int[] final_arr = {0,0,0,0};
    int no_of_times , count = 0;
    String exp_sop_form = "   ";
    String exp_pos_form = "   ";
    static  public final String exp_key_for_sop = "androidx.appcompat.app.AppCompatActivity.sop";
    static  public final String exp_key_for_pos = "androidx.appcompat.app.AppCompatActivity.pos";

    public void Ok(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName6);
        if(TextUtils.isEmpty(editText.getText().toString()) || TextUtils.isEmpty(editText.getText().toString())
                || TextUtils.isEmpty(editText.getText().toString())){
            Toast.makeText(two_variable_2nd.this,"Empty fields not allowed",Toast.LENGTH_SHORT).show();
        }
        else {
            int n = Integer.parseInt(editText.getText().toString());
            if(n >= 0 && n <=3) {
                final_arr[n] = 1;
                editText.setText(null);
                count++;
                if (count == no_of_times) {
                    Button my_button = findViewById(R.id.button15);
                    my_button.setAlpha(0f);
                    editText.setAlpha(0f);
                    TextView textView = findViewById(R.id.textView49);
                    textView.setAlpha(1f);
                }
            }
            else{
                Toast.makeText(this, "Number you have entered is beyond 3 or less than 0", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void Enter(View view){

        if(count == no_of_times) {
            //checking for 4 - 4 group
            if (final_arr[0] != 0 && final_arr[1] != 0 && final_arr[2] != 0 && final_arr[3] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1 || final_arr[2] == 1 || final_arr[3] == 1) {

                    exp_sop_form += "  ";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                    final_arr[2] = 2;
                    final_arr[3] = 2;
                }
            }


            //checking for 2 - 2 group
            if (final_arr[0] != 0 && final_arr[1] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1) {

                    exp_sop_form += "A' + ";
                    exp_pos_form += "(A). ";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                }
            }

            if (final_arr[2] != 0 && final_arr[3] != 0) {
                if (final_arr[2] == 1 || final_arr[3] == 1) {

                    exp_sop_form += "A + ";
                    exp_pos_form += "(A'). ";

                    final_arr[2] = 2;
                    final_arr[3] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[2] != 0) {
                if (final_arr[0] == 1 || final_arr[2] == 1) {

                    exp_sop_form += "B' + ";
                    exp_pos_form += "(B). ";

                    final_arr[0] = 2;
                    final_arr[2] = 2;
                }
            }

            if (final_arr[1] != 0 && final_arr[3] != 0) {
                if (final_arr[1] == 1 || final_arr[3] == 1) {

                    exp_sop_form += "B + ";
                    exp_pos_form += "(B'). ";

                    final_arr[1] = 2;
                    final_arr[3] = 2;
                }
            }


            //checking for 1 - 1 group
            if (final_arr[0] == 1) {

                exp_sop_form += "A'B' + ";
                exp_pos_form += "(A + B). ";

                final_arr[0] = 2;
            }

            if (final_arr[1] == 1) {

                exp_sop_form += "A'B + ";
                exp_pos_form += "(A + B'). ";

                final_arr[1] = 2;
            }

            if (final_arr[2] == 1) {

                exp_sop_form += "AB' + ";
                exp_pos_form += "(A' + B). ";

                final_arr[2] = 2;
            }

            if (final_arr[3] == 1) {

                exp_sop_form += "AB + ";
                exp_pos_form += "(A' + B'). ";

                final_arr[3] = 2;
            }

            Intent intent = new Intent(this, two_variable_3rd.class);
            intent.putExtra(exp_key_for_sop, exp_sop_form);
            intent.putExtra(exp_key_for_pos, exp_pos_form);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Please enter the total numbers", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_variable2nd);

        Intent intent = getIntent();
        String no_of_times_string = intent.getStringExtra(two_variable_1st.key);
        no_of_times = Integer.parseInt(no_of_times_string);
    }
}