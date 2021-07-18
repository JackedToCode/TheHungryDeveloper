package com.jack.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DesertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        ListView desertsList = findViewById(R.id.list_view_activity_desert);

        Dish[] deserts = {
                new Dish("Polenta and pumpkin seed cookies", "Crunchy cookies made with polenta and pumpkin seeds", 124),
                new Dish("Peach and orange cupcakes", "Moist cupcakes made with fresh peach and sweet orange\ne", 542),
                new Dish("Squash and cardamom cake", "Rich cake made with acorn squash and green cardamom", 153),
                new Dish("Grouse and apple bagel", "A warm bagel filled with grouse and tart apple", 235),
                new Dish("Bacon and sultana biscuits", "Crumbly biscuits made with smoked bacon and sultana", 732),
                new Dish("Gruyere and tofu toastie", "Hot slices of bread filled with gruyere and marinaded tofu", 197),
                new Dish("Blueberry and hazelnut muffins", "Rich muffins made with fresh blueberry and hazelnut", 185),
                new Dish("Celeriac and aubergine wontons", "Thin wonton cases stuffed with fresh celeriac and fried aubergine", 185),
                new Dish("Veal and spinach parcels\n", "Thin filo pastry cases stuffed with veal and fresh spinach", 147),
                new Dish("Pumpkin and blueberry buns", "Crumbly buns made with spiced pumpkin and fresh blueberry", 194)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, deserts);

        desertsList.setAdapter(dishesAdapter);
    }
}