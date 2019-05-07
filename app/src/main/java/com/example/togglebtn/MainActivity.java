package com.example.togglebtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


Boolean blFalse = false;
Boolean blTrue =true;


    private View.OnClickListener btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(((ToggleButton)v).isChecked()) {
                btn1.setChecked(blFalse);
                btn2.setChecked(blFalse);
                btn3.setChecked(blFalse);
              ((ToggleButton) v).setChecked(blTrue);

            } else {
                ((ToggleButton) v).setChecked(blFalse);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitialComponent();


    }

    private void InitialComponent() {
            btn1=findViewById(R.id.btn1);
            btn1.setOnClickListener(btn_click);
            btn2=findViewById(R.id.btn2);
            btn2.setOnClickListener(btn_click);
            btn3=findViewById(R.id.btn3);
            btn3.setOnClickListener(btn_click);
    }

ToggleButton btn1,btn2,btn3;


}
