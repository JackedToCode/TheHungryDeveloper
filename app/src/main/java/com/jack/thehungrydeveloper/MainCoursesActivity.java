package com.jack.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = {
                new Dish("Onion and parmesan ciabatta", "Warm ciabatta filled with chargrilled onion and parmesan", 124),
                new Dish("Spinach and banana korma", "Creamy korma made with fresh spinach and banana", 542),
                new Dish("Pepper and mushroom maki", "Toasted seaweed wrapped around sushi rice, filled with green pepper and crimini mushroom", 153),
                new Dish("Chickpea and parsley wontons", "Thin wonton cases stuffed with fresh chickpea and parsley", 235),
                new Dish("Apple and oatbran buns", "Moist buns made with crisp apple and oatbran", 732),
                new Dish("Coriander and strawberry cookies", "Crunchy cookies made with fresh coriander and strawberries", 197),
                new Dish("Aubergine and chilli dumplings", "Thin pastry cases stuffed with chargrilled aubergine and firey chilli", 185),
                new Dish("Cardamom and pepper dip", "A dip made from green cardamom and bell pepper", 185),
                new Dish("Rhubarb and lamb pie", "A shortcrust pasty case filled with fresh rhubarb and minced lamb", 147),
                new Dish("Bocconcini and spring onion salad", "A crunchy salad featuring bocconcini and fresh spring onion", 194)
        };

        //interprets the array
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);
        //set the array
        mainCoursesList.setAdapter(dishesAdapter);
    }
}
