package com.example.firebasetest;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {



    FirebaseAuth mAuth;
    ImageView imageView;

    @BindView(R.id.editTextGmail)
    EditText email;
    @BindView(R.id.editTextPassword)
    EditText password;
    @BindView(R.id.button_login)
    Button btnlogin;
    @BindView(R.id.button_sign)
    Button btnsignin;
    @BindView(R.id.tvforgetmypassword)
    TextView textViewreset;
    @BindView(R.id.progressBar)
    ProgressBar progBar;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        imageView = findViewById(R.id.image);


        textViewreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResetPasswordActivity.class);
                startActivity(intent);
            }
        });

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SiginActivity.class);
                startActivity(intent);
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth = FirebaseAuth.getInstance();
                final String em = email.getText().toString();
                final String pass = password.getText().toString();
                progBar.setVisibility(View.VISIBLE);
                if (em.length() == 0 && pass.length() == 0) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                } else {
                    mAuth.signInWithEmailAndPassword(em, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "تم تسجل الدخول", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity.this, Choose_Show_Or_Insert_Data_Activity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(MainActivity.this, "هناك خطأ", Toast.LENGTH_SHORT).show();
                            }
                            progBar.setVisibility(View.GONE);
                        }

                    });
                }
            }
        });


    }
}





