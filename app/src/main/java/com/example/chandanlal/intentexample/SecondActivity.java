package com.example.chandanlal.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final Object ExtraData = "Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message=intent.getStringExtra((String) ExtraData);// getting message from intent
        TextView showMessage = findViewById(R.id.showMessage);
        showMessage.setText(message);
    }
}
