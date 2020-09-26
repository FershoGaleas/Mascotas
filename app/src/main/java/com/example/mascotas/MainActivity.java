package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Perros> perros = new ArrayList<Perros>();
    Perros perrito;
    RecyclerView recycler;
    ArrayList<String> nombres = new ArrayList<String>();
    ArrayList<String> ranking = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setTitle("Mascotas");

        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));

        perros = new ArrayList<Perros>();
        perros.add(new Perros("Marmaduke"));
        perros.add(new Perros("Scooby-Doo"));
        perros.add(new Perros("Hachiko"));
        perros.add(new Perros("Supercan"));
        perros.add(new Perros("Bock"));


        adapterPerros adapter = new adapterPerros(getApplicationContext(),perros,perrito);
        recycler.setAdapter(adapter);





    }
}