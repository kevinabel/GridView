package com.example.silver.listviewpersonalizada;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    GridView grilla;
    ImageAdapter adapterGrilla;

    String tabla[] = {"A","B","C",
            "D","E","F"};

    //int[] imagen = {R.drawable.emum,android.R.drawable.alert_dark_frame};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grilla = (GridView) findViewById(R.id.gridView);

        adapterGrilla = new ImageAdapter(this);

        grilla.setAdapter(adapterGrilla);

        grilla.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
}