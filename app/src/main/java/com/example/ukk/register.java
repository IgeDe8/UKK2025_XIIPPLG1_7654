package com.example.ukk;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    private EditText mEmail, mUsername, mPassword;
    private Button mRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        mEmail = findViewById(R.id.Email);
        mUsername = findViewById(R.id.username);
        mPassword = findViewById(R.id.Password);
        mRegisterButton = findViewById(R.id.buttonlogin);
        mRegisterButton.setOnClickListener(view -> {


            String email = mEmail.getText().toString().trim();
            String username = mUsername.getText().toString().trim();
            String password = mPassword.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                mEmail.setError("Email tidak boleh kosong");
                mEmail.requestFocus();
            }
        });
    }
}
