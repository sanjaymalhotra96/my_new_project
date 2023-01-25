package com.example.mynewproject.speaking.cuecards;


import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mynewproject.R;

public class CureCardRecording extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cure_card_recording);
        textView=findViewById(R.id.textview_cue);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}