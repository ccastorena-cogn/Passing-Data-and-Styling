package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameText, emailText;
    private Button button;
    private String name;
    private String email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.mName);
        emailText = findViewById(R.id.mEmail);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitData();
            }
        });
    }

    public void submitData() {
        name = nameText.getText().toString().trim();
        email = emailText.getText().toString().trim();

        Intent i = new Intent(MainActivity.this,MainActivity2.class);

        i.putExtra(MainActivity2.NAME,name);
        i.putExtra(MainActivity2.EMAIL,email);

        startActivity(i);


    }

}