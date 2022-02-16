package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public static final String NAME = "NAME";
    public static final String EMAIL = "EMAIL";
    private TextView nameText, emailText;
    private String name;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameText = findViewById(R.id.mName);
        emailText = findViewById(R.id.mEmail);

        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        email = i.getStringExtra(EMAIL);

        nameText.setText(getString(R.string.hello) +name);
        emailText.setText(getString(R.string.email_provided)+email);
    }
}