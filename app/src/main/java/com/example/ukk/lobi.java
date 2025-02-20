package com.example.ukk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lobi extends AppCompatActivity {

    private TextView homeTextView;
    private Button kategoriButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lobi);

        homeTextView = findViewById(R.id.Home);
        kategoriButton = findViewById(R.id.Kategori);
        imageView = findViewById(R.id.Image);

        kategoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeTextView.setText("Kategori Button Clicked");  // Example: changing TextView text on button click
            }
        });
    }
}
