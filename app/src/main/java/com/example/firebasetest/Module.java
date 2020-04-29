package com.example.firebasetest;

import android.widget.CheckBox;

import java.lang.reflect.Method;

public class Module {
    private String name;
    private String age;
    private String phone;
    private String address;
    private String work;
    private String status;
    private String huspand_name;
    private String huspand_age;
    private String huspand_work;
    private String work_son_1;
    private String date_married_son_1;
    private String status_son_1;
    private String education_son_1;
    private String help_son_1;
    private String age_son_1;
    private String name_son_1;
    private String work_son_2;
    private String date_married_son_2;
    private String status_son_2;
    private String education_son_2;
    private String help_son_2;
    private String age_son_2;
    private String name_son_2;
    private String work_son_3;
    private String date_married_son_3;
    private String status_son_3;
    private String education_son_3;
    private String help_son_3;
    private String age_son_3;
    private String name_son_3;
    private String work_son_4;
    private String date_married_son_4;
    private String status_son_4;
    private String education_son_4;
    private String help_son_4;
    private String age_son_4;
    private String name_son_4;
    private String work_son_5;
    private String date_married_son_5;
    private String status_son_5;
    private String education_son_5;
    private String help_son_5;
    private String age_son_5;
    private String name_son_5;
    private String work_son_6;
    private String date_married_son_6;
    private String status_son_6;
    private String education_son_6;
    private String help_son_6;
    private String age_son_6;
    private String name_son_6;
    private String work_son_7;
    private String date_married_son_7;
    private String status_son_7;
    private String education_son_7;
    private String help_son_7;
    private String age_son_7;
    private String name_son_7;
    private String work_son_8;
    private String date_married_son_8;
    private String status_son_8;
    private String education_son_8;
    private String help_son_8;
    private String age_son_8;
    private String name_son_8;
    private String work_son_9;
    private String date_married_son_9;
    private String status_son_9;
    private String education_son_9;
    private String help_son_9;
    private String age_son_9;
    private String name_son_9;
    private String work_son_10;
    private String date_married_son_10;
    private String status_son_10;
    private String education_son_10;
    private String help_son_10;
    private String age_son_10;
    private String money_home;
    private String money_dept;
    private String money_school;
    private String money_water;
    private String money_other;
    private String money_medicine;
    private String money_source_1;
    private String money_source_2;
    private String money_source_3;
    private String money_source_4;
    private String money_value_1;
    private String money_value_2;
    private String money_value_3;
    private String money_value_4;
    private String money_regulary_1;
    private String money_regulary_2;
    private String money_regulary_3;
    private String money_regulary_4;
    private String money_notes_1;
    private String money_notes_2;
    private String money_notes_3;
    private String money_notes_4;
    private String number_of_twabek;
    private String number_of_hograt;
    private String number_of_room_without_floor;
    private String checkBox_shaka;
//    private String checkBox_ref;
//    private String checkBox_hadry;
//    private String checkBox_esha;
    private String checkBox_egarkadem;
    private String checkBox_egargded;
    private String checkBox_melk;
    private String checkBox_dawla;
    private String checkBox_moshtarak;
    private String checkBox_ashway;
    private String checkBox_badw;
    private String checkBox_ref_manteka;
    private String checkBox_hadry_manteka;
    private String checkBox_mostakel;
    private String checkBox_moshtarak_bathroom;
    private String checkBox_mafesh;
    private String checkBox_boos;
    private String checkBox_khashap;
    private String checkBox_mafesh_sakf;
    private String checkBox_kharasana;
    private String number_of_sons;
    private String number_of_help;
    private String notes_about_sakan;
    private String type_of_home;
    private String type_of_area;
    private String type_of_bathroom;
    private String type_of_roof;

    public String getType_of_area() {
        return type_of_area;
    }

    public void setType_of_area(String type_of_area) {
        this.type_of_area = type_of_area;
    }

    public String getType_of_bathroom() {
        return type_of_bathroom;
    }

    public void setType_of_bathroom(String type_of_bathroom) {
        this.type_of_bathroom = type_of_bathroom;
    }

    public String getType_of_roof() {
        return type_of_roof;
    }

    public void setType_of_roof(String type_of_roof) {
        this.type_of_roof = type_of_roof;
    }

    public String getType_of_ekama() {
        return type_of_ekama;
    }

    public void setType_of_ekama(String type_of_ekama) {
        this.type_of_ekama = type_of_ekama;
    }

    private String type_of_ekama;



    public String getType_of_home() {
        return type_of_home;
    }

    public void setType_of_home(String type_of_home) {
        this.type_of_home = type_of_home;
    }

