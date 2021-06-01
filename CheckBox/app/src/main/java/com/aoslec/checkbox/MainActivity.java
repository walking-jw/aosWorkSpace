package com.aoslec.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4;
    ArrayList<String> hobby = new ArrayList<String>();
    String [] cb = {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.cb_01);
        cb2 = findViewById(R.id.cb_02);
        cb3 = findViewById(R.id.cb_03);
        cb4 = findViewById(R.id.cb_04);

        cb1.setOnCheckedChangeListener(checkChangeListener);
        cb2.setOnCheckedChangeListener(checkChangeListener);
        cb3.setOnCheckedChangeListener(checkChangeListener);
        cb4.setOnCheckedChangeListener(checkChangeListener);



    } // onCreate

    CompoundButton.OnCheckedChangeListener checkChangeListener
            = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            if (cb1.isChecked() == true) {
                hobby.add("운동");
            }
            if (cb1.isChecked() == false) {
                hobby.remove("운동");
            }
            if (cb2.isChecked() == true) {
                hobby.add("요리");
            }
            if (cb2.isChecked() == false) {
                hobby.remove("요리");
            }

            Toast.makeText(MainActivity.this, hobby + " is checked.",
                            Toast.LENGTH_SHORT).show();

            } // onChecked

    }; //checkChangeListener




} // MainActivity