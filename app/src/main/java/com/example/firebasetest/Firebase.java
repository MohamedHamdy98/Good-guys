package com.example.firebasetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Firebase extends AppCompatActivity {
    EditText editName, editAge, editPhone,editData,edit_user_name;
    Button buttonClick, buttonView, buttonSearch,buttonDelete;
    TextView tv,tvfirebase;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
      // editName = findViewById(R.id.editTextName);
        editAge = findViewById(R.id.editTextAge);
        editPhone = findViewById(R.id.editTextPhone);
        editData = findViewById(R.id.editTextData);
        buttonClick = findViewById(R.id.click);
        tvfirebase = findViewById(R.id.textView_firebase);
        tv = findViewById(R.id.textView);
        buttonSearch = findViewById(R.id.search);
        buttonDelete = findViewById(R.id.delete);
        buttonView = findViewById(R.id.view);



        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tvfirebase.setText(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });
//        buttonClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                InsertData();
//            }
//        });
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchData();
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Delete();
            }
        });
    }

    private void getData() {
        FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString())
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            Module module = snapshot.getValue(Module.class);
                            tv.setText(module.getName());
                        }
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                    }
                });
    }
    private void SearchData() {
        String name = editName.getText().toString();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("All Information");
        Query query = reference.orderByChild("name").equalTo(name);
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                        Module module = snapshot.getValue(Module.class);
                        tv.setText(module.getPhone());
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    private void Delete(){
        String name = editName.getText().toString();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("users");
        Query query = reference.orderByChild("name").equalTo(name);
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    for (DataSnapshot snapshot : dataSnapshot.getChildren() ){
                        snapshot.getRef().removeValue();
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
    private void InsertData(){

        String age = editAge.getText().toString();
        String phone = editPhone.getText().toString();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("users").push();
        if (!TextUtils.isEmpty(age) && !TextUtils.isEmpty(phone)) {

            Toast.makeText(this, "Data was inserted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Insert all information!", Toast.LENGTH_SHORT).show();
        }

    }
    }


