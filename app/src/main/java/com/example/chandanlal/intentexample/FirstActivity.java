package com.example.chandanlal.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }
    // On clicking send the button android will start the second activity by passing the intent to onStsrtActivity()
    public void onSendMessage(View view)
    {
        EditText message = findViewById(R.id.message);
        String messageText  = message.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(String.valueOf(SecondActivity.ExtraData),messageText);
        startActivity(intent);

    }
}
