package com.example.cabsafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class LogOut extends AppCompatActivity {

private FirebaseAuth firebaseAuth;
private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);

        firebaseAuth = FirebaseAuth.getInstance();
        logout=(Button)findViewById(R.id.btn6);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                Toast.makeText(LogOut.this,"Logged Out Successfully",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LogOut.this,MainActivity.class));
            }
        });
    }
}
