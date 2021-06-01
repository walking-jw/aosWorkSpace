package com.aoslec.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // 프로퍼티 = 필드
    // 버튼은 버튼타입이다!
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnOk); // 리소스 안에있는 버튼을 찾는다! 안드는 모든게 int 값

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "버튼을 누르다!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}