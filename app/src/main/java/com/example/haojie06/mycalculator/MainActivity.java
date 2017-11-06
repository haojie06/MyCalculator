package com.example.haojie06.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String expression = "";
    double result;
    double ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView main_text = (TextView) findViewById(R.id.text_main);
        final TextView last_view = (TextView) findViewById(R.id.last_step);

        //获得按键对象
        Button button_0 = (Button) findViewById(R.id.num_0);
        Button button_1 = (Button) findViewById(R.id.num_1);
        Button button_2 = (Button) findViewById(R.id.num_2);
        Button button_3 = (Button) findViewById(R.id.num_3);
        Button button_4 = (Button) findViewById(R.id.num_4);
        Button button_5 = (Button) findViewById(R.id.num_5);
        Button button_6 = (Button) findViewById(R.id.num_6);
        Button button_7 = (Button) findViewById(R.id.num_7);
        Button button_8 = (Button) findViewById(R.id.num_8);
        Button button_9 = (Button) findViewById(R.id.num_9);

        Button button_ac = (Button) findViewById(R.id.key_AC);
        Button button_del = (Button) findViewById(R.id.key_DEL);
        Button button_equ = (Button) findViewById(R.id.key_EQUAL);
        Button button_div = (Button) findViewById(R.id.key_divide);
        Button button_mul = (Button) findViewById(R.id.key_MULTIPLY);
        Button button_sub = (Button) findViewById(R.id.key_SUBTRACT);
        Button button_plu = (Button) findViewById(R.id.key_PLUS);
        Button button_dot = (Button) findViewById(R.id.key_DOT);
        Button button_pow = (Button) findViewById(R.id.key_POW);
        Button button_left = (Button) findViewById(R.id.left);
        Button button_right = (Button) findViewById(R.id.right);

        //计算器对象
        final Calculator calculathor = new Calculator();




        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "0";
                main_text.setText(expression);
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "1";
                main_text.setText(expression);
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "2";
                main_text.setText(expression);
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "3";
                main_text.setText(expression);
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "4";
                main_text.setText(expression);
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "5";
                main_text.setText(expression);
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "6";
                main_text.setText(expression);
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "7";
                main_text.setText(expression);
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "8";
                main_text.setText(expression);
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "9";
                main_text.setText(expression);
            }
        });

        button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = "";
                main_text.setText(expression);
            }
        });

        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expression != "") {
                    expression = expression.substring(0, (expression.length() - 1));
                    main_text.setText(expression);
                }
            }
        });

        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "(";
                main_text.setText(expression);
            }
        });

        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += ")";
                main_text.setText(expression);
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "/";
                main_text.setText(expression);
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "*";
                main_text.setText(expression);
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "-";
                main_text.setText(expression);
            }
        });

        button_plu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += "+";
                main_text.setText(expression);
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += ".";
                main_text.setText(expression);
            }
        });

        button_pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    expression += "^";
                    main_text.setText(expression);

            }
        });

        button_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!expression.isEmpty()) {
                    String temp_exp;
                    temp_exp = expression;
                    temp_exp += "=";
                    last_view.setText(temp_exp);
                    result = calculathor.evalExp(expression);
                    expression = Double.toString(result);

                    main_text.setText(expression);
                    ans = result;
                    expression = "";
                    temp_exp = "";
                }

            }
        });






    }
}
