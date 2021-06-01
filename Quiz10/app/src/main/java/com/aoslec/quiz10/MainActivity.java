package com.aoslec.quiz10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView01, textView02;
    ImageView dog, cat, rabbit;
    LinearLayout linear1;
    CheckBox checkbox;
    RadioGroup rg01;
    RadioButton rb01, rb02, rb03;
    Button button;
    FrameLayout frame01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox = findViewById(R.id.cb_start);

        linear1 = findViewById(R.id.linear1);
        linear1.setVisibility(LinearLayout.INVISIBLE);
        frame01 = findViewById(R.id.frame1);
        frame01.setVisibility(FrameLayout.INVISIBLE);
        checkbox.setOnCheckedChangeListener(checkListener);
        rg01 = findViewById(R.id.rg_animal);
        rb01 = findViewById(R.id.rb_dog);
        rb02 = findViewById(R.id.rb_cat);
        rb03 = findViewById(R.id.rb_rabbit);
        dog = findViewById(R.id.frame_dog);
        cat = findViewById(R.id.frame_cat);
        rabbit = findViewById(R.id.frame_rabbit);

        button = findViewById(R.id.btn_select);
        button.setOnClickListener(clickListener);



    }//onCreate

    CompoundButton.OnCheckedChangeListener checkListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            if (checkbox.isChecked() == true){
                linear1.setVisibility(LinearLayout.VISIBLE);
            }else if (checkbox.isChecked() == false){
                linear1.setVisibility(LinearLayout.INVISIBLE);
                frame01.setVisibility(FrameLayout.INVISIBLE);
            }
        }//onCheck


    };// checkLis

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            frame01.setVisibility(FrameLayout.VISIBLE);
            if (rb01.isChecked() == true){
                dog.setVisibility(ImageView.VISIBLE);
                cat.setVisibility(ImageView.INVISIBLE);
                rabbit.setVisibility(ImageView.INVISIBLE);
            } else if(rb02.isChecked() == true){
                cat.setVisibility(ImageView.VISIBLE);
                dog.setVisibility(ImageView.INVISIBLE);
                rabbit.setVisibility(ImageView.INVISIBLE);
            } else if(rb03.isChecked() == true) {
                rabbit.setVisibility(ImageView.VISIBLE);
                cat.setVisibility(ImageView.INVISIBLE);
                dog.setVisibility(ImageView.INVISIBLE);

            }
        }
    };


}//Main