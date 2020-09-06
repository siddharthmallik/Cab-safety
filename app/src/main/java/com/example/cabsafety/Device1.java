package com.example.cabsafety;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Device1 extends AppCompatActivity {

    Button start_animation;
    TextView tx1, tx2, tx3, txt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device1);

        start_animation = findViewById(R.id.btn29);
        tx1 = findViewById(R.id.txt96);
        tx2 = findViewById(R.id.text52);
        tx3 = findViewById(R.id.text53);
        txt4 = findViewById(R.id.text54);

        start_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_animation();
            }
        });
    }

    private void start_animation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
        tx1.startAnimation(animation);
        tx2.startAnimation(animation);
        tx3.startAnimation(animation);
        txt4.startAnimation(animation);
    }
}
