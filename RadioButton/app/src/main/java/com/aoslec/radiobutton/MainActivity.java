package com.aoslec.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.rg_01);
        radioGroup.setOnCheckedChangeListener(checkedChangeListener);
    }

    RadioGroup.OnCheckedChangeListener checkedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            String str = "";
            switch (checkedId){
                case R.id.rb_01:
                    str += "서울";
                    break;
                case R.id.rb_02:
                    str += "경기도";
                    break;
                case R.id.rb_03:
                    str += "강원도";
                    break;
                case R.id.rb_04:
                    str += "충청도";
                    break;
                case R.id.rb_05:
                    str += "경상도";
                    break;
                case R.id.rb_06:
                    str += "전라도";
                    break;
                case R.id.rb_07:
                    str += "제주도";
                    break;
            } // switch
            Toast.makeText(MainActivity.this, str + " is your Hometown",
                            Toast.LENGTH_SHORT).show();
        } //void


    }; //checkCL


}// Main Activity