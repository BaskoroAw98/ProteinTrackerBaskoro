package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView myTextView = new TextView(this);
        myTextView.setText("Some Help Text");
        setContentView(myTextView);

        TextView myTextView2 = new TextView(this);
        Bundle b = getIntent().getExtras();

        String helpText = b.getString("helpString");
        myTextView.setText(helpText);
        setContentView(myTextView);

    }
}
