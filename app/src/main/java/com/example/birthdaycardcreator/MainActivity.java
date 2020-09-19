package com.example.birthdaycardcreator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.nameInput);
    }

    public void createBirthdayCard(View view)
    {

        Intent intent = new Intent(this, BirthdayCardActivity.class);
        intent.putExtra("name", nameInput.toString());
        startActivity(intent);
        Toast.makeText(this, "Name is "+ nameInput.toString(), Toast.LENGTH_SHORT).show();
    }
}
