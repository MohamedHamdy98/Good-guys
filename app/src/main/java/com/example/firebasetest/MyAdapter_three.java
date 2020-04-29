package com.example.firebasetest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter_three extends RecyclerView.Adapter<MyAdapter_three.Adapter> {
    Context context;
    ArrayList<Module> arrayList;

    public MyAdapter_three(Context context, ArrayList<Module> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public  Adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_layout,parent,false);
         Adapter adapter = new  Adapter(view);
        return adapter;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter holder, int position) {
        Module m = arrayList.get(position);
        holder.textView_name.setText(m.getName());
        holder.textView_address.setText(m.getAddress());
        holder.btn_show_all_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,type_of_show_data_three_activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class Adapter extends RecyclerView.ViewHolder{
        TextView textView_name,textView_address;
        Button btn_show_all_data;
        public Adapter(@NonNull View itemView) {
            super(itemView);
            textView_name = itemView.findViewById(R.id.textView_recyclerView_username);
            textView_address = itemView.findViewById(R.id.textView_recyclerView_address);
            btn_show_all_data = itemView.findViewById(R.id.button_show_all_data);
        }
    }

}
