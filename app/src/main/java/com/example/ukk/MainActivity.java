package com.example.ukk;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView LoginTextView;
    private Button button;
    private EditText EmailEditText;
    private EditText PasswordEditText;
    private TextView RegisterTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginTextView = findViewById(R.id.Login);
        EmailEditText = findViewById(R.id.Email);
        PasswordEditText = findViewById(R.id.Password);
        RegisterTextView = findViewById(R.id.Register);
        button = findViewById(R.id.buttonlogin);
        button.setOnClickListener(v -> LoginTextView.setText("Register Kliked"));

    }
}