package com.example.firebasetest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Adapter_Delete_tow extends  RecyclerView.Adapter<Adapter_Delete_tow.Adapter>{
    Context context;
    ArrayList<Module> arrayList;

    public Adapter_Delete_tow(Context context, ArrayList<Module> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Adapter_Delete_tow.Adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.delete_layout,parent,false);
        Adapter_Delete_tow.Adapter adapter = new Adapter_Delete_tow.Adapter(view);
        return adapter;
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter holder, int position) {
        Module m = arrayList.get(position);
        holder.textView_name.setText(m.getName());
        holder.textView_address.setText(m.getAddress());
        holder.button_delete_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = holder.textView_name.getText().toString();
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("users_tow");
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


        });
    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class Adapter extends RecyclerView.ViewHolder{
        TextView textView_name,textView_address;
        Button button_delete_data;
        public Adapter(@NonNull View itemView) {
            super(itemView);
            textView_name = itemView.findViewById(R.id.textView_recyclerView_username);
            textView_address = itemView.findViewById(R.id.textView_recyclerView_address);
            button_delete_data = itemView.findViewById(R.id.button_delete_data);
        }
    }
}
