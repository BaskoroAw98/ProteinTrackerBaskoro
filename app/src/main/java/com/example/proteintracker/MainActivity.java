package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);
        Button helpBtn = (Button) findViewById(R.id.Help);
        helpBtn.setOnClickListener(helpButtonListener);
        if (savedInstanceState != null){
            Log.d("PtoteinTracker",savedInstanceState.getString("abc"));

        }

    }
    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, HelpActivity.class);
            startActivity(intent);
            Bundle b = new Bundle();
            EditText myEditText = (EditText) findViewById(R.id.edt_name);
            b.putString("helpString", myEditText.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
        };
        protected void onSaveInstanceState(Bundle outState) {
            MainActivity.super.onSaveInstanceState(outState);

            outState.putString("abc","test");
                MainActivity.super.onSaveInstanceState(outState);

        }
    };
