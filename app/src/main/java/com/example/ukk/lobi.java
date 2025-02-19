package com.example.ukk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lobi extends AppCompatActivity {

    // Declare the UI elements
    private TextView homeTextView;
    private Button kategoriButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lobi);  // Set the layout file

        // Initialize the UI elements by finding them by their IDs
        homeTextView = findViewById(R.id.Home);
        kategoriButton = findViewById(R.id.Kategori);
        imageView = findViewById(R.id.Image);

        // Set up any necessary functionality or listeners (e.g., for button clicks)
        kategoriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the button click event here
                homeTextView.setText("Kategori Button Clicked");  // Example: changing TextView text on button click
            }
        });
    }
}