    public Module(String notes_about_sakan, String number_of_help, String checkBox_egargded, String checkBox_melk, String checkBox_dawla,
                  String checkBox_moshtarak, String checkBox_ashway, String checkBox_badw, String checkBox_ref_manteka,
                  String checkBox_hadry_manteka, String checkBox_mostakel,
                  String checkBox_moshtarak_bathroom, String checkBox_mafesh, String checkBox_boos, String checkBox_khashap, String checkBox_mafesh_sakf,
                  String checkBox_kharasana, String checkBox_egarkadem,
                  String number_of_sons, String number_of_hograt, String number_of_room_without_floor, String number_of_twabek,
                  String money_notes_1, String money_notes_2, String money_notes_3, String money_notes_4, String money_regulary_1,
                  String money_regulary_2, String money_regulary_3, String money_regulary_4,
                  String money_value_1, String money_value_2, String money_value_3, String money_value_4,
                  String money_source_1, String money_source_2, String money_source_3, String money_source_4,
                  String money_water, String money_other, String money_medicine, String money_school,
                  String money_dept, String money_home, String name, String age, String phone,
                  String address, String work, String status, String huspand_name, String huspand_age,
                  String huspand_work, String work_son_1, String date_married_son_1, String status_son_1,
                  String education_son_1, String help_son_1, String age_son_1, String name_son_1, String work_son_2,
                  String date_married_son_2, String status_son_2, String education_son_2, String help_son_2,
                  String age_son_2, String name_son_2, String work_son_3, String date_married_son_3, String status_son_3,
                  String education_son_3, String help_son_3, String age_son_3, String name_son_3, String work_son_4,
                  String date_married_son_4, String status_son_4, String education_son_4, String help_son_4,
                  String age_son_4, String name_son_4, String work_son_5, String date_married_son_5, String status_son_5,
                  String education_son_5, String help_son_5, String age_son_5, String name_son_5, String work_son_6,
                  String date_married_son_6, String status_son_6, String education_son_6, String help_son_6,
                  String age_son_6, String name_son_6, String work_son_7, String date_married_son_7, String status_son_7,
                  String education_son_7, String help_son_7, String age_son_7, String name_son_7, String work_son_8,
                  String date_married_son_8, String status_son_8, String education_son_8, String help_son_8,
                  String age_son_8, String name_son_8, String work_son_9, String date_married_son_9, String status_son_9,
                  String education_son_9, String help_son_9, String age_son_9, String name_son_9, String work_son_10,
                  String date_married_son_10, String status_son_10, String education_son_10, String help_son_10,
                  String age_son_10, String name_son_10, String location_map, String id) {
        this.notes_about_sakan = notes_about_sakan;
        this.number_of_help = number_of_help;
        this.checkBox_egargded = checkBox_egargded;
        this.checkBox_melk = checkBox_melk;
        this.checkBox_dawla = checkBox_dawla;
        this.checkBox_moshtarak = checkBox_moshtarak;
        this.checkBox_ashway = checkBox_ashway;
        this.checkBox_badw = checkBox_badw;
        this.checkBox_ref_manteka = checkBox_ref_manteka;
        this.checkBox_hadry_manteka = checkBox_hadry_manteka;
        this.checkBox_mostakel = checkBox_mostakel;
        this.checkBox_moshtarak_bathroom = checkBox_moshtarak_bathroom;
        this.checkBox_mafesh = checkBox_mafesh;
        this.checkBox_boos = checkBox_boos;
        this.checkBox_khashap = checkBox_khashap;
        this.checkBox_mafesh_sakf = checkBox_mafesh_sakf;
        this.checkBox_kharasana = checkBox_kharasana;
        this.checkBox_egarkadem = checkBox_egarkadem;
//        this.checkBox_esha = checkBox_esha;
//        this.checkBox_hadry = checkBox_hadry;
//        this.checkBox_ref = checkBox_ref;

        this.number_of_sons = number_of_sons;
        this.number_of_hograt = number_of_hograt;
        this.number_of_twabek = number_of_twabek;
        this.number_of_room_without_floor = number_of_room_without_floor;
        this.money_source_1 = money_source_1;
        this.money_source_2 = money_source_2;
        this.money_source_3 = money_source_3;
        this.money_source_4 = money_source_4;
        this.money_value_1 = money_value_1;
        this.money_value_2 = money_value_2;
        this.money_value_3 = money_value_3;
        this.money_value_4 = money_value_4;
        this.money_notes_1 = money_notes_1;
        this.money_notes_2 = money_notes_2;
        this.money_notes_3 = money_notes_3;
        this.money_notes_4 = money_notes_4;
        this.money_regulary_1 = money_regulary_1;
        this.money_regulary_2 = money_regulary_2;
        this.money_regulary_3 = money_regulary_3;
        this.money_regulary_4 = money_regulary_4;
        this.money_home = money_home;
        this.money_dept = money_dept;
        this.money_water = money_water;
        this.money_school = money_school;
        this.money_other = money_other;
        this.money_medicine = money_medicine;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.work = work;
        this.status = status;
        this.huspand_name = huspand_name;
        this.huspand_age = huspand_age;
        this.huspand_work = huspand_work;
        this.work_son_1 = work_son_1;
        this.date_married_son_1 = date_married_son_1;
        this.status_son_1 = status_son_1;
        this.education_son_1 = education_son_1;
        this.help_son_1 = help_son_1;
        this.age_son_1 = age_son_1;
        this.name_son_1 = name_son_1;
        this.work_son_2 = work_son_2;
        this.date_married_son_2 = date_married_son_2;
        this.status_son_2 = status_son_2;
        this.education_son_2 = education_son_2;
        this.help_son_2 = help_son_2;
        this.age_son_2 = age_son_2;
        this.name_son_2 = name_son_2;
        this.work_son_3 = work_son_3;
        this.date_married_son_3 = date_married_son_3;
        this.status_son_3 = status_son_3;
        this.education_son_3 = education_son_3;
        this.help_son_3 = help_son_3;
        this.age_son_3 = age_son_3;
        this.name_son_3 = name_son_3;
        this.work_son_4 = work_son_4;
        this.date_married_son_4 = date_married_son_4;
        this.status_son_4 = status_son_4;
        this.education_son_4 = education_son_4;
        this.help_son_4 = help_son_4;
        this.age_son_4 = age_son_4;
        this.name_son_4 = name_son_4;
        this.work_son_5 = work_son_5;
        this.date_married_son_5 = date_married_son_5;
        this.status_son_5 = status_son_5;
        this.education_son_5 = education_son_5;
        this.help_son_5 = help_son_5;
        this.age_son_5 = age_son_5;
        this.name_son_5 = name_son_5;
        this.work_son_6 = work_son_6;
        this.date_married_son_6 = date_married_son_6;
        this.status_son_6 = status_son_6;
        this.education_son_6 = education_son_6;
        this.help_son_6 = help_son_6;
        this.age_son_6 = age_son_6;
        this.name_son_6 = name_son_6;
        this.work_son_7 = work_son_7;
        this.date_married_son_7 = date_married_son_7;
        this.status_son_7 = status_son_7;
        this.education_son_7 = education_son_7;
        this.help_son_7 = help_son_7;
        this.age_son_7 = age_son_7;
        this.name_son_7 = name_son_7;
        this.work_son_8 = work_son_8;
        this.date_married_son_8 = date_married_son_8;
        this.status_son_8 = status_son_8;
        this.education_son_8 = education_son_8;
        this.help_son_8 = help_son_8;
        this.age_son_8 = age_son_8;
        this.name_son_8 = name_son_8;
        this.work_son_9 = work_son_9;
        this.date_married_son_9 = date_married_son_9;
        this.status_son_9 = status_son_9;
        this.education_son_9 = education_son_9;
        this.help_son_9 = help_son_9;
        this.age_son_9 = age_son_9;
        this.name_son_9 = name_son_9;
        this.work_son_10 = work_son_10;
        this.date_married_son_10 = date_married_son_10;
        this.status_son_10 = status_son_10;
        this.education_son_10 = education_son_10;
        this.help_son_10 = help_son_10;
        this.age_son_10 = age_son_10;
        this.name_son_10 = name_son_10;
        this.location_map = location_map;
        this.id = id;

    }

