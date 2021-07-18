package com.jack.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.jack.thehungrydeveloper.starteractivity.Dish;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = {
                new Dish("Onion and parmesan ciabatta", "Warm ciabatta filled with chargrilled onion and parmesan", 124),
                new Dish("Spinach and banana korma", "Creamy korma made with fresh spinach and banana", 542),
                new Dish("Pepper and mushroom maki", "Toasted seaweed wrapped around sushi rice, filled with green pepper and crimini mushroom", 153)
        };
    }
}
