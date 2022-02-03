package com.example.mentalcounting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Button button = findViewById(R.id.previous_score_button);
        button.setOnClickListener(view -> showPreviousActivity());
    }

    private void showPreviousActivity() {
        finish();
    }

}