    public String getNotes_about_sakan() {
        return notes_about_sakan;
    }

    public void setNotes_about_sakan(String notes_about_sakan) {
        this.notes_about_sakan = notes_about_sakan;
    }

    public String getNumber_of_help() {
        return number_of_help;
    }

    public void setNumber_of_help(String number_of_help) {
        this.number_of_help = number_of_help;
    }

    public String getCheckBox_hadry_manteka() {
        return checkBox_hadry_manteka;
    }

    public void setCheckBox_hadry_manteka(String checkBox_hadry_manteka) {
        this.checkBox_hadry_manteka = checkBox_hadry_manteka;
    }

    public String getCheckBox_moshtarak_bathroom() {
        return checkBox_moshtarak_bathroom;
    }

    public void setCheckBox_moshtarak_bathroom(String checkBox_moshtarak_bathroom) {
        this.checkBox_moshtarak_bathroom = checkBox_moshtarak_bathroom;
    }


    public String getNumber_of_sons() {
        return number_of_sons;
    }

    public void setNumber_of_sons(String number_of_sons) {
        this.number_of_sons = number_of_sons;
    }

    public String getCheckBox_shaka() {
        return checkBox_shaka;
    }

    public void setCheckBox_shaka(String checkBox_shaka) {
        this.checkBox_shaka = checkBox_shaka;
    }

//    public String getCheckBox_ref() {
//        return checkBox_ref;
//    }
//
//    public void setCheckBox_ref(String checkBox_ref) {
//        this.checkBox_ref = checkBox_ref;
//    }
//
//    public String getCheckBox_hadry() {
//        return checkBox_hadry;
//    }
//
//    public void setCheckBox_hadry(String checkBox_hadry) {
//        this.checkBox_hadry = checkBox_hadry;
//    }
//
//    public String getCheckBox_esha() {
//        return checkBox_esha;
//    }
//
//    public void setCheckBox_esha(String checkBox_esha) {
//        this.checkBox_esha = checkBox_esha;
//    }

