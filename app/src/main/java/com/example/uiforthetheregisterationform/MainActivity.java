package com.example.uiforthetheregisterationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, email, phone, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);

        name.getBackground().setAlpha(45);
        email.getBackground().setAlpha(45);
        phone.getBackground().setAlpha(45);
        password.getBackground().setAlpha(45);
    }
}
