package com.example.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private Button btnChange;
private EditText editTextChange;
private TextView  txtChangeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChange=(Button) findViewById(R.id.button);
        editTextChange=(EditText)findViewById(R.id.editText);
        txtChangeText=(TextView)findViewById(R.id.hello);
      /*  findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SecondActivity.class));
            }
        });*/
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getApplicationContext(), SecondActivity.class));
                txtChangeText.setText(editTextChange.getText());
            }
        });

    }
}
