package com.chuda.mobvious.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chuda.mobvious.R;

public class RegistrasiActivity extends AppCompatActivity {
    EditText edtFullnameRegister, edtUsername, edtEmail;
    Button btnRegister, btnToLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        edtFullnameRegister = findViewById(R.id.edt_fullname_register);
        edtUsername = findViewById(R.id.edt_username_register);
        btnRegister = findViewById(R.id.btn_register);
        btnToLogin = findViewById(R.id.btn_to_login);

        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistrasiActivity.this, "Ke Halaman Login", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void actionRegister(View view) {
        Toast.makeText(RegistrasiActivity.this, "Register", Toast.LENGTH_SHORT).show();
    }
}