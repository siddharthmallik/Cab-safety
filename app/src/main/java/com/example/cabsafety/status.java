package com.example.cabsafety;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class status extends AppCompatActivity  {

private Button button,button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        button=findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {


                                          Intent in = new Intent(status.this, Devices.class);
                                          startActivity(in);
                                      }
                                  });

          button1=findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(status.this,History.class);
                startActivity(in);
            }
        });
        button2=findViewById(R.id.btn3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(status.this,Track.class);
                startActivity(in);
            }
        });

        button3=findViewById(R.id.btn6);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(status.this, LogOut.class);
                startActivity(in);
            }
        });






    }
}
