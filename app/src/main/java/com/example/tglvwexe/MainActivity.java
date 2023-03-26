package com.example.tglvwexe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    LinearLayout lnv;
    ToggleButton tgl;
    Switch swt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lnv=(LinearLayout) findViewById(R.id.lnv);
        tgl=(ToggleButton) findViewById(R.id.tgl);
        swt=(Switch) findViewById(R.id.swt);
        btn=(Button) findViewById(R.id.btn);
    }

    public void go(View view) {
        if(tgl.isChecked()){
            if(swt.isChecked()){
                lnv.setBackgroundColor(0xFFFF0000);
            }
            else {
                lnv.setBackgroundColor(0xFF00FF00);
            }
        }
        else{
            if(swt.isChecked()){
                lnv.setBackgroundColor(0xFF0000FF);
            }
            else {
                lnv.setBackgroundColor(0xFFFFFFFF);
            }
        }
    }
}