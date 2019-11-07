package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int[] images = {
            R.drawable.iconone, R.drawable.iconfive, R.drawable.iconthree};

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final String[] countrynames = getResources().getStringArray(R.array.country_names);


        gridView = (GridView) findViewById(R.id.myGridId);

        CustomAdapter customAdapter = new CustomAdapter(this, images, countrynames);

        gridView.setAdapter(customAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Clicked on "+countrynames[i], Toast.LENGTH_SHORT).show();
            }
        });



    }
}
