package com.example.cabsafety;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

     EditText Depart_Id,Pin;
private FirebaseAuth.AuthStateListener mAuthStateListener;
     FirebaseAuth mFirebaseAuth;
     Button button;
    RelativeLayout rellay1;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
        }


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAuth=FirebaseAuth.getInstance();
        Depart_Id=findViewById(R.id.text1);
        Pin=findViewById(R.id.text22);
        mFirebaseAuth =FirebaseAuth.getInstance();



       mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if (mFirebaseUser != null) {
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
                }

            }
        };

        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dept=Depart_Id.getText().toString();
                String pin=Pin.getText().toString();
                if (dept.equals("MCA") && pin.equals("112233")) {

                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
                    Intent in = new Intent(MainActivity.this,status.class);
                    startActivity(in);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Unsuccessfull", Toast.LENGTH_LONG).show();
                }

            }
        });


        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);

        handler.postDelayed(runnable,1000);
    }
    @Override
    protected void onStart(){
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }
}
