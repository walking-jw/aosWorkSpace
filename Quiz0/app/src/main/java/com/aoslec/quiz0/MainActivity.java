package com.aoslec.quiz0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button RedButton, BlueButton, GreenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 화면띄우기!

        RedButton = findViewById(R.id.btnRed); //버튼 띄우
        BlueButton = findViewById(R.id.btnBlue);
        GreenButton = findViewById(R.id.btnGreen);

        RedButton.setOnClickListener(onClickListener); // 누르면 온클릭메소드를 한다! // 준비단계
        BlueButton.setOnClickListener(onClickListener); // 누르면 온클릭메소드를 한다! // 준비단계
        GreenButton.setOnClickListener(onClickListener); // 누르면 온클릭메소드를 한다! // 준비단계

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colorString = "";

                switch (v.getId()){
                    case R.id.btnRed:
                        colorString = "빨간색";
                        break;
                    case R.id.btnBlue:
                        colorString = "파란색";
                        break;
                    case R.id.btnGreen:
                        colorString = "녹색"; 
                        break;
                }
                Toast.makeText(MainActivity.this, colorString + "버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        };



    }
}