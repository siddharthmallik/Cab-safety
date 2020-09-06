package com.example.cabsafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Devices extends AppCompatActivity {

    private Button button,button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);

        button=findViewById(R.id.btn9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(Devices.this, Device1.class);
                startActivity(in);
            }
        });

        button1=findViewById(R.id.btn8);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(Devices.this, Device2.class);
                startActivity(in);
            }
        });

        button2=findViewById(R.id.btn7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(Devices.this, Device3.class);
                startActivity(in);
            }
        });


    }
}
