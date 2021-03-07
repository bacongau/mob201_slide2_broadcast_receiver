package com.example.mob201_slide2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    BroadcastReceiver broadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.txtMsg);
        button = findViewById(R.id.btnShow);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText st = (EditText)findViewById(R.id.txtMsg);
                Intent intent = new Intent();
                intent.putExtra("msg",(CharSequence)st.getText().toString());
                intent.setAction("com.tutlane.CUSTOM_INTENT");
                sendBroadcast(intent);
            }
        });
    }
}