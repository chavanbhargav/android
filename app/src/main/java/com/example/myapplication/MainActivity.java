package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    Button add;
    TextView textView;
    AlertDialog.Builder alert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.tv);
      add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              editText1 = (EditText) findViewById(R.id.et1);
              editText2 = (EditText) findViewById(R.id.et2);
              if(editText1.getText().toString().equals("")||editText2.getText().toString().equals("")){
                  Toast.makeText(MainActivity.this,"enter the number",Toast.LENGTH_SHORT).show();
              }
              else {

                    AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                    alert.setMessage("are you want to go");
                    alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            int number1 = Integer.parseInt(editText1.getText().toString());
                            int number2 = Integer.parseInt(editText2.getText().toString());
                            int result = number1 + number2;
                            Intent intent=new Intent(MainActivity.this,Activity2.class);
                            intent.putExtra("result",  result);
                            startActivity(intent);
                        }
                    });
                    alert.setNegativeButton("cancel",null);
                    alert.setCancelable(true);
                    AlertDialog alert1=alert.create();
                    alert1.show();

              }
          }
      });



    }
}
