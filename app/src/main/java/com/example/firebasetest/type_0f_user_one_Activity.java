package com.example.firebasetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class type_0f_user_one_Activity extends AppCompatActivity {
    Spinner spinner, spinner2, spinner3;
    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9, layout10,
            layout_money_1, layout_money_2, layout_money_3, layout_money_4, layout_money_5, layout_money_6,
            layout_help_1, layout_help_2, layout_help_3, layout_help_4;
    Button btn_save, button_map, button;
    EditText editText_number_of_sons,
            editText_number_of_ghoraf, editText_number_of_twabek, editText_number_of_hograt,
            edit_user_name, edit_user_social_status, edit_user_age, edit_user_work, edit_user_phone,
            edit_user_address, edit_user_location_map,
            edit_huspand_name, edit_huspand_work, edit_huspand_age, editText_name_son_1, editText_age_son_1, editText_education_son_1,
            editText_work_son_1, editText_status_son_1, editText_help_son_1, editText_dateMarried_son_1,
            editText_name_son_2, editText_age_son_2, editText_education_son_2, editText_work_son_2, editText_status_son_2,
            editText_help_son_2, editText_dateMarried_son_2, editText_name_son_3, editText_age_son_3, editText_education_son_3, editText_work_son_3,
            editText_status_son_3, editText_help_son_3, editText_dateMarried_son_3, editText_name_son_4, editText_age_son_4,
            editText_education_son_4, editText_work_son_4, editText_status_son_4, editText_help_son_4, editText_dateMarried_son_4, editText_name_son_5, editText_age_son_5,
            editText_education_son_5, editText_work_son_5, editText_status_son_5, editText_help_son_5, editText_dateMarried_son_5,
            editText_name_son_6, editText_age_son_6, editText_education_son_6, editText_work_son_6, editText_status_son_6,
            editText_help_son_6, editText_dateMarried_son_6, editText_name_son_7, editText_age_son_7, editText_education_son_7,
            editText_work_son_7, editText_status_son_7, editText_help_son_7, editText_dateMarried_son_7, editText_name_son_8,
            editText_age_son_8, editText_education_son_8, editText_work_son_8, editText_status_son_8, editText_help_son_8,
            editText_dateMarried_son_8, editText_name_son_9, editText_age_son_9, editText_education_son_9, editText_work_son_9,
            editText_status_son_9, editText_help_son_9, editText_dateMarried_son_9, editText_name_son_10, editText_age_son_10,
            editText_education_son_10, editText_work_son_10, editText_status_son_10, editText_help_son_10, editText_dateMarried_son_10,
            editText_money_home, editText_money_dept, editText_money_school, editText_money_water, editText_money_other, editText_money_medicine, editText_money_source_1, editText_money_source_2, editText_money_source_3, editText_money_source_4, editText_money_value_1,
            editText_money_value_2, editText_money_value_3, editText_money_value_4, editText_money_regulary_1, editText_money_regulary_2,
            editText_money_regulary_3, editText_money_regulary_4, editText_money_notes_1, editText_money_notes_2, editText_money_notes_3,
            editText_money_notes_4, editText_number_of_help, editText_People_notes_about_sakan;
    CheckBox checkBox_flat, checkBox_ref, checkBox_hadry, checkBox_esha, checkBox_egarkadem, checkBox_egargded, checkBox_melk,
            checkBox_dawla, checkBox_moshtarak, checkBox_ashway, checkBox_badw, checkBox_ref_manteka, checkBox_hadry_manteka,
            checkBox_mostakel, checkBox_moshtarak_hammam, checkBox_mafesh, checkBox_boos, checkBox_khashap, checkBox_mafesh_sakf,
            checkBox_kharasana;
    DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("users_one").push();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.ActionBar);
        setContentView(R.layout.activity_type_0f_user_one_);
        initialization();
        item_spinner();
        insert_data();
    }

    private void initialization() {
        editText_People_notes_about_sakan = findViewById(R.id.editText_People_notes_about_sakan_insert_one);
        editText_number_of_help = findViewById(R.id.editText_People_number_of_help_insert_one);
        editText_number_of_sons = findViewById(R.id.editText_People__number_son_insert_one);
        editText_number_of_twabek = findViewById(R.id.editText_People_number_of_twabek_insert_one);
        editText_number_of_hograt = findViewById(R.id.editText_People_number_of_hograt_insert_one);
        editText_number_of_ghoraf = findViewById(R.id.editText_People_number_of_ghoraf_insert_one);
        checkBox_flat = findViewById(R.id.checkbox_People_shaka_insert_one);
        checkBox_ref = findViewById(R.id.checkbox_People_ref_insert_one);
        checkBox_hadry = findViewById(R.id.checkbox_People_hadry_insert_one);
        checkBox_esha = findViewById(R.id.checkbox_People_esha_insert_one);
        checkBox_egarkadem = findViewById(R.id.checkbox_People_egarkadem_insert_one);
        checkBox_egargded = findViewById(R.id.checkbox_People_egargded_insert_one);
        checkBox_melk = findViewById(R.id.checkbox_People_melk_insert_one);
        checkBox_dawla = findViewById(R.id.checkbox_People_dawla_insert_one);
        checkBox_moshtarak = findViewById(R.id.checkbox_People_moshtarak_insert_one);
        checkBox_ashway = findViewById(R.id.checkbox_People_ashway_insert_one);
        checkBox_badw = findViewById(R.id.checkbox_People_badw_insert_one);
        checkBox_ref_manteka = findViewById(R.id.checkbox_People_ref_manteka_insert_one);
        checkBox_hadry_manteka = findViewById(R.id.checkbox_People_hadry_mateka_insert_one);
        checkBox_mostakel = findViewById(R.id.checkbox_People_mostakel_insert_one);
        checkBox_moshtarak_hammam = findViewById(R.id.checkbox_People_moshtarak_hammam_insert_one);
        checkBox_mafesh = findViewById(R.id.checkbox_People_mafesh_insert_one);
        checkBox_boos = findViewById(R.id.checkbox_People_boos_insert_one);
        checkBox_khashap = findViewById(R.id.checkbox_People_khashap_insert_one);
        checkBox_mafesh_sakf = findViewById(R.id.checkbox_People_mafesh_sakf_insert_one);
        checkBox_kharasana = findViewById(R.id.checkbox_People_kharasana_insert_one);
        editText_money_source_1 = findViewById(R.id.editText_People_money_source_1_insert_one);
        editText_money_source_2 = findViewById(R.id.editText_People_money_source_2_insert_one);
        editText_money_source_3 = findViewById(R.id.editText_People_money_source_3_insert_one);
        editText_money_source_4 = findViewById(R.id.editText_People_money_source_4_insert_one);
        editText_money_value_1 = findViewById(R.id.editText_People_money_value_1_insert_one);
        editText_money_value_2 = findViewById(R.id.editText_People_money_value_2_insert_one);
        editText_money_value_3 = findViewById(R.id.editText_People_money_value_3_insert_one);
        editText_money_value_4 = findViewById(R.id.editText_People_money_value_4_insert_one);
        editText_money_regulary_1 = findViewById(R.id.editText_People_money_regulary_1_insert_one);
        editText_money_regulary_2 = findViewById(R.id.editText_People_money_regulary_2_insert_one);
        editText_money_regulary_3 = findViewById(R.id.editText_People_money_regulary_3_insert_one);
        editText_money_regulary_4 = findViewById(R.id.editText_People_money_regulary_4_insert_one);
        editText_money_notes_1 = findViewById(R.id.editText_People_money_notes_1_insert_one);
        editText_money_notes_2 = findViewById(R.id.editText_People_money_notes_2_insert_one);
        editText_money_notes_3 = findViewById(R.id.editText_People_money_notes_3_insert_one);
        editText_money_notes_4 = findViewById(R.id.editText_People_money_notes_4_insert_one);
        editText_money_home = findViewById(R.id.editText_People_money_home_insert_one);
        editText_money_dept = findViewById(R.id.editText_People_money_debt_insert_one);
        editText_money_school = findViewById(R.id.editText_People_money_school_insert_one);
        editText_money_water = findViewById(R.id.editText_People_money_water_insert_one);
        editText_money_other = findViewById(R.id.editText_People_money_other_insert_one);
        editText_money_medicine = findViewById(R.id.editText_People_money_medicine_insert_one);
        editText_dateMarried_son_1 = findViewById(R.id.editText_People__date_married_son_1_insert_one);
        editText_age_son_1 = findViewById(R.id.editText_People__age_son_1_insert_one);
        editText_name_son_1 = findViewById(R.id.editText_People__name_son_1_insert_one);
        editText_status_son_1 = findViewById(R.id.editText_People__status_son_1_insert_one);
        editText_education_son_1 = findViewById(R.id.editText_People__education_son_1_insert_one);
        editText_help_son_1 = findViewById(R.id.editText_People__help_son_1_insert_one);
        editText_work_son_1 = findViewById(R.id.editText_People__work_son_1_insert_one);
        editText_name_son_2 = findViewById(R.id.editText_People__name_son_2_insert_one);
        editText_age_son_2 = findViewById(R.id.editText_People__age_son_2_insert_one);
        editText_education_son_2 = findViewById(R.id.editText_People__education_son_2_insert_one);
        editText_work_son_2 = findViewById(R.id.editText_People__work_son_2_insert_one);
        editText_status_son_2 = findViewById(R.id.editText_People__status_son_2_insert_one);
        editText_help_son_2 = findViewById(R.id.editText_People__help_son_2_insert_one);
        editText_dateMarried_son_2 = findViewById(R.id.editText_People__date_married_son_2_insert_one);
        editText_name_son_3 = findViewById(R.id.editText_People__name_son_3_insert_one);
        editText_age_son_3 = findViewById(R.id.editText_People__age_son_3_insert_one);
        editText_education_son_3 = findViewById(R.id.editText_People__education_son_3_insert_one);
        editText_work_son_3 = findViewById(R.id.editText_People__work_son_3_insert_one);
        editText_status_son_3 = findViewById(R.id.editText_People__status_son_3_insert_one);
        editText_help_son_3 = findViewById(R.id.editText_People__help_son_3_insert_one);
        editText_dateMarried_son_3 = findViewById(R.id.editText_People__date_married_son_3_insert_one);
        editText_name_son_4 = findViewById(R.id.editText_People__name_son_4_insert_one);
        editText_age_son_4 = findViewById(R.id.editText_People__age_son_4_insert_one);
        editText_education_son_4 = findViewById(R.id.editText_People__education_son_4_insert_one);
        editText_work_son_4 = findViewById(R.id.editText_People__work_son_4_insert_one);
        editText_status_son_4 = findViewById(R.id.editText_People__status_son_4_insert_one);
        editText_help_son_4 = findViewById(R.id.editText_People__help_son_4_insert_one);
        editText_dateMarried_son_4 = findViewById(R.id.editText_People__date_married_son_4_insert_one);
        editText_name_son_5 = findViewById(R.id.editText_People__name_son_5_insert_one);
        editText_age_son_5 = findViewById(R.id.editText_People__age_son_5_insert_one);
        editText_education_son_5 = findViewById(R.id.editText_People__education_son_5_insert_one);
        editText_work_son_5 = findViewById(R.id.editText_People__work_son_5_insert_one);
        editText_status_son_5 = findViewById(R.id.editText_People__status_son_5_insert_one);
        editText_help_son_5 = findViewById(R.id.editText_People__help_son_5_insert_one);
        editText_dateMarried_son_5 = findViewById(R.id.editText_People__date_married_son_5_insert_one);
        editText_name_son_6 = findViewById(R.id.editText_People__name_son_6_insert_one);
        editText_age_son_6 = findViewById(R.id.editText_People__age_son_6_insert_one);
        editText_education_son_6 = findViewById(R.id.editText_People__education_son_6_insert_one);
        editText_work_son_6 = findViewById(R.id.editText_People__work_son_6_insert_one);
        editText_status_son_6 = findViewById(R.id.editText_People__status_son_6_insert_one);
        editText_help_son_6 = findViewById(R.id.editText_People__help_son_6_insert_one);
        editText_dateMarried_son_6 = findViewById(R.id.editText_People__date_married_son_6_insert_one);
        editText_name_son_7 = findViewById(R.id.editText_People__name_son_7_insert_one);
        editText_age_son_7 = findViewById(R.id.editText_People__age_son_7_insert_one);
        editText_education_son_7 = findViewById(R.id.editText_People__education_son_7_insert_one);
        editText_work_son_7 = findViewById(R.id.editText_People__work_son_7_insert_one);
        editText_status_son_7 = findViewById(R.id.editText_People__status_son_7_insert_one);
        editText_help_son_7 = findViewById(R.id.editText_People__help_son_7_insert_one);
        editText_dateMarried_son_7 = findViewById(R.id.editText_People__date_married_son_7_insert_one);
        editText_name_son_8 = findViewById(R.id.editText_People__name_son_8_insert_one);
        editText_age_son_8 = findViewById(R.id.editText_People__age_son_8_insert_one);
        editText_education_son_8 = findViewById(R.id.editText_People__education_son_8_insert_one);
        editText_work_son_8 = findViewById(R.id.editText_People__work_son_8_insert_one);
        editText_status_son_8 = findViewById(R.id.editText_People__status_son_8_insert_one);
        editText_help_son_8 = findViewById(R.id.editText_People__help_son_8_insert_one);
        editText_dateMarried_son_8 = findViewById(R.id.editText_People__date_married_son_8_insert_one);
        editText_name_son_9 = findViewById(R.id.editText_People__name_son_9_insert_one);
        editText_age_son_9 = findViewById(R.id.editText_People__age_son_9_insert_one);
        editText_education_son_9 = findViewById(R.id.editText_People__education_son_9_insert_one);
        editText_work_son_9 = findViewById(R.id.editText_People__work_son_9_insert_one);
        editText_status_son_9 = findViewById(R.id.editText_People__status_son_9_insert_one);
        editText_help_son_9 = findViewById(R.id.editText_People__help_son_9_insert_one);
        editText_dateMarried_son_9 = findViewById(R.id.editText_People__date_married_son_9_insert_one);
        editText_name_son_10 = findViewById(R.id.editText_People__name_son_10_insert_one);
        editText_age_son_10 = findViewById(R.id.editText_People__age_son_10_insert_one);
        editText_education_son_10 = findViewById(R.id.editText_People__education_son_10_insert_one);
        editText_work_son_10 = findViewById(R.id.editText_People__work_son_10_insert_one);
        editText_status_son_10 = findViewById(R.id.editText_People__status_son_10_insert_one);
        editText_help_son_10 = findViewById(R.id.editText_People__help_son_10_insert_one);
        editText_dateMarried_son_10 = findViewById(R.id.editText_People__date_married_son_10_insert_one);
        button_map = findViewById(R.id.button_map_insert_one);
        edit_huspand_name = findViewById(R.id.editText_People_name_zoog_insert_one);
        edit_huspand_age = findViewById(R.id.editText_People_age_zoog_insert_one);
        edit_huspand_work = findViewById(R.id.editText_People_work_zoog_insert_one);
        edit_user_name = findViewById(R.id.editText_People_username_insert_one);
        edit_user_social_status = findViewById(R.id.editText_People_social_status_insert_one);
        edit_user_age = findViewById(R.id.editText_People_age_insert_one);
        edit_user_address = findViewById(R.id.editText_People_address_insert_one);
        edit_user_work = findViewById(R.id.editText_People_work_insert_one);
        edit_user_phone = findViewById(R.id.editText_People_phone_insert_one);
        edit_user_location_map = findViewById(R.id.editText_People_location_insert_one);
        spinner = findViewById(R.id.spinner_insert_one);
        spinner3 = findViewById(R.id.spinner3_insert_one);
        layout1 = findViewById(R.id.linear1_insert_one);
        layout2 = findViewById(R.id.linear2_insert_one);
        layout3 = findViewById(R.id.linear3_insert_one);
        layout4 = findViewById(R.id.linear4_insert_one);
        layout5 = findViewById(R.id.linear5_insert_one);
        layout6 = findViewById(R.id.linear6_insert_one);
        layout7 = findViewById(R.id.linear7_insert_one);
        layout8 = findViewById(R.id.linear8_insert_one);
        layout9 = findViewById(R.id.linear9_insert_one);
        layout10 = findViewById(R.id.linear10_insert_one);
        layout_money_1 = findViewById(R.id.linear_money_1_insert_one);
        layout_money_2 = findViewById(R.id.linear_money_2_insert_one);
        layout_money_3 = findViewById(R.id.linear_money_3_insert_one);
        layout_money_4 = findViewById(R.id.linear_money_4_insert_one);
        layout_money_5 = findViewById(R.id.linear_money_5_insert_one);
        layout_money_6 = findViewById(R.id.linear_money_6_insert_one);
        layout_help_1 = findViewById(R.id.linear_help_1_insert_one);
        layout_help_2 = findViewById(R.id.linear_help_2_insert_one);
        layout_help_3 = findViewById(R.id.linear_help_3_insert_one);
        layout_help_4 = findViewById(R.id.linear_help_4_insert_one);
        btn_save = findViewById(R.id.button_save_insert_one);
    }

    private void item_spinner() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                Toast.makeText(type_0f_user_one_Activity.this, "Error!", Toast.LENGTH_SHORT).show();
            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                Toast.makeText(type_0f_user_one_Activity.this, "Error!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void checkBox_type_of_area() {
        final String ashway = checkBox_ashway.getText().toString();
        final String badw = checkBox_badw.getText().toString();
        final String ref_manteka = checkBox_ref_manteka.getText().toString();
        final String hadry_manteka = checkBox_hadry_manteka.getText().toString();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        String user_id = mAuth.getCurrentUser().getUid();
        DatabaseReference current_user_db = reference.child("type_of_area");

        if (checkBox_ashway.isChecked()) {
            current_user_db.setValue(ashway);
        }

        if (checkBox_badw.isChecked()) {
            current_user_db.setValue(badw);
        }

        if (checkBox_ref_manteka.isChecked()) {
            current_user_db.setValue(ref_manteka);
        }
        if (checkBox_hadry_manteka.isChecked()) {
            current_user_db.setValue(hadry_manteka);
        }
    }

    private void checkBox_type_of_bathroom() {
        final String mostakel = checkBox_mostakel.getText().toString();
        final String moshtarak_hammam = checkBox_moshtarak_hammam.getText().toString();
        final String mafesh = checkBox_mafesh.getText().toString();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        String user_id = mAuth.getCurrentUser().getUid();
        DatabaseReference current_user_db = reference.child("type_of_bathroom");

        if (checkBox_mostakel.isChecked()) {
            current_user_db.setValue(mostakel);
        }

        if (checkBox_moshtarak_hammam.isChecked()) {
            current_user_db.setValue(moshtarak_hammam);
        }

        if (checkBox_mafesh.isChecked()) {
            current_user_db.setValue(mafesh);
        }

    }

    private void checkBox_type_of_roof() {
        final String boos = checkBox_boos.getText().toString();
        final String khashap = checkBox_khashap.getText().toString();
        final String kharasana = checkBox_kharasana.getText().toString();
        final String mafesh_sakf = checkBox_mafesh_sakf.getText().toString();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        String user_id = mAuth.getCurrentUser().getUid();
        DatabaseReference current_user_db = reference.child("type_of_roof");

        if (checkBox_boos.isChecked()) {
            current_user_db.setValue(boos);
        }

        if (checkBox_khashap.isChecked()) {
            current_user_db.setValue(khashap);
        }

        if (checkBox_kharasana.isChecked()) {
            current_user_db.setValue(kharasana);
        }
        if (checkBox_mafesh_sakf.isChecked()) {
            current_user_db.setValue(mafesh_sakf);
        }
    }

    private void checkBox_type_of_ekama() {
        final String egargded = checkBox_egargded.getText().toString();
        final String egarkadem = checkBox_egarkadem.getText().toString();
        final String melk = checkBox_melk.getText().toString();
        final String dawla = checkBox_dawla.getText().toString();
        final String moshtarak = checkBox_moshtarak.getText().toString();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        String user_id = mAuth.getCurrentUser().getUid();
        DatabaseReference current_user_db = reference.child("type_of_ekama");

        if (checkBox_egargded.isChecked()) {
            current_user_db.setValue(egargded);
        }

        if (checkBox_egarkadem.isChecked()) {
            current_user_db.setValue(egarkadem);
        }

        if (checkBox_melk.isChecked()) {
            current_user_db.setValue(melk);
        }
        if (checkBox_dawla.isChecked()) {
            current_user_db.setValue(dawla);
        }
        if (checkBox_moshtarak.isChecked()) {
            current_user_db.setValue(moshtarak);
        }
    }

    private void checkbox_type_of_home() {
        final String flat = checkBox_flat.getText().toString();
        final String ref = checkBox_ref.getText().toString();
        final String hadry = checkBox_hadry.getText().toString();
        final String esha = checkBox_esha.getText().toString();


        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        String user_id = mAuth.getCurrentUser().getUid();
        DatabaseReference current_user_db = reference.child("type_of_home");

        if (checkBox_flat.isChecked()) {
            current_user_db.setValue(flat);
        }

        if (checkBox_esha.isChecked()) {
            current_user_db.setValue(esha);
        }

        if (checkBox_hadry.isChecked()) {
            current_user_db.setValue(hadry);
        }
        if (checkBox_ref.isChecked()) {
            current_user_db.setValue(ref);
        }


    }

    private void insert_data() {
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check box
                //checkbox();


                //user
                String name = edit_user_name.getText().toString();
                String age = edit_user_age.getText().toString();
                String work = edit_user_work.getText().toString();
                String phone = edit_user_phone.getText().toString();
                String address = edit_user_address.getText().toString();
                String location_map = edit_user_location_map.getText().toString();
                String status = edit_user_social_status.getText().toString();
                //huspand
                String huspand_name = edit_huspand_name.getText().toString();
                String huspand_age = edit_huspand_age.getText().toString();
                String huspand_work = edit_huspand_work.getText().toString();
                //number of sons
                String number_of_sons = editText_number_of_sons.getText().toString();
                //son 1
                String name_son_1 = editText_name_son_1.getText().toString();
                String age_son_1 = editText_age_son_1.getText().toString();
                String work_son_1 = editText_work_son_1.getText().toString();
                String date_married_son_1 = editText_dateMarried_son_1.getText().toString();
                String status_son_1 = editText_status_son_1.getText().toString();
                String education_son_1 = editText_education_son_1.getText().toString();
                String help_son_1 = editText_help_son_1.getText().toString();
                //son 2
                String name_son_2 = editText_name_son_2.getText().toString();
                String age_son_2 = editText_age_son_2.getText().toString();
                String work_son_2 = editText_work_son_2.getText().toString();
                String date_married_son_2 = editText_dateMarried_son_2.getText().toString();
                String status_son_2 = editText_status_son_2.getText().toString();
                String education_son_2 = editText_education_son_2.getText().toString();
                String help_son_2 = editText_help_son_2.getText().toString();
                //son 3
                String name_son_3 = editText_name_son_3.getText().toString();
                String age_son_3 = editText_age_son_3.getText().toString();
                String work_son_3 = editText_work_son_3.getText().toString();
                String date_married_son_3 = editText_dateMarried_son_3.getText().toString();
                String status_son_3 = editText_status_son_3.getText().toString();
                String education_son_3 = editText_education_son_3.getText().toString();
                String help_son_3 = editText_help_son_3.getText().toString();
                //son 4
                String name_son_4 = editText_name_son_4.getText().toString();
                String age_son_4 = editText_age_son_4.getText().toString();
                String work_son_4 = editText_work_son_4.getText().toString();
                String date_married_son_4 = editText_dateMarried_son_4.getText().toString();
                String status_son_4 = editText_status_son_4.getText().toString();
                String education_son_4 = editText_education_son_4.getText().toString();
                String help_son_4 = editText_help_son_4.getText().toString();
                //son 5
                String name_son_5 = editText_name_son_5.getText().toString();
                String age_son_5 = editText_age_son_5.getText().toString();
                String work_son_5 = editText_work_son_5.getText().toString();
                String date_married_son_5 = editText_dateMarried_son_5.getText().toString();
                String status_son_5 = editText_status_son_5.getText().toString();
                String education_son_5 = editText_education_son_5.getText().toString();
                String help_son_5 = editText_help_son_5.getText().toString();
                //son 6
                String name_son_6 = editText_name_son_6.getText().toString();
                String age_son_6 = editText_age_son_6.getText().toString();
                String work_son_6 = editText_work_son_6.getText().toString();
                String date_married_son_6 = editText_dateMarried_son_6.getText().toString();
                String status_son_6 = editText_status_son_6.getText().toString();
                String education_son_6 = editText_education_son_6.getText().toString();
                String help_son_6 = editText_help_son_6.getText().toString();
                //son 7
                String name_son_7 = editText_name_son_7.getText().toString();
                String age_son_7 = editText_age_son_7.getText().toString();
                String work_son_7 = editText_work_son_7.getText().toString();
                String date_married_son_7 = editText_dateMarried_son_7.getText().toString();
                String status_son_7 = editText_status_son_7.getText().toString();
                String education_son_7 = editText_education_son_7.getText().toString();
                String help_son_7 = editText_help_son_7.getText().toString();
                //son 8
                String name_son_8 = editText_name_son_8.getText().toString();
                String age_son_8 = editText_age_son_8.getText().toString();
                String work_son_8 = editText_work_son_8.getText().toString();
                String date_married_son_8 = editText_dateMarried_son_8.getText().toString();
                String status_son_8 = editText_status_son_8.getText().toString();
                String education_son_8 = editText_education_son_8.getText().toString();
                String help_son_8 = editText_help_son_8.getText().toString();
                //son 9
                String name_son_9 = editText_name_son_9.getText().toString();
                String age_son_9 = editText_age_son_9.getText().toString();
                String work_son_9 = editText_work_son_9.getText().toString();
                String date_married_son_9 = editText_dateMarried_son_9.getText().toString();
                String status_son_9 = editText_status_son_9.getText().toString();
                String education_son_9 = editText_education_son_9.getText().toString();
                String help_son_9 = editText_help_son_9.getText().toString();
                //son 10
                String name_son_10 = editText_name_son_10.getText().toString();
                String age_son_10 = editText_age_son_10.getText().toString();
                String work_son_10 = editText_work_son_10.getText().toString();
                String date_married_son_10 = editText_dateMarried_son_10.getText().toString();
                String status_son_10 = editText_status_son_10.getText().toString();
                String education_son_10 = editText_education_son_10.getText().toString();
                String help_son_10 = editText_help_son_10.getText().toString();
                //money of family
                String money_home = editText_money_home.getText().toString();
                String money_dept = editText_money_dept.getText().toString();
                String money_school = editText_money_school.getText().toString();
                String money_water = editText_money_water.getText().toString();
                String money_medicine = editText_money_medicine.getText().toString();
                String money_other = editText_money_other.getText().toString();
                //external money
                String money_source_1 = editText_money_source_1.getText().toString();
                String money_source_2 = editText_money_source_2.getText().toString();
                String money_source_3 = editText_money_source_3.getText().toString();
                String money_source_4 = editText_money_source_4.getText().toString();
                String money_value_1 = editText_money_value_1.getText().toString();
                String money_value_2 = editText_money_value_2.getText().toString();
                String money_value_3 = editText_money_value_3.getText().toString();
                String money_value_4 = editText_money_value_4.getText().toString();
                String money_regulary_1 = editText_money_regulary_1.getText().toString();
                String money_regulary_2 = editText_money_regulary_2.getText().toString();
                String money_regulary_3 = editText_money_regulary_3.getText().toString();
                String money_regulary_4 = editText_money_regulary_4.getText().toString();
                String money_notes_1 = editText_money_notes_1.getText().toString();
                String money_notes_2 = editText_money_notes_2.getText().toString();
                String money_notes_3 = editText_money_notes_3.getText().toString();
                String money_notes_4 = editText_money_notes_4.getText().toString();
                //number of room without roof
                String number_of_room_without_floor = editText_number_of_ghoraf.getText().toString();
                //number of room and floor
                String number_of_hograt = editText_number_of_hograt.getText().toString();
                String number_of_twabek = editText_number_of_twabek.getText().toString();
//                //CheckBox
//                String flat = checkBox_flat.getText().toString();
//                String ref = checkBox_ref.getText().toString();
//                String hadry = checkBox_hadry.getText().toString();
                String esha = checkBox_esha.getText().toString();
                String egargded = checkBox_egargded.getText().toString();
                String egarkadem = checkBox_egarkadem.getText().toString();
                String melk = checkBox_melk.getText().toString();
                String dawla = checkBox_dawla.getText().toString();
                String moshtarak = checkBox_moshtarak.getText().toString();
                String ashway = checkBox_ashway.getText().toString();
                String badw = checkBox_badw.getText().toString();
                String ref_manteka = checkBox_ref_manteka.getText().toString();
                String hadry_manteka = checkBox_hadry_manteka.getText().toString();
                String mostakel = checkBox_mostakel.getText().toString();
                String moshtarak_hammam = checkBox_moshtarak_hammam.getText().toString();
                String mafesh = checkBox_mafesh.getText().toString();
                String boos = checkBox_boos.getText().toString();
                String khashap = checkBox_khashap.getText().toString();
                String kharasana = checkBox_kharasana.getText().toString();
                String mafesh_sakf = checkBox_mafesh_sakf.getText().toString();
                //number of help
                String number_of_help = editText_number_of_help.getText().toString();
                //notes about home
                String notes_about_sakan = editText_People_notes_about_sakan.getText().toString();

                if (!TextUtils.isEmpty(number_of_sons) || !TextUtils.isEmpty(age) || !TextUtils.isEmpty(phone) || !TextUtils.isEmpty(name) ||
                        !TextUtils.isEmpty(status) || !TextUtils.isEmpty(address) || !TextUtils.isEmpty(location_map) ||
                        !TextUtils.isEmpty(work) || !TextUtils.isEmpty(huspand_name) || !TextUtils.isEmpty(huspand_age) ||
                        !TextUtils.isEmpty(huspand_work)
                        || !TextUtils.isEmpty(status_son_1) || !TextUtils.isEmpty(name_son_1)
                        || !TextUtils.isEmpty(age_son_1) || !TextUtils.isEmpty(work_son_1) ||
                        !TextUtils.isEmpty(date_married_son_1)
                        || !TextUtils.isEmpty(education_son_1) || !TextUtils.isEmpty(help_son_1)
                        || !TextUtils.isEmpty(status_son_2) || !TextUtils.isEmpty(name_son_2)
                        || !TextUtils.isEmpty(age_son_2) || !TextUtils.isEmpty(work_son_2) ||
                        !TextUtils.isEmpty(date_married_son_2)
                        || !TextUtils.isEmpty(education_son_2) || !TextUtils.isEmpty(help_son_2)
                        || !TextUtils.isEmpty(status_son_3) || !TextUtils.isEmpty(name_son_3)
                        || !TextUtils.isEmpty(age_son_3) || !TextUtils.isEmpty(work_son_3) ||
                        !TextUtils.isEmpty(date_married_son_3)
                        || !TextUtils.isEmpty(education_son_3) || !TextUtils.isEmpty(help_son_3)
                        || !TextUtils.isEmpty(status_son_4) || !TextUtils.isEmpty(name_son_4)
                        || !TextUtils.isEmpty(age_son_4) || !TextUtils.isEmpty(work_son_4) ||
                        !TextUtils.isEmpty(date_married_son_4)
                        || !TextUtils.isEmpty(education_son_4) || !TextUtils.isEmpty(help_son_4)
                        || !TextUtils.isEmpty(status_son_5) || !TextUtils.isEmpty(name_son_5)
                        || !TextUtils.isEmpty(age_son_5) || !TextUtils.isEmpty(work_son_5) ||
                        !TextUtils.isEmpty(date_married_son_5)
                        || !TextUtils.isEmpty(education_son_5) || !TextUtils.isEmpty(help_son_5)
                        || !TextUtils.isEmpty(status_son_6) || !TextUtils.isEmpty(name_son_6)
                        || !TextUtils.isEmpty(age_son_6) || !TextUtils.isEmpty(work_son_6) ||
                        !TextUtils.isEmpty(date_married_son_6)
                        || !TextUtils.isEmpty(education_son_6) || !TextUtils.isEmpty(help_son_6)
                        || !TextUtils.isEmpty(status_son_7) || !TextUtils.isEmpty(name_son_7)
                        || !TextUtils.isEmpty(age_son_7) || !TextUtils.isEmpty(work_son_7) ||
                        !TextUtils.isEmpty(date_married_son_7)
                        || !TextUtils.isEmpty(education_son_7) || !TextUtils.isEmpty(help_son_7)
                        || !TextUtils.isEmpty(status_son_8) || !TextUtils.isEmpty(name_son_8)
                        || !TextUtils.isEmpty(age_son_8) || !TextUtils.isEmpty(work_son_8) ||
                        !TextUtils.isEmpty(date_married_son_8)
                        || !TextUtils.isEmpty(education_son_8) || !TextUtils.isEmpty(help_son_8)
                        || !TextUtils.isEmpty(status_son_9) || !TextUtils.isEmpty(name_son_9)
                        || !TextUtils.isEmpty(age_son_9) || !TextUtils.isEmpty(work_son_9) ||
                        !TextUtils.isEmpty(date_married_son_9)
                        || !TextUtils.isEmpty(education_son_9) || !TextUtils.isEmpty(help_son_9)
                        || !TextUtils.isEmpty(status_son_10) || !TextUtils.isEmpty(name_son_10)
                        || !TextUtils.isEmpty(age_son_10) || !TextUtils.isEmpty(work_son_10) ||
                        !TextUtils.isEmpty(date_married_son_10)
                        || !TextUtils.isEmpty(education_son_10) || !TextUtils.isEmpty(help_son_10) ||
                        !TextUtils.isEmpty(money_home) || !TextUtils.isEmpty(money_other)
                        || !TextUtils.isEmpty(money_medicine) || !TextUtils.isEmpty(money_school) ||
                        !TextUtils.isEmpty(money_water) || !TextUtils.isEmpty(money_dept) || !TextUtils.isEmpty(money_notes_4) ||
                        !TextUtils.isEmpty(money_notes_3) || !TextUtils.isEmpty(money_source_1) || !TextUtils.isEmpty(money_notes_2)
                        || !TextUtils.isEmpty(money_source_2) || !TextUtils.isEmpty(money_source_3) || !TextUtils.isEmpty(money_source_4)
                        || !TextUtils.isEmpty(money_value_1) || !TextUtils.isEmpty(money_value_2) || !TextUtils.isEmpty(money_value_3)
                        || !TextUtils.isEmpty(money_value_4) || !TextUtils.isEmpty(money_regulary_1) || !TextUtils.isEmpty(money_regulary_2)
                        || !TextUtils.isEmpty(money_regulary_3) || !TextUtils.isEmpty(money_regulary_4) ||
                        !TextUtils.isEmpty(money_notes_1) || TextUtils.isEmpty(number_of_room_without_floor) || TextUtils.isEmpty(number_of_hograt)
                        || TextUtils.isEmpty(number_of_twabek)) {

                    Module module = new Module(notes_about_sakan, number_of_help, egargded, melk, dawla, moshtarak, ashway, badw
                            , ref_manteka, hadry_manteka, mostakel, moshtarak_hammam, mafesh, boos, khashap, mafesh_sakf, kharasana, egarkadem,
                            number_of_sons, number_of_hograt, number_of_room_without_floor, number_of_twabek, money_notes_1, money_notes_2, money_notes_3, money_notes_4, money_regulary_1, money_regulary_2, money_regulary_3
                            , money_regulary_4, money_value_1, money_value_2, money_value_3, money_value_4
                            , money_source_1, money_source_2, money_source_3, money_source_4
                            , money_home, money_other, money_medicine, money_school, money_dept, money_home, name, age, phone, address,
                            work, status, huspand_name, huspand_age, huspand_work, work_son_1,
                            date_married_son_1, status_son_1, education_son_1, help_son_1, age_son_1,
                            name_son_1, work_son_2, date_married_son_2, status_son_2, education_son_2, help_son_2, age_son_2, name_son_2
                            , work_son_3, date_married_son_3, status_son_3, education_son_3, help_son_3, age_son_3, name_son_3, work_son_4, date_married_son_4, status_son_4,
                            education_son_4, help_son_4, age_son_4, name_son_4, work_son_5, date_married_son_5, status_son_5, education_son_5, help_son_5,
                            age_son_5, name_son_5, work_son_6, date_married_son_6, status_son_6, education_son_6, help_son_6, age_son_6, name_son_6, work_son_7
                            , date_married_son_7, status_son_7, education_son_7, help_son_7, age_son_7, name_son_7, work_son_8, date_married_son_8, status_son_8
                            , education_son_8, help_son_8, age_son_8, name_son_8, work_son_9, date_married_son_9, status_son_9, education_son_9, help_son_9
                            , age_son_9, name_son_9, work_son_10, date_married_son_10, status_son_10, education_son_10, help_son_10, age_son_10, name_son_10,
                            location_map, reference.getKey().toString());


                    reference.setValue(module);
                    checkBox_type_of_area();
                    checkBox_type_of_roof();
                    checkBox_type_of_bathroom();
                    checkBox_type_of_ekama();
                    checkbox_type_of_home();

                    Toast.makeText(type_0f_user_one_Activity.this, "تم إدخال البيانات", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(type_0f_user_one_Activity.this, "لم يتم إدخال البيانات", Toast.LENGTH_SHORT).show();
                }

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
