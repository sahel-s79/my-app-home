package com.example.myapphome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity{


    EditText emailbox,passwordbox;
    Button loginbtn,signbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailbox=findViewById(R.id.emailbox);
        passwordbox=findViewById(R.id.passwordbox);

        loginbtn=findViewById(R.id.loginbtn);
        signbtn=findViewById(R.id.creatbtn);

        signbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,SignUpActivity.class));
            }
        });
    }
}