    public String getCheckBox_egarkadem() {
        return checkBox_egarkadem;
    }

    public void setCheckBox_egarkadem(String checkBox_egarkadem) {
        this.checkBox_egarkadem = checkBox_egarkadem;
    }

    public String getCheckBox_egargded() {
        return checkBox_egargded;
    }

    public void setCheckBox_egargded(String checkBox_egargded) {
        this.checkBox_egargded = checkBox_egargded;
    }

    public String getCheckBox_melk() {
        return checkBox_melk;
    }

    public void setCheckBox_melk(String checkBox_melk) {
        this.checkBox_melk = checkBox_melk;
    }

    public String getCheckBox_dawla() {
        return checkBox_dawla;
    }

    public void setCheckBox_dawla(String checkBox_dawla) {
        this.checkBox_dawla = checkBox_dawla;
    }

    public String getCheckBox_moshtarak() {
        return checkBox_moshtarak;
    }

    public void setCheckBox_moshtarak(String checkBox_moshtarak) {
        this.checkBox_moshtarak = checkBox_moshtarak;
    }

    public String getCheckBox_ashway() {
        return checkBox_ashway;
    }

    public void setCheckBox_ashway(String checkBox_ashway) {
        this.checkBox_ashway = checkBox_ashway;
    }

    public String getCheckBox_badw() {
        return checkBox_badw;
    }

    public void setCheckBox_badw(String checkBox_badw) {
        this.checkBox_badw = checkBox_badw;
    }

    public String getCheckBox_ref_manteka() {
        return checkBox_ref_manteka;
    }

    public void setCheckBox_ref_manteka(String checkBox_ref_manteka) {
        this.checkBox_ref_manteka = checkBox_ref_manteka;
    }


    public String getCheckBox_mostakel() {
        return checkBox_mostakel;
    }

    public void setCheckBox_mostakel(String checkBox_mostakel) {
        this.checkBox_mostakel = checkBox_mostakel;
    }


    public String getCheckBox_mafesh() {
        return checkBox_mafesh;
    }

    public void setCheckBox_mafesh(String checkBox_mafesh) {
        this.checkBox_mafesh = checkBox_mafesh;
    }

    public String getCheckBox_boos() {
        return checkBox_boos;
    }

    public void setCheckBox_boos(String checkBox_boos) {
        this.checkBox_boos = checkBox_boos;
    }

    public String getCheckBox_khashap() {
        return checkBox_khashap;
    }

    public void setCheckBox_khashap(String checkBox_khashap) {
        this.checkBox_khashap = checkBox_khashap;
    }

    public String getCheckBox_mafesh_sakf() {
        return checkBox_mafesh_sakf;
    }

    public void setCheckBox_mafesh_sakf(String checkBox_mafesh_sakf) {
        this.checkBox_mafesh_sakf = checkBox_mafesh_sakf;
    }

    public String getCheckBox_kharasana() {
        return checkBox_kharasana;
    }

    public void setCheckBox_kharasana(String checkBox_kharasana) {
        this.checkBox_kharasana = checkBox_kharasana;
    }

    public String getNumber_of_twabek() {
        return number_of_twabek;
    }

    public void setNumber_of_twabek(String number_of_twabek) {
        this.number_of_twabek = number_of_twabek;
    }

    public String getNumber_of_hograt() {
        return number_of_hograt;
    }

    public void setNumber_of_hograt(String number_of_hograt) {
        this.number_of_hograt = number_of_hograt;
    }

    public String getNumber_of_room_without_floor() {
        return number_of_room_without_floor;
    }

