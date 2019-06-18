package com.example.homecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton sc,gt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connect();
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SkinCare.class);
                startActivity(intent);
            }
        });
        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,GeneralTips.class);
                startActivity(intent1);

            }
        });
    }

    private void connect() {
        sc=findViewById(R.id.sc);
        gt=findViewById(R.id.gt);

    }
}
