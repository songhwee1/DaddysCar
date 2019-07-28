package com.mojuk.daddyscar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.main_btn_1);
        btn2=findViewById(R.id.main_btn_2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view==btn1) {
            Intent intent = new Intent(this, Recognize_carnoActivity.class);

            startActivity(intent);
        }
        else if (view==btn2) {
            Intent intent = new Intent(this,Nearby_taxiActivity.class);

            startActivity(intent);
        }
    }
}
