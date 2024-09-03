package com.chuda.mobvious.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chuda.mobvious.R;
import com.chuda.mobvious.model.Person;

public class RegistrasiActivity extends AppCompatActivity {
    EditText edtFullnameRegister, edtUsername, edtPasswordRegister;
    Button btnRegister, btnToLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        edtFullnameRegister = findViewById(R.id.edt_fullname_register);
        edtUsername = findViewById(R.id.edt_username_register);
        edtPasswordRegister = findViewById(R.id.edt_password_register);
        btnRegister = findViewById(R.id.btn_register);
        btnToLogin = findViewById(R.id.btn_to_login);


        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistrasiActivity.this, "Ke Halaman Login", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(RegistrasiActivity.this, "Tahap On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(RegistrasiActivity.this, "Tahap On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(RegistrasiActivity.this, "Tahap On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(RegistrasiActivity.this, "Tahap On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(RegistrasiActivity.this, "Tahap On Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(RegistrasiActivity.this, "Tahap On Restart", Toast.LENGTH_SHORT).show();
    }

    public void actionRegister(View view) {
        Person jessica = new Person();
        jessica.setFullname(edtFullnameRegister.getText().toString());
        jessica.setUsername(edtUsername.getText().toString());

        //pindah halaman intent
        //post ke server (Person jessica)
        Toast.makeText(RegistrasiActivity.this, "Nama: "+jessica.getFullname()+
                ", Username: "+jessica.getUsername(), Toast.LENGTH_SHORT).show();
    }
}