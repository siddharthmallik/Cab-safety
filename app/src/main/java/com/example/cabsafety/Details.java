package com.example.cabsafety;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Details extends AppCompatActivity {


Button start_animation;
TextView tx1,tx2,tx3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        start_animation = findViewById(R.id.btn65);
        tx1= findViewById(R.id.txt08);
        tx2=findViewById(R.id.txt09);
        tx3=findViewById(R.id.txt07);
        txt4=findViewById(R.id.text06);

        start_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             start_animation();
            }
        });




    }
    private  void  start_animation(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);
        tx1.startAnimation(animation);
        tx2.startAnimation(animation);
        tx3.startAnimation(animation);
        txt4.startAnimation(animation);
    }
}
