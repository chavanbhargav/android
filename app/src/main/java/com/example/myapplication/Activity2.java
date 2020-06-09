package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        text=(TextView)findViewById(R.id.textView) ;

        Intent intent=getIntent();
        int result=intent.getIntExtra("result",0);
        text.setText(" "+result);

    }
}