    public void setNumber_of_room_without_floor(String number_of_room_without_floor) {
        this.number_of_room_without_floor = number_of_room_without_floor;
    }

    public String getMoney_home() {
        return money_home;
    }

    public void setMoney_home(String money_home) {
        this.money_home = money_home;
    }

    public String getMoney_dept() {
        return money_dept;
    }

    public void setMoney_dept(String money_dept) {
        this.money_dept = money_dept;
    }

    public String getMoney_school() {
        return money_school;
    }

    public void setMoney_school(String money_school) {
        this.money_school = money_school;
    }

    public String getMoney_water() {
        return money_water;
    }

    public void setMoney_water(String money_water) {
        this.money_water = money_water;
    }

    public String getMoney_other() {
        return money_other;
    }

    public void setMoney_other(String money_other) {
        this.money_other = money_other;
    }

    public String getMoney_medicine() {
        return money_medicine;
    }

    public void setMoney_medicine(String money_medicine) {
        this.money_medicine = money_medicine;
    }

    public String getMoney_source_1() {
        return money_source_1;
    }

    public void setMoney_source_1(String money_source_1) {
        this.money_source_1 = money_source_1;
    }

    public String getMoney_source_2() {
        return money_source_2;
    }

    public void setMoney_source_2(String money_source_2) {
        this.money_source_2 = money_source_2;
    }

    public String getMoney_source_3() {
        return money_source_3;
    }

    public void setMoney_source_3(String money_source_3) {
        this.money_source_3 = money_source_3;
    }

    public String getMoney_source_4() {
        return money_source_4;
    }

    public void setMoney_source_4(String money_source_4) {
        this.money_source_4 = money_source_4;
    }

    public String getMoney_value_1() {
        return money_value_1;
    }

    public void setMoney_value_1(String money_value_1) {
        this.money_value_1 = money_value_1;
    }

    public String getMoney_value_2() {
        return money_value_2;
    }

    public void setMoney_value_2(String money_value_2) {
        this.money_value_2 = money_value_2;
    }

    public String getMoney_value_3() {
        return money_value_3;
    }

    public void setMoney_value_3(String money_value_3) {
        this.money_value_3 = money_value_3;
    }

    public String getMoney_value_4() {
        return money_value_4;
    }

    public void setMoney_value_4(String money_value_4) {
        this.money_value_4 = money_value_4;
    }

    public String getMoney_regulary_1() {
        return money_regulary_1;
    }

    public void setMoney_regulary_1(String money_regulary_1) {
        this.money_regulary_1 = money_regulary_1;
    }

    public String getMoney_regulary_2() {
        return money_regulary_2;
    }

    public void setMoney_regulary_2(String money_regulary_2) {
        this.money_regulary_2 = money_regulary_2;
    }

    public String getMoney_regulary_3() {
        return money_regulary_3;
    }

    public void setMoney_regulary_3(String money_regulary_3) {
        this.money_regulary_3 = money_regulary_3;
    }

    public String getMoney_regulary_4() {
        return money_regulary_4;
    }

    public void setMoney_regulary_4(String money_regulary_4) {
        this.money_regulary_4 = money_regulary_4;
    }

    public String getMoney_notes_1() {
        return money_notes_1;
    }

    public void setMoney_notes_1(String money_notes_1) {
        this.money_notes_1 = money_notes_1;
    }

    public String getMoney_notes_2() {
        return money_notes_2;
    }

    public void setMoney_notes_2(String money_notes_2) {
        this.money_notes_2 = money_notes_2;
    }

    public String getMoney_notes_3() {
        return money_notes_3;
    }

    public void setMoney_notes_3(String money_notes_3) {
        this.money_notes_3 = money_notes_3;
    }

    public String getMoney_notes_4() {
        return money_notes_4;
    }

    public void setMoney_notes_4(String money_notes_4) {
        this.money_notes_4 = money_notes_4;
    }


    public String getWork_son_2() {
        return work_son_2;
    }

    public void setWork_son_2(String work_son_2) {
        this.work_son_2 = work_son_2;
    }

    public String getDate_married_son_2() {
        return date_married_son_2;
    }

    public void setDate_married_son_2(String date_married_son_2) {
        this.date_married_son_2 = date_married_son_2;
    }

    public String getStatus_son_2() {
        return status_son_2;
    }

    public void setStatus_son_2(String status_son_2) {
        this.status_son_2 = status_son_2;
    }

    public String getEducation_son_2() {
        return education_son_2;
    }

    public void setEducation_son_2(String education_son_2) {
        this.education_son_2 = education_son_2;
    }

