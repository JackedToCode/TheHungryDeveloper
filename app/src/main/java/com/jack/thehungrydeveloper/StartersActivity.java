package com.jack.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        //Dish dish1 = new Dish("Sausage and spinach dumplings", "Thin pastry cases stuffed with Cumberland sausage and baby spinach", 80.5);

        //No need to give it an individual name when in a Dish array
        Dish[] dishes = {
                new Dish("Sausage and spinach dumplings", "Thin pastry cases stuffed with Cumberland sausage and baby spinach", 80.5),
                new Dish("Squash and gochu jang salad", "A crunchy salad featuring pattypan squash and gochu jang", 100),
                new Dish("Anise and sweetcorn korma", "Mild korma made with fresh anise and creamed sweetcorn", 38),
                new Dish("Treacle and milk chocolate biscuits", "Crunchy biscuits made with black treacle and milk chocolate", 65),
                new Dish("Potato and zabaglione salad", "A crisp salad featuring new potato and zabaglione", 76),
                new Dish("Haroset and marzipan cake", "Moist cake made with haroset and marzipan", 76),
                new Dish("Stilton and lobster penne", "Fresh egg tubular pasta in a sauce made from stilton and fresh lobster", 87),
                new Dish("Squash and scallop parcels", "Thin filo pastry cases stuffed with butternut squash and scallop", 84),
                new Dish("Jerusalem artichoke and beef stir fry", "Crunchy stir fry featuring fresh jerusalem artichoke and beef", 94),
                new Dish("Avocado and cumin seed salad", "A crisp salad featuring fresh avocado and cumin seeds", 62)
        };

        //Takes in String array - ArrayAdapter
        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter((dishAdapter));
    }
}