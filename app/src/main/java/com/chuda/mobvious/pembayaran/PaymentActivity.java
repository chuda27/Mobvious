package com.chuda.mobvious.pembayaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chuda.mobvious.R;

public class PaymentActivity extends AppCompatActivity {

    EditText edtFullname, edtEmail;
    Button btnBayar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        edtFullname = findViewById(R.id.edt_fullname_pembayaran);
        edtEmail = findViewById(R.id.edt_email_pembayaran);
        btnBayar = findViewById(R.id.btn_pembayaran);

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname = edtFullname.getText().toString();
                String email = edtEmail.getText().toString();

                Toast.makeText(PaymentActivity.this, "Hallo, nama saya "+fullname+", " +
                        "dengan email "+email, Toast.LENGTH_LONG).show();
            }
        });
    }
}