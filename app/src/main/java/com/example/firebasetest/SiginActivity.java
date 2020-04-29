package com.example.firebasetest;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SiginActivity extends AppCompatActivity {
    Button buttonsign, btnBack;
    EditText editTextPassword, editTextEmail;
    FirebaseAuth mAuth;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin);
        imageView = findViewById(R.id.image);
        buttonsign = findViewById(R.id.button_done_sign);
        editTextEmail = findViewById(R.id.editText_email);
        editTextPassword = findViewById(R.id.editText_password_sigin);
        btnBack = findViewById(R.id.btn_back_from_sigin);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SiginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        buttonsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth = FirebaseAuth.getInstance();
                String em = editTextEmail.getText().toString();
                String pass = editTextPassword.getText().toString();
                if (em.length() == 0 && pass.length() == 0) {
                    Toast.makeText(SiginActivity.this, "حدث خطأ", Toast.LENGTH_SHORT).show();
                } else {
                    mAuth.createUserWithEmailAndPassword(em, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(SiginActivity.this, "تم تسجيل الحساب", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(SiginActivity.this, "حدث خطأ", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}