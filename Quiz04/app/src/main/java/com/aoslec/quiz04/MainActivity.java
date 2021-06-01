package com.aoslec.quiz04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText Editnum1, Editnum2;
    Button btn1, btn2, btn3, btn4;
    TextView resultNum, resultSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Editnum1 = findViewById(R.id.num1);
        Editnum2 = findViewById(R.id.num2);

        btn1 = findViewById(R.id.plus);
        btn2 = findViewById(R.id.minus);
        btn3 = findViewById(R.id.multi);
        btn4 = findViewById(R.id.div);

        resultSet = findViewById(R.id.resultSet);
        resultNum = findViewById(R.id.result);



        View.OnClickListener onClickListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.plus:
                        int result = Integer.valueOf(Editnum1.getText().toString().trim())
                                + Integer.valueOf(Editnum2.getText().toString().trim());
                            resultSet.setText(Integer.toString(result));
                        break;
                    case R.id.minus:
                        result = Integer.valueOf(Editnum1.getText().toString().trim())
                                - Integer.valueOf(Editnum2.getText().toString().trim());
                        resultSet.setText(Integer.toString(result));
                        break;
                    case R.id.multi:
                        result = Integer.valueOf(Editnum1.getText().toString().trim())
                                * Integer.valueOf(Editnum2.getText().toString().trim());
                        resultSet.setText(Integer.toString(result));
                        break;
                    case R.id.div:
                        result = Integer.valueOf(Editnum1.getText().toString().trim())
                                / Integer.valueOf(Editnum2.getText().toString().trim());
                        resultSet.setText(Integer.toString(result));
                        break;
                }
            }

        };

        btn1.setOnClickListener(onClickListner);
        btn2.setOnClickListener(onClickListner);
        btn3.setOnClickListener(onClickListner);
        btn4.setOnClickListener(onClickListner);

    }
}