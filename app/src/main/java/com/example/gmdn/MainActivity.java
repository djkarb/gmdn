package com.example.gmdn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t;
    private Button b;
    private EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.displayMessage);
        b = (Button) findViewById(R.id.enter_button);
        e = (EditText) findViewById(R.id.input_field);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String messaggio = e.getText().toString();
                t.setText(messaggio);
            }
        });
    }
}