    public String getHelp_son_2() {
        return help_son_2;
    }

    public void setHelp_son_2(String help_son_2) {
        this.help_son_2 = help_son_2;
    }

    public String getAge_son_2() {
        return age_son_2;
    }

    public void setAge_son_2(String age_son_2) {
        this.age_son_2 = age_son_2;
    }

    public String getName_son_2() {
        return name_son_2;
    }

    public void setName_son_2(String name_son_2) {
        this.name_son_2 = name_son_2;
    }

    public String getWork_son_3() {
        return work_son_3;
    }

    public void setWork_son_3(String work_son_3) {
        this.work_son_3 = work_son_3;
    }

    public String getDate_married_son_3() {
        return date_married_son_3;
    }

    public void setDate_married_son_3(String date_married_son_3) {
        this.date_married_son_3 = date_married_son_3;
    }

    public String getStatus_son_3() {
        return status_son_3;
    }

    public void setStatus_son_3(String status_son_3) {
        this.status_son_3 = status_son_3;
    }

    public String getEducation_son_3() {
        return education_son_3;
    }

    public void setEducation_son_3(String education_son_3) {
        this.education_son_3 = education_son_3;
    }

    public String getHelp_son_3() {
        return help_son_3;
    }

    public void setHelp_son_3(String help_son_3) {
        this.help_son_3 = help_son_3;
    }

    public String getAge_son_3() {
        return age_son_3;
    }

    public void setAge_son_3(String age_son_3) {
        this.age_son_3 = age_son_3;
    }

    public String getName_son_3() {
        return name_son_3;
    }

    public void setName_son_3(String name_son_3) {
        this.name_son_3 = name_son_3;
    }

    public String getWork_son_4() {
        return work_son_4;
    }

    public void setWork_son_4(String work_son_4) {
        this.work_son_4 = work_son_4;
    }

    public String getDate_married_son_4() {
        return date_married_son_4;
    }

    public void setDate_married_son_4(String date_married_son_4) {
        this.date_married_son_4 = date_married_son_4;
    }

    public String getStatus_son_4() {
        return status_son_4;
    }

    public void setStatus_son_4(String status_son_4) {
        this.status_son_4 = status_son_4;
    }

    public String getEducation_son_4() {
        return education_son_4;
    }

    public void setEducation_son_4(String education_son_4) {
        this.education_son_4 = education_son_4;
    }

    public String getHelp_son_4() {
        return help_son_4;
    }

    public void setHelp_son_4(String help_son_4) {
        this.help_son_4 = help_son_4;
    }

    public String getAge_son_4() {
        return age_son_4;
    }

    public void setAge_son_4(String age_son_4) {
        this.age_son_4 = age_son_4;
    }

    public String getName_son_4() {
        return name_son_4;
    }

    public void setName_son_4(String name_son_4) {
        this.name_son_4 = name_son_4;
    }

    public String getWork_son_5() {
        return work_son_5;
    }

    public void setWork_son_5(String work_son_5) {
        this.work_son_5 = work_son_5;
    }

    public String getDate_married_son_5() {
        return date_married_son_5;
    }

    public void setDate_married_son_5(String date_married_son_5) {
        this.date_married_son_5 = date_married_son_5;
    }

    public String getStatus_son_5() {
        return status_son_5;
    }

    public void setStatus_son_5(String status_son_5) {
        this.status_son_5 = status_son_5;
    }

    public String getEducation_son_5() {
        return education_son_5;
    }

    public void setEducation_son_5(String education_son_5) {
        this.education_son_5 = education_son_5;
    }

    public String getHelp_son_5() {
        return help_son_5;
    }

    public void setHelp_son_5(String help_son_5) {
        this.help_son_5 = help_son_5;
    }

    public String getAge_son_5() {
        return age_son_5;
    }

    public void setAge_son_5(String age_son_5) {
        this.age_son_5 = age_son_5;
    }

    public String getName_son_5() {
        return name_son_5;
    }

    public void setName_son_5(String name_son_5) {
        this.name_son_5 = name_son_5;
    }

    public String getWork_son_6() {
        return work_son_6;
    }

    public void setWork_son_6(String work_son_6) {
        this.work_son_6 = work_son_6;
    }

    public String getDate_married_son_6() {
        return date_married_son_6;
    }

    public void setDate_married_son_6(String date_married_son_6) {
        this.date_married_son_6 = date_married_son_6;
    }

    public String getStatus_son_6() {
        return status_son_6;
    }

    public void setStatus_son_6(String status_son_6) {
        this.status_son_6 = status_son_6;
    }

    public String getEducation_son_6() {
        return education_son_6;
    }

