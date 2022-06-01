package com.example.localstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    private EditText full_name, email, password;
    private Button btn_registration;
    private TextView login;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        full_name = findViewById(R.id.full_name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn_registration = findViewById(R.id.btn_registration);
        login = findViewById(R.id.login);
        logo = findViewById(R.id.logo);

        login.setOnClickListener(view -> {
            Intent intent = new Intent(RegistrationActivity.this, LogInActivity.class);
            startActivity(intent);
        });
    }
}