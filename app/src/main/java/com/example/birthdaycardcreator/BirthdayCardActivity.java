package com.example.birthdaycardcreator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class BirthdayCardActivity extends AppCompatActivity
{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_card);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
  //      Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        textView = findViewById(R.id.textView);
        name= Character.toUpperCase(name.charAt(0)) + name.substring(1);
        textView.setText("Happy Birthday \n"+name+"!");
    }
}
