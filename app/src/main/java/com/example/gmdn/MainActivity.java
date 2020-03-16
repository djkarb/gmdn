package com.example.gmdn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String KEY_TEXT = "text";

    private TextView t;
    private Button b;
    private EditText e;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            text = savedInstanceState.getString(KEY_TEXT);
        }

        t = findViewById(R.id.displayMessage);
        b = findViewById(R.id.enter_button);
        e = findViewById(R.id.input_field);

        t.setText(text);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = e.getText().toString();
                t.setText(text);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "saved state");
        outState.putString(KEY_TEXT, text);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
        Toast.makeText(this, "Hai lasciato l'app",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }
}
