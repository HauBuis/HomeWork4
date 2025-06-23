package com.example.bai4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.gridLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        CardView cardCountries = findViewById(R.id.cardCountries);
        CardView cardLeaders = findViewById(R.id.cardLeaders);
        CardView cardMuseums = findViewById(R.id.cardMuseums);
        CardView cardWonders = findViewById(R.id.cardWonders);


        cardCountries.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, CountriesActivity.class)));

        cardLeaders.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, LeadersActivity.class)));

        cardMuseums.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, MuseumsActivity.class)));

        cardWonders.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, WondersActivity.class)));
    }
}
