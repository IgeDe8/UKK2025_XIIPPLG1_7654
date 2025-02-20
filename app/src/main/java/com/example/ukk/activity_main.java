package com.example.ukk;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.net.URL;

public class activity_main extends AppCompatActivity {
    private TextView user;
    private Button btn_login;
    private EditText Email, pass;
    private TextView Register;



 @Override
    protected void oncCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);

      user = findViewById(R.id.email);
      btn_login = findViewById(R.id.buttonlogin);
     pass = findViewById(R.id.password);
     Register = findViewById(R.id.Register);

     btn_login.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String username = user.getText().toString().trim();
             String password = pass.getText().toString().trim();

             if (username.isEmpty() || password.isEmpty()) {
                 Toast.makeText(activity_main.this, "Username dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
             } else {
                 login (username, password);
             }

         }
     });
