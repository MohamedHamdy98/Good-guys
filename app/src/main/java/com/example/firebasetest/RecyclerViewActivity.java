package com.example.firebasetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RecyclerViewActivity extends AppCompatActivity {
    Spinner spinner_number_of_sons, spinner_type_of_help;
    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9, layout10;
    TextView textView_number_of_sons, textView_People_typeOf_home, textView_of_help,textView_People_typeOf_manteka,
            textView_number_of_ghoraf, textView_number_of_twabek, textView_number_of_hograt,textView_People_typeOf_roof,
            textView_People_typeOf_bathroom,textView_People_typeOf_ekama,
            textView_user_name, textView_user_social_status, textView_user_age, textView_user_work, textView_user_phone,
            textView_user_address, textView_user_location_map,
            textView_huspand_name, textView_huspand_work, textView_huspand_age, textView_name_son_1, textView_age_son_1, textView_education_son_1,
            textView_work_son_1, textView_status_son_1, textView_help_son_1, textView_dateMarried_son_1,
            textView_name_son_2, textView_age_son_2, textView_education_son_2, textView_work_son_2, textView_status_son_2,
            textView_help_son_2, textView_dateMarried_son_2, textView_name_son_3, textView_age_son_3, textView_education_son_3, textView_work_son_3,
            textView_status_son_3, textView_help_son_3, textView_dateMarried_son_3, textView_name_son_4, textView_age_son_4,
            textView_education_son_4, textView_work_son_4, textView_status_son_4, textView_help_son_4, textView_dateMarried_son_4, textView_name_son_5, textView_age_son_5,
            textView_education_son_5, textView_work_son_5, textView_status_son_5, textView_help_son_5, textView_dateMarried_son_5,
            textView_name_son_6, textView_age_son_6, textView_education_son_6, textView_work_son_6, textView_status_son_6,
            textView_help_son_6, textView_dateMarried_son_6, textView_name_son_7, textView_age_son_7, textView_education_son_7,
            textView_work_son_7, textView_status_son_7, textView_help_son_7, textView_dateMarried_son_7, textView_name_son_8,
            textView_age_son_8, textView_education_son_8, textView_work_son_8, textView_status_son_8, textView_help_son_8,
            textView_dateMarried_son_8, textView_name_son_9, textView_age_son_9, textView_education_son_9, textView_work_son_9,
            textView_status_son_9, textView_help_son_9, textView_dateMarried_son_9, textView_name_son_10, textView_age_son_10,
            textView_education_son_10, textView_work_son_10, textView_status_son_10, textView_help_son_10, textView_dateMarried_son_10,
            textView_money_home, textView_money_dept, textView_money_school, textView_money_water, textView_money_other, textView_money_medicine, textView_money_source_1,
            textView_money_source_2, textView_money_source_3, textView_money_source_4, textView_money_value_1,
            textView_money_value_2, textView_money_value_3, textView_money_value_4, textView_money_regulary_1, textView_money_regulary_2,
            textView_money_regulary_3, textView_money_regulary_4, textView_money_notes_1, textView_money_notes_2, textView_money_notes_3,
            textView_money_notes_4, textView_People_notes_about_sakan;
    Button button_map;
    LinearLayout layout_help_1, layout_help_2, layout_help_3, layout_help_4;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.ActionBar);
        setContentView(R.layout.activity_view_all_data_layout);
        initalization();
        getSpinner();
        reference = FirebaseDatabase.getInstance().getReference().child("users_one");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    final Module users = dataSnapshot1.getValue(Module.class);
                    textView_user_name.setText(users.getName());
                    textView_user_address.setText(users.getAddress());
                    textView_user_age.setText(users.getAge());
                    textView_user_social_status.setText(users.getStatus());
                    textView_user_work.setText(users.getWork());
                    textView_user_phone.setText(users.getPhone());
                    textView_user_location_map.setText(users.getLocation_map());
                    button_map.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView_user_location_map.setText(users.getLocation_map());
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse("geo:" + textView_user_location_map));
                            if (intent.resolveActivity(getPackageManager()) != null) {
                                startActivity(intent);
                            }
                        }
                    });
                    textView_huspand_name.setText(users.getHuspand_name());
                    textView_huspand_age.setText(users.getHuspand_age());
                    textView_huspand_work.setText(users.getHuspand_work());
                    textView_number_of_sons.setText(users.getNumber_of_sons());
                    textView_name_son_1.setText(users.getName_son_1());
                    textView_name_son_2.setText(users.getName_son_2());
                    textView_name_son_3.setText(users.getName_son_3());
                    textView_name_son_4.setText(users.getName_son_4());
                    textView_name_son_5.setText(users.getName_son_5());
                    textView_name_son_6.setText(users.getName_son_6());
                    textView_name_son_7.setText(users.getName_son_7());
                    textView_name_son_8.setText(users.getName_son_8());
                    textView_name_son_9.setText(users.getName_son_9());
                    textView_name_son_10.setText(users.getName_son_10());
                    textView_age_son_1.setText(users.getAge_son_1());
                    textView_age_son_2.setText(users.getAge_son_2());
                    textView_age_son_3.setText(users.getAge_son_3());
                    textView_age_son_4.setText(users.getAge_son_4());
                    textView_age_son_5.setText(users.getAge_son_5());
                    textView_age_son_6.setText(users.getAge_son_6());
                    textView_age_son_7.setText(users.getAge_son_7());
                    textView_age_son_8.setText(users.getAge_son_8());
                    textView_age_son_9.setText(users.getAge_son_9());
                    textView_age_son_10.setText(users.getAge_son_10());
                    textView_education_son_1.setText(users.getEducation_son_1());
                    textView_education_son_2.setText(users.getEducation_son_2());
                    textView_education_son_3.setText(users.getEducation_son_3());
                    textView_education_son_4.setText(users.getEducation_son_4());
                    textView_education_son_5.setText(users.getEducation_son_5());
                    textView_education_son_6.setText(users.getEducation_son_6());
                    textView_education_son_7.setText(users.getEducation_son_7());
                    textView_education_son_8.setText(users.getEducation_son_8());
                    textView_education_son_9.setText(users.getEducation_son_9());
                    textView_education_son_10.setText(users.getEducation_son_10());
                    textView_status_son_1.setText(users.getStatus_son_1());
                    textView_status_son_2.setText(users.getStatus_son_2());
                    textView_status_son_3.setText(users.getStatus_son_3());
                    textView_status_son_4.setText(users.getStatus_son_4());
                    textView_status_son_5.setText(users.getStatus_son_5());
                    textView_status_son_6.setText(users.getStatus_son_6());
                    textView_status_son_7.setText(users.getStatus_son_7());
                    textView_status_son_8.setText(users.getStatus_son_8());
                    textView_status_son_9.setText(users.getStatus_son_9());
                    textView_status_son_10.setText(users.getStatus_son_10());
                    textView_help_son_1.setText(users.getHelp_son_1());
                    textView_help_son_2.setText(users.getHelp_son_2());
                    textView_help_son_3.setText(users.getHelp_son_3());
                    textView_help_son_4.setText(users.getHelp_son_4());
                    textView_help_son_5.setText(users.getHelp_son_5());
                    textView_help_son_6.setText(users.getHelp_son_6());
                    textView_help_son_7.setText(users.getHelp_son_7());
                    textView_help_son_8.setText(users.getHelp_son_8());
                    textView_help_son_9.setText(users.getHelp_son_9());
                    textView_help_son_10.setText(users.getHelp_son_10());
                    textView_work_son_1.setText(users.getWork_son_1());
                    textView_work_son_2.setText(users.getWork_son_2());
                    textView_work_son_3.setText(users.getWork_son_3());
                    textView_work_son_4.setText(users.getWork_son_4());
                    textView_work_son_5.setText(users.getWork_son_5());
                    textView_work_son_6.setText(users.getWork_son_6());
                    textView_work_son_7.setText(users.getWork_son_7());
                    textView_work_son_8.setText(users.getWork_son_8());
                    textView_work_son_9.setText(users.getWork_son_9());
                    textView_work_son_10.setText(users.getWork_son_10());
                    textView_dateMarried_son_1.setText(users.getDate_married_son_1());
                    textView_dateMarried_son_2.setText(users.getDate_married_son_2());
                    textView_dateMarried_son_3.setText(users.getDate_married_son_3());
                    textView_dateMarried_son_4.setText(users.getDate_married_son_4());
                    textView_dateMarried_son_5.setText(users.getDate_married_son_5());
                    textView_dateMarried_son_6.setText(users.getDate_married_son_6());
                    textView_dateMarried_son_7.setText(users.getDate_married_son_7());
                    textView_dateMarried_son_8.setText(users.getDate_married_son_8());
                    textView_dateMarried_son_9.setText(users.getDate_married_son_9());
                    textView_dateMarried_son_10.setText(users.getDate_married_son_10());
                    textView_money_value_1.setText(users.getMoney_value_1());
                    textView_money_value_2.setText(users.getMoney_value_2());
                    textView_money_value_3.setText(users.getMoney_value_3());
                    textView_money_value_4.setText(users.getMoney_value_4());
                    textView_money_source_1.setText(users.getMoney_source_1());
                    textView_money_source_2.setText(users.getMoney_source_2());
                    textView_money_source_3.setText(users.getMoney_source_3());
                    textView_money_source_4.setText(users.getMoney_source_4());
                    textView_money_regulary_1.setText(users.getMoney_regulary_1());
                    textView_money_regulary_2.setText(users.getMoney_regulary_2());
                    textView_money_regulary_3.setText(users.getMoney_regulary_3());
                    textView_money_regulary_4.setText(users.getMoney_regulary_4());
                    textView_money_notes_1.setText(users.getMoney_notes_1());
                    textView_money_notes_2.setText(users.getMoney_notes_2());
                    textView_money_notes_3.setText(users.getMoney_notes_3());
                    textView_money_notes_4.setText(users.getMoney_notes_4());
                    textView_money_dept.setText(users.getMoney_dept());
                    textView_money_home.setText(users.getMoney_home());
                    textView_money_medicine.setText(users.getMoney_medicine());
                    textView_money_other.setText(users.getMoney_other());
                    textView_money_school.setText(users.getMoney_school());
                    textView_money_water.setText(users.getMoney_water());
                    textView_of_help.setText(users.getNumber_of_help());
                    textView_number_of_ghoraf.setText(users.getNumber_of_room_without_floor());
                    textView_number_of_hograt.setText(users.getNumber_of_hograt());
                    textView_number_of_twabek.setText(users.getNumber_of_twabek());
                    textView_People_notes_about_sakan.setText(users.getNotes_about_sakan());
                    textView_People_typeOf_home.setText(users.getType_of_home());
                    textView_People_typeOf_roof.setText(users.getType_of_roof());
                    textView_People_typeOf_bathroom.setText(users.getType_of_bathroom());
                    textView_People_typeOf_ekama.setText(users.getType_of_ekama());
                    textView_People_typeOf_manteka.setText(users.getType_of_area());


                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void initalization() {
        textView_People_notes_about_sakan = findViewById(R.id.textView_People_notes_about_sakan);
        textView_of_help = findViewById(R.id.textView_of_help);
        textView_People_typeOf_home = findViewById(R.id.textView_People_typeOf_home);
        textView_People_typeOf_manteka = findViewById(R.id.textView_People_typeOf_manteka);
        textView_People_typeOf_bathroom = findViewById(R.id.textView_People_typeOf_hammam);
        textView_People_typeOf_roof = findViewById(R.id.textView_People_typeOf_sakf);
        textView_People_typeOf_ekama = findViewById(R.id.textView_People_typeOf_ekama);
        spinner_number_of_sons = findViewById(R.id.spinner_number_of_son);
        spinner_type_of_help = findViewById(R.id.spinner_help_show_data);
        layout1 = findViewById(R.id.linear1_view);
        layout2 = findViewById(R.id.linear2_view);
        layout3 = findViewById(R.id.linear3_view);
        layout4 = findViewById(R.id.linear4_view);
        layout5 = findViewById(R.id.linear5_view);
        layout6 = findViewById(R.id.linear6_view);
        layout7 = findViewById(R.id.linear7_view);
        layout8 = findViewById(R.id.linear8_view);
        layout9 = findViewById(R.id.linear9_view);
        layout10 = findViewById(R.id.linear10_view);
        layout_help_1 = findViewById(R.id.linear_help_view_1);
        layout_help_2 = findViewById(R.id.linear_help_view_2);
        layout_help_3 = findViewById(R.id.linear_help_view_3);
        layout_help_4 = findViewById(R.id.linear_help_view_4);
        textView_money_source_1 = findViewById(R.id.textView_People_money_source_1);
        textView_money_source_2 = findViewById(R.id.textView_People_money_source_2);
        textView_money_source_3 = findViewById(R.id.textView_People_money_source_3);
        textView_money_source_4 = findViewById(R.id.textView_People_money_source_4);
        textView_money_value_1 = findViewById(R.id.textView_People_money_value_1);
        textView_money_value_2 = findViewById(R.id.textView_People_money_value_2);
        textView_money_value_3 = findViewById(R.id.textView_People_money_value_3);
        textView_money_value_4 = findViewById(R.id.textView_People_money_value_4);
        textView_money_regulary_1 = findViewById(R.id.textView_People_money_regulary_1);
        textView_money_regulary_2 = findViewById(R.id.textView_People_money_regulary_2);
        textView_money_regulary_3 = findViewById(R.id.textView_People_money_regulary_3);
        textView_money_regulary_4 = findViewById(R.id.textView_People_money_regulary_4);
        textView_money_notes_1 = findViewById(R.id.textView_People_money_notes_1);
        textView_money_notes_2 = findViewById(R.id.textView_People_money_notes_2);
        textView_money_notes_3 = findViewById(R.id.textView_People_money_notes_3);
        textView_money_notes_4 = findViewById(R.id.textView_People_money_notes_4);
        textView_money_home = findViewById(R.id.textView_People_money_home);
        textView_money_dept = findViewById(R.id.textView_People_money_debt);
        textView_money_school = findViewById(R.id.textView_People_money_school);
        textView_money_water = findViewById(R.id.textView_People_money_water);
        textView_money_other = findViewById(R.id.textView_People_money_other);
        textView_money_medicine = findViewById(R.id.textView_People_money_medicine);
        textView_dateMarried_son_1 = findViewById(R.id.textView_People__date_married_son_1);
        textView_age_son_1 = findViewById(R.id.textView_People__age_son_1);
        textView_name_son_1 = findViewById(R.id.textView_People__name_son_1);
        textView_status_son_1 = findViewById(R.id.textView_People__status_son_1);
        textView_education_son_1 = findViewById(R.id.textView_People__education_son_1);
        textView_help_son_1 = findViewById(R.id.textView_People__help_son_1);
        textView_work_son_1 = findViewById(R.id.textView_People__work_son_1);
        textView_name_son_2 = findViewById(R.id.textView_People__name_son_2);
        textView_age_son_2 = findViewById(R.id.textView_People__age_son_2);
        textView_education_son_2 = findViewById(R.id.textView_People__education_son_2);
        textView_work_son_2 = findViewById(R.id.textView_People__work_son_2);
        textView_status_son_2 = findViewById(R.id.textView_People__status_son_2);
        textView_help_son_2 = findViewById(R.id.textView_People__help_son_2);
        textView_dateMarried_son_2 = findViewById(R.id.textView_People__date_married_son_2);
        textView_name_son_3 = findViewById(R.id.textView_People__name_son_3);
        textView_age_son_3 = findViewById(R.id.textView_People__age_son_3);
        textView_education_son_3 = findViewById(R.id.textView_People__education_son_3);
        textView_work_son_3 = findViewById(R.id.textView_People__work_son_3);
        textView_status_son_3 = findViewById(R.id.textView_People__status_son_3);
        textView_help_son_3 = findViewById(R.id.textView_People__help_son_3);
        textView_dateMarried_son_3 = findViewById(R.id.textView_People__date_married_son_3);
        textView_name_son_4 = findViewById(R.id.textView_People__name_son_4);
        textView_age_son_4 = findViewById(R.id.textView_People__age_son_4);
        textView_education_son_4 = findViewById(R.id.textView_People__education_son_4);
        textView_work_son_4 = findViewById(R.id.textView_People__work_son_4);
        textView_status_son_4 = findViewById(R.id.textView_People__status_son_4);
        textView_help_son_4 = findViewById(R.id.textView_People__help_son_4);
        textView_dateMarried_son_4 = findViewById(R.id.textView_People__date_married_son_4);
        textView_name_son_5 = findViewById(R.id.textView_People__name_son_5);
        textView_age_son_5 = findViewById(R.id.textView_People__age_son_5);
        textView_education_son_5 = findViewById(R.id.textView_People__education_son_5);
        textView_work_son_5 = findViewById(R.id.textView_People__work_son_5);
        textView_status_son_5 = findViewById(R.id.textView_People__status_son_5);
        textView_help_son_5 = findViewById(R.id.textView_People__help_son_5);
        textView_dateMarried_son_5 = findViewById(R.id.textView_People__date_married_son_5);
        textView_name_son_6 = findViewById(R.id.textView_People__name_son_6);
        textView_age_son_6 = findViewById(R.id.textView_People__age_son_6);
        textView_education_son_6 = findViewById(R.id.textView_People__education_son_6);
        textView_work_son_6 = findViewById(R.id.textView_People__work_son_6);
        textView_status_son_6 = findViewById(R.id.textView_People__status_son_6);
        textView_help_son_6 = findViewById(R.id.textView_People__help_son_6);
        textView_dateMarried_son_6 = findViewById(R.id.textView_People__date_married_son_6);
        textView_name_son_7 = findViewById(R.id.textView_People__name_son_7);
        textView_age_son_7 = findViewById(R.id.textView_People__age_son_7);
        textView_education_son_7 = findViewById(R.id.textView_People__education_son_7);
        textView_work_son_7 = findViewById(R.id.textView_People__work_son_7);
        textView_status_son_7 = findViewById(R.id.textView_People__status_son_7);
        textView_help_son_7 = findViewById(R.id.textView_People__help_son_7);
        textView_dateMarried_son_7 = findViewById(R.id.textView_People__date_married_son_7);
        textView_name_son_8 = findViewById(R.id.textView_People__name_son_8);
        textView_age_son_8 = findViewById(R.id.textView_People__age_son_8);
        textView_education_son_8 = findViewById(R.id.textView_People__education_son_8);
        textView_work_son_8 = findViewById(R.id.textView_People__work_son_8);
        textView_status_son_8 = findViewById(R.id.textView_People__status_son_8);
        textView_help_son_8 = findViewById(R.id.textView_People__help_son_8);
        textView_dateMarried_son_8 = findViewById(R.id.textView_People__date_married_son_8);
        textView_name_son_9 = findViewById(R.id.textView_People__name_son_9);
        textView_age_son_9 = findViewById(R.id.textView_People__age_son_9);
        textView_education_son_9 = findViewById(R.id.textView_People__education_son_9);
        textView_work_son_9 = findViewById(R.id.textView_People__work_son_9);
        textView_status_son_9 = findViewById(R.id.textView_People__status_son_9);
        textView_help_son_9 = findViewById(R.id.textView_People__help_son_9);
        textView_dateMarried_son_9 = findViewById(R.id.textView_People__date_married_son_9);
        textView_name_son_10 = findViewById(R.id.textView_People__name_son_10);
        textView_age_son_10 = findViewById(R.id.textView_People__age_son_10);
        textView_education_son_10 = findViewById(R.id.textView_People__education_son_10);
        textView_work_son_10 = findViewById(R.id.textView_People__work_son_10);
        textView_status_son_10 = findViewById(R.id.textView_People__status_son_10);
        textView_help_son_10 = findViewById(R.id.textView_People__help_son_10);
        textView_dateMarried_son_10 = findViewById(R.id.textView_People__date_married_son_10);
        button_map = findViewById(R.id.button_map_show);
        textView_huspand_name = findViewById(R.id.textView_People_name_zoog);
        textView_huspand_age = findViewById(R.id.textView_People_age_zoog);
        textView_huspand_work = findViewById(R.id.textView_People_work_zoog);
        textView_user_name = findViewById(R.id.textView_People_username);
        textView_user_social_status = findViewById(R.id.textView_People_social_status);
        textView_user_age = findViewById(R.id.textView_People_age);
        textView_user_address = findViewById(R.id.textView_People_address);
        textView_user_work = findViewById(R.id.textView_People_work);
        textView_user_phone = findViewById(R.id.textView_People_phone);
        textView_user_location_map = findViewById(R.id.textView_People_location);
        textView_number_of_sons = findViewById(R.id.textView_number_of_sons);
        textView_number_of_twabek = findViewById(R.id.textView_People_number_of_twabek);
        textView_number_of_hograt = findViewById(R.id.textView_People_number_of_hograt);
        textView_number_of_ghoraf = findViewById(R.id.textView_People_number_of_ghoraf);
    }

    private void getSpinner() {
        spinner_number_of_sons.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        layout1.setVisibility(View.GONE);
                        layout2.setVisibility(View.GONE);
                        layout3.setVisibility(View.GONE);
                        layout4.setVisibility(View.GONE);
                        layout5.setVisibility(View.GONE);
                        layout6.setVisibility(View.GONE);
                        layout7.setVisibility(View.GONE);
                        layout8.setVisibility(View.GONE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 1:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.GONE);
                        layout3.setVisibility(View.GONE);
                        layout4.setVisibility(View.GONE);
                        layout5.setVisibility(View.GONE);
                        layout6.setVisibility(View.GONE);
                        layout7.setVisibility(View.GONE);
                        layout8.setVisibility(View.GONE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 2:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.GONE);
                        layout4.setVisibility(View.GONE);
                        layout5.setVisibility(View.GONE);
                        layout6.setVisibility(View.GONE);
                        layout7.setVisibility(View.GONE);
                        layout8.setVisibility(View.GONE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 3:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.GONE);
                        layout5.setVisibility(View.GONE);
                        layout6.setVisibility(View.GONE);
                        layout7.setVisibility(View.GONE);
                        layout8.setVisibility(View.GONE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 4:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.GONE);
                        layout6.setVisibility(View.GONE);
                        layout7.setVisibility(View.GONE);
                        layout8.setVisibility(View.GONE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 5:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.VISIBLE);
                        layout6.setVisibility(View.GONE);
                        layout7.setVisibility(View.GONE);
                        layout8.setVisibility(View.GONE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 6:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.VISIBLE);
                        layout6.setVisibility(View.VISIBLE);
                        layout7.setVisibility(View.GONE);
                        layout8.setVisibility(View.GONE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 7:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.VISIBLE);
                        layout6.setVisibility(View.VISIBLE);
                        layout7.setVisibility(View.VISIBLE);
                        layout8.setVisibility(View.GONE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 8:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.VISIBLE);
                        layout6.setVisibility(View.VISIBLE);
                        layout7.setVisibility(View.VISIBLE);
                        layout8.setVisibility(View.VISIBLE);
                        layout9.setVisibility(View.GONE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 9:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.VISIBLE);
                        layout6.setVisibility(View.VISIBLE);
                        layout7.setVisibility(View.VISIBLE);
                        layout8.setVisibility(View.VISIBLE);
                        layout9.setVisibility(View.VISIBLE);
                        layout10.setVisibility(View.GONE);
                        break;
                    case 10:
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.VISIBLE);
                        layout6.setVisibility(View.VISIBLE);
                        layout7.setVisibility(View.VISIBLE);
                        layout8.setVisibility(View.VISIBLE);
                        layout9.setVisibility(View.VISIBLE);
                        layout10.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner_type_of_help.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        layout_help_1.setVisibility(View.GONE);
                        layout_help_2.setVisibility(View.GONE);
                        layout_help_3.setVisibility(View.GONE);
                        layout_help_4.setVisibility(View.GONE);
                        break;
                    case 1:
                        layout_help_1.setVisibility(View.VISIBLE);
                        layout_help_2.setVisibility(View.GONE);
                        layout_help_3.setVisibility(View.GONE);
                        layout_help_4.setVisibility(View.GONE);
                        break;
                    case 2:
                        layout_help_1.setVisibility(View.VISIBLE);
                        layout_help_2.setVisibility(View.VISIBLE);
                        layout_help_3.setVisibility(View.GONE);
                        layout_help_4.setVisibility(View.GONE);
                        break;
                    case 3:
                        layout_help_1.setVisibility(View.VISIBLE);
                        layout_help_2.setVisibility(View.VISIBLE);
                        layout_help_3.setVisibility(View.VISIBLE);
                        layout_help_4.setVisibility(View.GONE);
                        break;
                    case 4:
                        layout_help_1.setVisibility(View.VISIBLE);
                        layout_help_2.setVisibility(View.VISIBLE);
                        layout_help_3.setVisibility(View.VISIBLE);
                        layout_help_4.setVisibility(View.VISIBLE);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.signout_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.sign_out){
            Toast.makeText(this, "تسجيل الخروج", Toast.LENGTH_SHORT).show();
            FirebaseAuth.getInstance().signOut();
            finish();
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
