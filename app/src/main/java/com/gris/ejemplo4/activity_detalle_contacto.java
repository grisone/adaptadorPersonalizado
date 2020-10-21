package com.gris.ejemplo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class activity_detalle_contacto extends AppCompatActivity {

    TextView tvNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvNombre = findViewById(R.id.tvNombre);

        Intent intent =  getIntent();
        String nombre = intent.getStringExtra("nombre");

        tvNombre.setText(nombre);

        //Log.i("DetalleContacto","Nombre recibido:"+nombre);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id =item.getItemId();
        switch (id){
            case android.R.id.home:
                // onBackPressed();
                //return true;
                finish();
        }
        return  super.onOptionsItemSelected(item);
        // super.onOptionsItemSelected(item);
    }

}