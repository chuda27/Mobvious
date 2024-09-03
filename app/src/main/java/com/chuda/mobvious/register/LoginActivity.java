package com.chuda.mobvious.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.chuda.mobvious.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(LoginActivity.this, "Menjalankan OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(LoginActivity.this, "Menjalankan On Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(LoginActivity.this, "Menjalankan OnResume", Toast.LENGTH_SHORT).show();
    }

    //activity berjalan/muncul

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(LoginActivity.this, "Menjalankan On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(LoginActivity.this, "Menjalankan OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(LoginActivity.this, "Menjalankan On Destroy", Toast.LENGTH_SHORT).show();
    }
}