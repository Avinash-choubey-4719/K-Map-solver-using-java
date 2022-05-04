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

public class four_variable_2nd extends AppCompatActivity {

    int[] final_arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    String exp_sop_form = "   ";
    String exp_pos_form = "   ";
    static public final String exp_key_for_sop = "androidx.appcompat.app.AppCompatActivity.sop";
    static public final String exp_key_for_pos = "androidx.appcompat.app.AppCompatActivity.pos";
    int number_of_times , count = 0;
    public void Ok(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName2);
        if(TextUtils.isEmpty(editText.getText().toString()) || TextUtils.isEmpty(editText.getText().toString())
                || TextUtils.isEmpty(editText.getText().toString())){
            Toast.makeText(four_variable_2nd.this,"Empty fields not allowed",Toast.LENGTH_SHORT).show();
        }
        else {
            int n = Integer.parseInt(editText.getText().toString());
            if(n <= 16 && n >= 0) {
                final_arr[n] = 1;
                editText.setText(null);
                count++;
                if (count == number_of_times) {
                    Button my_ok_button = findViewById(R.id.button9);
                    my_ok_button.setAlpha(0f);
                    editText.setAlpha(0f);
                    TextView textView = findViewById(R.id.textView47);
                    textView.setAlpha(1f);
                }
            }
            else{
                Toast.makeText(this, "Number you have entered is beyond 15 or less than 0", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void Enter(View view){

        if(count == number_of_times) {
            //checking  for 8 - 8 groups.......
            if (final_arr[0] != 0 && final_arr[1] != 0 && final_arr[4] != 0 && final_arr[5] != 0 &&
                    final_arr[12] != 0 && final_arr[13] != 0 && final_arr[8] != 0 && final_arr[9] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1 || final_arr[4] == 1 || final_arr[5] == 1 ||
                        final_arr[12] == 1 || final_arr[13] == 1 || final_arr[8] == 1 || final_arr[9] == 1) {
                    exp_sop_form += "C' + ";
                    exp_pos_form += "(C).";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                    final_arr[4] = 2;
                    final_arr[5] = 2;
                    final_arr[12] = 2;
                    final_arr[13] = 2;
                    final_arr[8] = 2;
                    final_arr[9] = 2;
                }
            }

            if (final_arr[1] != 0 && final_arr[3] != 0 && final_arr[5] != 0 && final_arr[7] != 0 &&
                    final_arr[13] != 0 && final_arr[15] != 0 && final_arr[9] != 0 && final_arr[11] != 0) {
                if (final_arr[1] == 1 || final_arr[3] == 1 || final_arr[5] == 1 || final_arr[7] == 1 ||
                        final_arr[13] == 1 || final_arr[15] == 1 || final_arr[9] == 1 || final_arr[11] == 1) {
                    exp_sop_form += "D + ";
                    exp_pos_form += "(D').";

                    final_arr[1] = 2;
                    final_arr[3] = 2;
                    final_arr[5] = 2;
                    final_arr[7] = 2;
                    final_arr[13] = 2;
                    final_arr[15] = 2;
                    final_arr[9] = 2;
                    final_arr[11] = 2;
                }
            }

            if (final_arr[3] != 0 && final_arr[2] != 0 && final_arr[7] != 0 && final_arr[6] != 0 &&
                    final_arr[15] != 0 && final_arr[14] != 0 && final_arr[11] != 0 && final_arr[10] != 0) {
                if (final_arr[3] == 1 || final_arr[2] == 1 || final_arr[7] == 1 || final_arr[6] == 1 ||
                        final_arr[15] == 1 || final_arr[14] == 1 || final_arr[11] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "C + ";
                    exp_pos_form += "(C').";

                    final_arr[3] = 2;
                    final_arr[2] = 2;
                    final_arr[7] = 2;
                    final_arr[6] = 2;
                    final_arr[15] = 2;
                    final_arr[14] = 2;
                    final_arr[11] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[1] != 0 && final_arr[3] != 0 && final_arr[2] != 0 &&
                    final_arr[4] != 0 && final_arr[5] != 0 && final_arr[7] != 0 && final_arr[6] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1 || final_arr[3] == 1 || final_arr[2] == 1 ||
                        final_arr[4] == 1 || final_arr[5] == 1 || final_arr[7] == 1 || final_arr[6] == 1) {
                    exp_sop_form += "A' + ";
                    exp_pos_form += "(A).";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                    final_arr[3] = 2;
                    final_arr[2] = 2;
                    final_arr[4] = 2;
                    final_arr[5] = 2;
                    final_arr[7] = 2;
                    final_arr[6] = 2;
                }
            }

            if (final_arr[4] != 0 && final_arr[5] != 0 && final_arr[7] != 0 && final_arr[6] != 0 &&
                    final_arr[12] != 0 && final_arr[13] != 0 && final_arr[15] != 0 && final_arr[14] != 0) {
                if (final_arr[4] == 1 || final_arr[5] == 1 || final_arr[7] == 1 || final_arr[6] == 1 ||
                        final_arr[12] == 1 || final_arr[13] == 1 || final_arr[15] == 1 || final_arr[14] == 1) {
                    exp_sop_form += "B + ";
                    exp_pos_form += "(B').";

                    final_arr[4] = 2;
                    final_arr[5] = 2;
                    final_arr[7] = 2;
                    final_arr[6] = 2;
                    final_arr[12] = 2;
                    final_arr[13] = 2;
                    final_arr[15] = 2;
                    final_arr[14] = 2;
                }
            }

            if (final_arr[12] != 0 && final_arr[13] != 0 && final_arr[15] != 0 && final_arr[14] != 0 &&
                    final_arr[8] != 0 && final_arr[9] != 0 && final_arr[11] != 0 && final_arr[10] != 0) {
                if (final_arr[12] == 1 || final_arr[13] == 1 || final_arr[15] == 1 || final_arr[14] == 1 ||
                        final_arr[8] == 1 || final_arr[9] == 1 || final_arr[11] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "A + ";
                    exp_pos_form += "(A').";

                    final_arr[12] = 2;
                    final_arr[13] = 2;
                    final_arr[15] = 2;
                    final_arr[14] = 2;
                    final_arr[8] = 2;
                    final_arr[9] = 2;
                    final_arr[11] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[1] != 0 && final_arr[3] != 0 && final_arr[2] != 0 &&
                    final_arr[8] != 0 && final_arr[9] != 0 && final_arr[11] != 0 && final_arr[10] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1 || final_arr[3] == 1 || final_arr[2] == 1 ||
                        final_arr[8] == 1 || final_arr[9] == 1 || final_arr[11] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "B' + ";
                    exp_pos_form += "(B).";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                    final_arr[3] = 2;
                    final_arr[2] = 2;
                    final_arr[8] = 2;
                    final_arr[9] = 2;
                    final_arr[11] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[4] != 0 && final_arr[12] != 0 && final_arr[8] != 0 &&
                    final_arr[2] != 0 && final_arr[6] != 0 && final_arr[14] != 0 && final_arr[10] != 0) {
                if (final_arr[0] == 1 || final_arr[4] == 1 || final_arr[12] == 1 || final_arr[8] == 1 ||
                        final_arr[2] == 1 || final_arr[6] == 1 || final_arr[14] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "D' + ";
                    exp_pos_form += "(D).";

                    final_arr[0] = 2;
                    final_arr[4] = 2;
                    final_arr[12] = 2;
                    final_arr[8] = 2;
                    final_arr[2] = 2;
                    final_arr[6] = 2;
                    final_arr[14] = 2;
                    final_arr[10] = 2;
                }
            }


            //checking for 4 - 4 groups
            if (final_arr[0] != 0 && final_arr[1] != 0 && final_arr[4] != 0 && final_arr[5] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1 || final_arr[4] == 1 || final_arr[5] == 1) {
                    exp_sop_form += "A'C' + ";
                    exp_pos_form += "(A + C).";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                    final_arr[4] = 2;
                    final_arr[5] = 2;
                }
            }

            if (final_arr[1] != 0 && final_arr[3] != 0 && final_arr[5] != 0 && final_arr[7] != 0) {
                if (final_arr[1] == 1 || final_arr[3] == 1 || final_arr[5] == 1 || final_arr[7] == 1) {
                    exp_sop_form += "A'D + ";
                    exp_pos_form += "(A + D').";

                    final_arr[1] = 2;
                    final_arr[3] = 2;
                    final_arr[5] = 2;
                    final_arr[7] = 2;
                }
            }

            if (final_arr[3] != 0 && final_arr[2] != 0 && final_arr[7] != 0 && final_arr[6] != 0) {
                if (final_arr[3] == 1 || final_arr[2] == 1 || final_arr[7] == 1 || final_arr[6] == 1) {
                    exp_sop_form += "A'C + ";
                    exp_pos_form += "(A + C').";

                    final_arr[3] = 2;
                    final_arr[2] = 2;
                    final_arr[7] = 2;
                    final_arr[6] = 2;
                }
            }

            if (final_arr[4] != 0 && final_arr[5] != 0 && final_arr[12] != 0 && final_arr[13] != 0) {
                if (final_arr[4] == 1 || final_arr[5] == 1 || final_arr[12] == 1 || final_arr[13] == 1) {
                    exp_sop_form += "BC' + ";
                    exp_pos_form += "(B' + C).";

                    final_arr[4] = 2;
                    final_arr[5] = 2;
                    final_arr[12] = 2;
                    final_arr[13] = 2;
                }
            }

            if (final_arr[5] != 0 && final_arr[7] != 0 && final_arr[13] != 0 && final_arr[15] != 0) {
                if (final_arr[5] == 1 || final_arr[7] == 1 || final_arr[13] == 1 || final_arr[15] == 1) {
                    exp_sop_form += "BD + ";
                    exp_pos_form += "(B' + D').";

                    final_arr[5] = 2;
                    final_arr[7] = 2;
                    final_arr[13] = 2;
                    final_arr[15] = 2;
                }
            }

            if (final_arr[7] != 0 && final_arr[6] != 0 && final_arr[15] != 0 && final_arr[14] != 0) {
                if (final_arr[7] == 1 || final_arr[6] == 1 || final_arr[15] == 1 || final_arr[14] == 1) {
                    exp_sop_form += "BC + ";
                    exp_pos_form += "(B' + C').";

                    final_arr[7] = 2;
                    final_arr[6] = 2;
                    final_arr[15] = 2;
                    final_arr[14] = 2;
                }
            }

            if (final_arr[12] != 0 && final_arr[13] != 0 && final_arr[8] != 0 && final_arr[9] != 0) {
                if (final_arr[12] == 1 || final_arr[13] == 1 || final_arr[8] == 1 || final_arr[9] == 1) {
                    exp_sop_form += "AC' + ";
                    exp_pos_form += "(A' + C).";

                    final_arr[12] = 2;
                    final_arr[13] = 2;
                    final_arr[8] = 2;
                    final_arr[9] = 2;
                }
            }

            if (final_arr[13] != 0 && final_arr[15] != 0 && final_arr[9] != 0 && final_arr[11] != 0) {
                if (final_arr[13] == 1 || final_arr[15] == 1 || final_arr[9] == 1 || final_arr[11] == 1) {
                    exp_sop_form += "AD + ";
                    exp_pos_form += "(A' + D').";

                    final_arr[13] = 2;
                    final_arr[15] = 2;
                    final_arr[9] = 2;
                    final_arr[11] = 2;
                }
            }

            if (final_arr[15] != 0 && final_arr[14] != 0 && final_arr[11] != 0 && final_arr[10] != 0) {
                if (final_arr[15] == 1 || final_arr[14] == 1 || final_arr[11] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "AC + ";
                    exp_pos_form += "(A' + C').";

                    final_arr[15] = 2;
                    final_arr[14] = 2;
                    final_arr[11] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[1] != 0 && final_arr[3] != 0 && final_arr[2] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1 || final_arr[3] == 1 || final_arr[2] == 1) {
                    exp_sop_form += "A'B' + ";
                    exp_pos_form += "(A + B).";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                    final_arr[3] = 2;
                    final_arr[2] = 2;
                }
            }

            if (final_arr[4] != 0 && final_arr[5] != 0 && final_arr[7] != 0 && final_arr[6] != 0) {
                if (final_arr[4] == 1 || final_arr[5] == 1 || final_arr[7] == 1 || final_arr[6] == 1) {
                    exp_sop_form += "A'B + ";
                    exp_pos_form += "(A + B').";

                    final_arr[4] = 2;
                    final_arr[5] = 2;
                    final_arr[7] = 2;
                    final_arr[6] = 2;
                }
            }

            if (final_arr[12] != 0 && final_arr[13] != 0 && final_arr[15] != 0 && final_arr[14] != 0) {
                if (final_arr[12] == 1 || final_arr[13] == 1 || final_arr[15] == 1 || final_arr[14] == 1) {
                    exp_sop_form += "AB + ";
                    exp_pos_form += "(A' + B').";

                    final_arr[12] = 2;
                    final_arr[13] = 2;
                    final_arr[15] = 2;
                    final_arr[14] = 2;
                }
            }

            if (final_arr[8] != 0 && final_arr[9] != 0 && final_arr[11] != 0 && final_arr[10] != 0) {
                if (final_arr[8] == 1 || final_arr[9] == 1 || final_arr[11] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "AB' + ";
                    exp_pos_form += "(A' + B).";

                    final_arr[8] = 2;
                    final_arr[9] = 2;
                    final_arr[11] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[4] != 0 && final_arr[12] != 0 && final_arr[8] != 0) {
                if (final_arr[0] == 1 || final_arr[4] == 1 || final_arr[12] == 1 || final_arr[8] == 1) {
                    exp_sop_form += "C'D' + ";
                    exp_pos_form += "(C + D).";

                    final_arr[0] = 2;
                    final_arr[4] = 2;
                    final_arr[12] = 2;
                    final_arr[8] = 2;
                }
            }

            if (final_arr[1] != 0 && final_arr[5] != 0 && final_arr[13] != 0 && final_arr[9] != 0) {
                if (final_arr[1] == 1 || final_arr[5] == 1 || final_arr[13] == 1 || final_arr[9] == 1) {
                    exp_sop_form += "C'D + ";
                    exp_pos_form += "(C + D').";

                    final_arr[1] = 2;
                    final_arr[5] = 2;
                    final_arr[13] = 2;
                    final_arr[9] = 2;
                }
            }

            if (final_arr[3] != 0 && final_arr[7] != 0 && final_arr[15] != 0 && final_arr[11] != 0) {
                if (final_arr[3] == 1 || final_arr[7] == 1 || final_arr[15] == 1 || final_arr[11] == 1) {
                    exp_sop_form += "CD + ";
                    exp_pos_form += "(C' + D').";

                    final_arr[3] = 2;
                    final_arr[7] = 2;
                    final_arr[15] = 2;
                    final_arr[11] = 2;
                }
            }

            if (final_arr[2] != 0 && final_arr[6] != 0 && final_arr[14] != 0 && final_arr[10] != 0) {
                if (final_arr[2] == 1 || final_arr[6] == 1 || final_arr[14] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "CD' + ";
                    exp_pos_form += "(C' + D).";

                    final_arr[2] = 2;
                    final_arr[6] = 2;
                    final_arr[14] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[2] != 0 && final_arr[8] != 0 && final_arr[10] != 0) {
                if (final_arr[0] == 1 || final_arr[2] == 1 || final_arr[8] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "B'D' + ";
                    exp_pos_form += "(B + D).";

                    final_arr[0] = 2;
                    final_arr[2] = 2;
                    final_arr[8] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[1] != 0 && final_arr[8] != 0 && final_arr[9] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1 || final_arr[8] == 1 || final_arr[9] == 1) {
                    exp_sop_form += "B'C' + ";
                    exp_pos_form += "(B + C).";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                    final_arr[8] = 2;
                    final_arr[9] = 2;
                }
            }

            if (final_arr[3] != 0 && final_arr[2] != 0 && final_arr[11] != 0 && final_arr[10] != 0) {
                if (final_arr[3] == 1 || final_arr[2] == 1 || final_arr[11] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "B'C + ";
                    exp_pos_form += "(B + C').";

                    final_arr[3] = 2;
                    final_arr[2] = 2;
                    final_arr[11] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[2] != 0 && final_arr[6] != 0 && final_arr[0] != 0 && final_arr[4] != 0) {
                if (final_arr[2] == 1 || final_arr[6] == 1 || final_arr[0] == 1 || final_arr[4] == 1) {
                    exp_sop_form += "A'D' + ";
                    exp_pos_form += "(A + D).";

                    final_arr[2] = 2;
                    final_arr[6] = 2;
                    final_arr[0] = 2;
                    final_arr[4] = 2;
                }
            }

            if (final_arr[14] != 0 && final_arr[10] != 0 && final_arr[12] != 0 && final_arr[8] != 0) {
                if (final_arr[14] == 1 || final_arr[10] == 1 || final_arr[12] == 1 || final_arr[8] == 1) {
                    exp_sop_form += "AD' + ";
                    exp_pos_form += "(A' + D).";

                    final_arr[14] = 2;
                    final_arr[10] = 2;
                    final_arr[12] = 2;
                    final_arr[8] = 2;
                }
            }

            //checking for 2 - 2 groups...
            if (final_arr[0] != 0 && final_arr[1] != 0) {
                if (final_arr[0] == 1 || final_arr[1] == 1) {
                    exp_sop_form += "A'B'C' + ";
                    exp_pos_form += "(A + B + C).";

                    final_arr[0] = 2;
                    final_arr[1] = 2;
                }
            }

            if (final_arr[1] != 0 && final_arr[3] != 0) {
                if (final_arr[1] == 1 || final_arr[3] == 1) {
                    exp_sop_form += "A'B'D + ";
                    exp_pos_form += "(A + B + D').";

                    final_arr[1] = 2;
                    final_arr[3] = 2;
                }
            }

            if (final_arr[3] != 0 && final_arr[2] != 0) {
                if (final_arr[3] == 1 || final_arr[2] == 1) {
                    exp_sop_form += "A'B'C + ";
                    exp_pos_form += "(A + B + C').";

                    final_arr[3] = 2;
                    final_arr[2] = 2;
                }
            }

            if (final_arr[4] != 0 && final_arr[5] != 0) {
                if (final_arr[4] == 1 || final_arr[5] == 1) {
                    exp_sop_form += "A'BC' + ";
                    exp_pos_form += "(A + B' + C).";

                    final_arr[4] = 2;
                    final_arr[5] = 2;
                }
            }

            if (final_arr[5] != 0 && final_arr[7] != 0) {
                if (final_arr[5] == 1 || final_arr[7] == 1) {
                    exp_sop_form += "A'BD + ";
                    exp_pos_form += "(A + B' + D').";

                    final_arr[5] = 2;
                    final_arr[7] = 2;
                }
            }

            if (final_arr[7] != 0 && final_arr[6] != 0) {
                if (final_arr[7] == 1 || final_arr[6] == 1) {
                    exp_sop_form += "A'BC + ";
                    exp_pos_form += "(A + B' + C').";

                    final_arr[7] = 2;
                    final_arr[6] = 2;
                }
            }

            if (final_arr[12] != 0 && final_arr[13] != 0) {
                if (final_arr[12] == 1 || final_arr[13] == 1) {
                    exp_sop_form += "ABC' + ";
                    exp_pos_form += "(A' + B' + C).";

                    final_arr[12] = 2;
                    final_arr[13] = 2;
                }
            }

            if (final_arr[13] != 0 && final_arr[15] != 0) {
                if (final_arr[13] == 1 || final_arr[15] == 1) {
                    exp_sop_form += "ABD + ";
                    exp_pos_form += "(A' + B' + D').";

                    final_arr[13] = 2;
                    final_arr[15] = 2;
                }
            }

            if (final_arr[15] != 0 && final_arr[14] != 0) {
                if (final_arr[15] == 1 || final_arr[14] == 1) {
                    exp_sop_form += "ABC + ";
                    exp_pos_form += "(A' + B' + C').";

                    final_arr[15] = 2;
                    final_arr[14] = 2;
                }
            }

            if (final_arr[8] != 0 && final_arr[9] != 0) {
                if (final_arr[8] == 1 || final_arr[9] == 1) {
                    exp_sop_form += "AB'C' + ";
                    exp_pos_form += "(A' + B + C).";

                    final_arr[8] = 2;
                    final_arr[9] = 2;
                }
            }

            if (final_arr[9] != 0 && final_arr[11] != 0) {
                if (final_arr[9] == 1 || final_arr[11] == 1) {
                    exp_sop_form += "AB'D + ";
                    exp_pos_form += "(A' + B + D').";

                    final_arr[9] = 2;
                    final_arr[11] = 2;
                }
            }

            if (final_arr[11] != 0 && final_arr[10] != 0) {
                if (final_arr[11] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "AB'C + ";
                    exp_pos_form += "(A' + B + C').";

                    final_arr[11] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[4] != 0) {
                if (final_arr[0] == 1 || final_arr[4] == 1) {
                    exp_sop_form += "A'C'D' + ";
                    exp_pos_form += "(A + C + D).";

                    final_arr[0] = 2;
                    final_arr[4] = 2;
                }
            }

            if (final_arr[1] != 0 && final_arr[5] != 0) {
                if (final_arr[1] == 1 || final_arr[5] == 1) {
                    exp_sop_form += "A'C'D + ";
                    exp_pos_form += "(A + C + D').";

                    final_arr[1] = 2;
                    final_arr[5] = 2;
                }
            }

            if (final_arr[3] != 0 && final_arr[7] != 0) {
                if (final_arr[3] == 1 || final_arr[7] == 1) {
                    exp_sop_form += "A'CD + ";
                    exp_pos_form += "(A + C' + D').";

                    final_arr[3] = 2;
                    final_arr[7] = 2;
                }
            }

            if (final_arr[2] != 0 && final_arr[6] != 0) {
                if (final_arr[2] == 1 || final_arr[6] == 1) {
                    exp_sop_form += "A'CD' + ";
                    exp_pos_form += "(A + C' + D).";

                    final_arr[2] = 2;
                    final_arr[6] = 2;
                }
            }

            if (final_arr[4] != 0 && final_arr[12] != 0) {
                if (final_arr[4] == 1 || final_arr[12] == 1) {
                    exp_sop_form += "BC'D' + ";
                    exp_pos_form += "(B' + C + D).";

                    final_arr[4] = 2;
                    final_arr[12] = 2;
                }
            }

            if (final_arr[5] != 0 && final_arr[13] != 0) {
                if (final_arr[5] == 1 || final_arr[13] == 1) {
                    exp_sop_form += "BC'D + ";
                    exp_pos_form += "(B' + C + D').";

                    final_arr[5] = 2;
                    final_arr[13] = 2;
                }
            }

            if (final_arr[7] != 0 && final_arr[15] != 0) {
                if (final_arr[7] == 1 || final_arr[15] == 1) {
                    exp_sop_form += "BCD + ";
                    exp_pos_form += "(B' + C' + D').";

                    final_arr[7] = 2;
                    final_arr[15] = 2;
                }
            }

            if (final_arr[6] != 0 && final_arr[14] != 0) {
                if (final_arr[6] == 1 || final_arr[14] == 1) {
                    exp_sop_form += "BCD' + ";
                    exp_pos_form += "(B' + C' + D).";

                    final_arr[6] = 2;
                    final_arr[14] = 2;
                }
            }

            if (final_arr[12] != 0 && final_arr[8] != 0) {
                if (final_arr[12] == 1 || final_arr[8] == 1) {
                    exp_sop_form += "AC'D' + ";
                    exp_pos_form += "(A' + C + D).";

                    final_arr[12] = 2;
                    final_arr[8] = 2;
                }
            }

            if (final_arr[13] != 0 && final_arr[9] != 0) {
                if (final_arr[13] == 1 || final_arr[9] == 1) {
                    exp_sop_form += "AC'D + ";
                    exp_pos_form += "(A' + C + D').";

                    final_arr[13] = 2;
                    final_arr[9] = 2;
                }
            }
            if (final_arr[15] != 0 && final_arr[11] != 0) {
                if (final_arr[15] == 1 || final_arr[11] == 1) {
                    exp_sop_form += "ACD + ";
                    exp_pos_form += "(A' + C' + D').";

                    final_arr[15] = 2;
                    final_arr[11] = 2;
                }
            }

            if (final_arr[14] != 0 && final_arr[10] != 0) {
                if (final_arr[14] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "ACD' + ";
                    exp_pos_form += "(A' + C' + D).";

                    final_arr[14] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[8] != 0) {
                if (final_arr[0] == 1 || final_arr[8] == 1) {
                    exp_sop_form += "B'C'D' + ";
                    exp_pos_form += "(B + C + D).";

                    final_arr[0] = 2;
                    final_arr[8] = 2;
                }
            }

            if (final_arr[0] != 0 && final_arr[2] != 0) {
                if (final_arr[0] == 1 || final_arr[2] == 1) {
                    exp_sop_form += "A'B'D' + ";
                    exp_pos_form += "(A + B + D).";

                    final_arr[0] = 2;
                    final_arr[2] = 2;
                }
            }

            if (final_arr[2] != 0 && final_arr[10] != 0) {
                if (final_arr[2] == 1 || final_arr[10] == 1) {
                    exp_sop_form += "B'CD' + ";
                    exp_pos_form += "(B + C' + D).";

                    final_arr[2] = 2;
                    final_arr[10] = 2;
                }
            }

            if (final_arr[10] != 0 && final_arr[8] != 0) {
                if (final_arr[10] == 1 || final_arr[8] == 1) {
                    exp_sop_form += "AB'D' + ";
                    exp_pos_form += "(A' + B + D).";

                    final_arr[10] = 2;
                    final_arr[8] = 2;
                }
            }


            //checking for 1 - 1 group
            if (final_arr[0] == 1) {
                exp_sop_form += "A'B'C'D' + ";
                exp_pos_form += "(A + B + C + D).";

                final_arr[0] = 2;
            }

            if (final_arr[1] == 1) {
                exp_sop_form += "A'B'C'D + ";
                exp_pos_form += "(A + B + C + D').";

                final_arr[1] = 2;
            }

            if (final_arr[2] == 1) {
                exp_sop_form += "A'B'CD' + ";
                exp_pos_form += "(A + B + C' + D).";

                final_arr[2] = 2;
            }

            if (final_arr[3] == 1) {
                exp_sop_form += "A'B'CD + ";
                exp_pos_form += "(A + B + C' + D').";

                final_arr[3] = 2;
            }

            if (final_arr[4] == 1) {
                exp_sop_form += "A'BC'D' + ";
                exp_pos_form += "(A + B' + C + D).";

                final_arr[4] = 2;
            }

            if (final_arr[5] == 1) {
                exp_sop_form += "A'BC'D + ";
                exp_pos_form += "(A + B' + C + D').";

                final_arr[5] = 2;
            }

            if (final_arr[6] == 1) {
                exp_sop_form += "A'BCD' + ";
                exp_pos_form += "(A + B' + C' + D).";

                final_arr[6] = 2;
            }

            if (final_arr[7] == 1) {
                exp_sop_form += "A'BCD + ";
                exp_pos_form += "(A + B' + C' + D').";

                final_arr[7] = 2;
            }

            if (final_arr[8] == 1) {
                exp_sop_form += "AB'C'D' + ";
                exp_pos_form += "(A' + B + C + D).";

                final_arr[8] = 2;
            }

            if (final_arr[9] == 1) {
                exp_sop_form += "AB'C'D + ";
                exp_pos_form += "(A' + B + C + D').";

                final_arr[9] = 2;
            }

            if (final_arr[10] == 1) {
                exp_sop_form += "AB'CD' + ";
                exp_pos_form += "(A' + B + C' + D).";

                final_arr[10] = 2;
            }

            if (final_arr[11] == 1) {
                exp_sop_form += "AB'CD + ";
                exp_pos_form += "(A' + B + C' + D').";

                final_arr[11] = 2;
            }

            if (final_arr[12] == 1) {
                exp_sop_form += "ABC'D' + ";
                exp_pos_form += "(A' + B' + C + D).";

                final_arr[12] = 2;
            }

            if (final_arr[13] == 1) {
                exp_sop_form += "ABC'D + ";
                exp_pos_form += "(A' + B' + C + D').";

                final_arr[13] = 2;
            }

            if (final_arr[14] == 1) {
                exp_sop_form += "ABCD' + ";
                exp_pos_form += "(A' + B' + C' + D).";

                final_arr[14] = 2;
            }

            if (final_arr[15] == 1) {
                exp_sop_form += "ABCD + ";
                exp_pos_form += "(A' + B' + C' + D').";

                final_arr[15] = 2;
            }

            Intent intent = new Intent(this, four_variable_3rd.class);
            intent.putExtra(exp_key_for_sop, exp_sop_form);
            intent.putExtra(exp_key_for_pos, exp_pos_form);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Please enter all the number", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_variable2nd);

        Intent intent = getIntent();
        String number_of_times_string = intent.getStringExtra(four_variable_1st.key);
        number_of_times = Integer.parseInt(number_of_times_string);
    }
}