    public void setEducation_son_6(String education_son_6) {
        this.education_son_6 = education_son_6;
    }

    public String getHelp_son_6() {
        return help_son_6;
    }

    public void setHelp_son_6(String help_son_6) {
        this.help_son_6 = help_son_6;
    }

    public String getAge_son_6() {
        return age_son_6;
    }

    public void setAge_son_6(String age_son_6) {
        this.age_son_6 = age_son_6;
    }

    public String getName_son_6() {
        return name_son_6;
    }

    public void setName_son_6(String name_son_6) {
        this.name_son_6 = name_son_6;
    }

    public String getWork_son_7() {
        return work_son_7;
    }

    public void setWork_son_7(String work_son_7) {
        this.work_son_7 = work_son_7;
    }

    public String getDate_married_son_7() {
        return date_married_son_7;
    }

    public void setDate_married_son_7(String date_married_son_7) {
        this.date_married_son_7 = date_married_son_7;
    }

    public String getStatus_son_7() {
        return status_son_7;
    }

    public void setStatus_son_7(String status_son_7) {
        this.status_son_7 = status_son_7;
    }

    public String getEducation_son_7() {
        return education_son_7;
    }

    public void setEducation_son_7(String education_son_7) {
        this.education_son_7 = education_son_7;
    }

    public String getHelp_son_7() {
        return help_son_7;
    }

    public void setHelp_son_7(String help_son_7) {
        this.help_son_7 = help_son_7;
    }

    public String getAge_son_7() {
        return age_son_7;
    }

    public void setAge_son_7(String age_son_7) {
        this.age_son_7 = age_son_7;
    }

    public String getName_son_7() {
        return name_son_7;
    }

    public void setName_son_7(String name_son_7) {
        this.name_son_7 = name_son_7;
    }

    public String getWork_son_8() {
        return work_son_8;
    }

    public void setWork_son_8(String work_son_8) {
        this.work_son_8 = work_son_8;
    }

    public String getDate_married_son_8() {
        return date_married_son_8;
    }

    public void setDate_married_son_8(String date_married_son_8) {
        this.date_married_son_8 = date_married_son_8;
    }

    public String getStatus_son_8() {
        return status_son_8;
    }

    public void setStatus_son_8(String status_son_8) {
        this.status_son_8 = status_son_8;
    }

    public String getEducation_son_8() {
        return education_son_8;
    }

    public void setEducation_son_8(String education_son_8) {
        this.education_son_8 = education_son_8;
    }

    public String getHelp_son_8() {
        return help_son_8;
    }

    public void setHelp_son_8(String help_son_8) {
        this.help_son_8 = help_son_8;
    }

    public String getAge_son_8() {
        return age_son_8;
    }

    public void setAge_son_8(String age_son_8) {
        this.age_son_8 = age_son_8;
    }

    public String getName_son_8() {
        return name_son_8;
    }

    public void setName_son_8(String name_son_8) {
        this.name_son_8 = name_son_8;
    }

    public String getWork_son_9() {
        return work_son_9;
    }

    public void setWork_son_9(String work_son_9) {
        this.work_son_9 = work_son_9;
    }

    public String getDate_married_son_9() {
        return date_married_son_9;
    }

    public void setDate_married_son_9(String date_married_son_9) {
        this.date_married_son_9 = date_married_son_9;
    }

    public String getStatus_son_9() {
        return status_son_9;
    }

    public void setStatus_son_9(String status_son_9) {
        this.status_son_9 = status_son_9;
    }

    public String getEducation_son_9() {
        return education_son_9;
    }

    public void setEducation_son_9(String education_son_9) {
        this.education_son_9 = education_son_9;
    }

    public String getHelp_son_9() {
        return help_son_9;
    }

    public void setHelp_son_9(String help_son_9) {
        this.help_son_9 = help_son_9;
    }

    public String getAge_son_9() {
        return age_son_9;
    }

    public void setAge_son_9(String age_son_9) {
        this.age_son_9 = age_son_9;
    }

    public String getName_son_9() {
        return name_son_9;
    }

    public void setName_son_9(String name_son_9) {
        this.name_son_9 = name_son_9;
    }

    public String getWork_son_10() {
        return work_son_10;
    }

    public void setWork_son_10(String work_son_10) {
        this.work_son_10 = work_son_10;
    }

    public String getDate_married_son_10() {
        return date_married_son_10;
    }

    public void setDate_married_son_10(String date_married_son_10) {
        this.date_married_son_10 = date_married_son_10;
    }

    public String getStatus_son_10() {
        return status_son_10;
    }

    public void setStatus_son_10(String status_son_10) {
        this.status_son_10 = status_son_10;
    }

