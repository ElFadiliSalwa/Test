package com.example.localstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    private EditText email, password;
    private Button btn_login;
    private TextView register;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_logIn);
        register = findViewById(R.id.register);
        logo = findViewById(R.id.logo);

        register.setOnClickListener(view -> {
            Intent intent = new Intent(LogInActivity.this, RegistrationActivity.class);
            startActivity(intent);
        });
    }
}