    public String getEducation_son_10() {
        return education_son_10;
    }

    public void setEducation_son_10(String education_son_10) {
        this.education_son_10 = education_son_10;
    }

    public String getHelp_son_10() {
        return help_son_10;
    }

    public void setHelp_son_10(String help_son_10) {
        this.help_son_10 = help_son_10;
    }

    public String getAge_son_10() {
        return age_son_10;
    }

    public void setAge_son_10(String age_son_10) {
        this.age_son_10 = age_son_10;
    }

    public String getName_son_10() {
        return name_son_10;
    }

    public void setName_son_10(String name_son_10) {
        this.name_son_10 = name_son_10;
    }

    private String name_son_10;

    public String getWork_son_1() {
        return work_son_1;
    }

    public void setWork_son_1(String work_son_1) {
        this.work_son_1 = work_son_1;
    }

    public String getDate_married_son_1() {
        return date_married_son_1;
    }

    public void setDate_married_son_1(String date_married_son_1) {
        this.date_married_son_1 = date_married_son_1;
    }

    public String getStatus_son_1() {
        return status_son_1;
    }

    public void setStatus_son_1(String status_son_1) {
        this.status_son_1 = status_son_1;
    }

    public String getEducation_son_1() {
        return education_son_1;
    }

    public void setEducation_son_1(String education_son_1) {
        this.education_son_1 = education_son_1;
    }

    public String getHelp_son_1() {
        return help_son_1;
    }

    public void setHelp_son_1(String help_son_1) {
        this.help_son_1 = help_son_1;
    }

    public String getAge_son_1() {
        return age_son_1;
    }

    public void setAge_son_1(String age_son_1) {
        this.age_son_1 = age_son_1;
    }

    public String getName_son_1() {
        return name_son_1;
    }

    public void setName_son_1(String name_son_1) {
        this.name_son_1 = name_son_1;
    }

    public String getLocation_map() {
        return location_map;
    }

    public void setLocation_map(String location_map) {
        this.location_map = location_map;
    }

    private String location_map;


    public String getHuspand_name() {
        return huspand_name;
    }

    public void setHuspand_name(String huspand_name) {
        this.huspand_name = huspand_name;
    }

    public String getHuspand_age() {
        return huspand_age;
    }

    public void setHuspand_age(String huspand_age) {
        this.huspand_age = huspand_age;
    }

    public String getHuspand_work() {
        return huspand_work;
    }

    public void setHuspand_work(String huspand_work) {
        this.huspand_work = huspand_work;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public Module() {
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
// private void checkbox() {
//        final String flat = "شقة";
//        final String ref = "منزل ريفي";
//        final String hadry = "منزل حضري";
//        final String esha = "عشة";
//        final String old_rent = "إيجار قديم";
//        final String new_rent = "إيجار جديد";
//        final String own = "ملك";
//        final String country = "أملاك دولة";
//        final String Mutual = "مشترك";
//        final String ashway = "عشوائي";
//        final String badw = "بدو";
//        final String reef = "ريف";
//        final String hadr = "حضر";
//        final String mostakel = "مستقل";
//        final String moshtarak = "مشترك";
//        final String notfind = "لا يوجد";
//        final String boos = "بوص";
//        final String wood = "خشب";
//        final String Concrete = "خرصانة";
//        final String noroof = "بدون سقف";
//        checkBox_shaka.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("users").child(edit_user_name.getText().toString()).push();
//                if (isChecked) {
//                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
//                    module.setType_of_home_flat(flat);
//                    reference.setValue(module);
//                }
//            }
//        });
////        checkBox_ref.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_home_ref(ref);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_hadry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_home_hadr(hadry);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_esha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_home_esha(esha);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_egarkadem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_ekama(old_rent);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_egargded.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_ekama(new_rent);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_melk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_ekama(own);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_dawla.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_ekama(country);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_moshtarak.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_ekama(Mutual);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_ashway.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_area(ashway);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_badw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_area(badw);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_ref_manteka.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_area(reef);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_hadry_manteka.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_area(hadr);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_mostakel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_bathroom(mostakel);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_moshtarak_hammam.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_bathroom(moshtarak);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_mafesh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_bathroom(notfind);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_boos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_roof(boos);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_khashap.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_roof(wood);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_mafesh_sakf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_roof(noroof);
////                    reference.setValue(module);
////                }
////            }
////        });
////        checkBox_kharasana.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(edit_user_name.getText().toString()).push();
////                if (isChecked) {
////                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
////                    module.setType_of_roof(Concrete);
////                    reference.setValue(module);
////                }
////            }
////        });
//    }