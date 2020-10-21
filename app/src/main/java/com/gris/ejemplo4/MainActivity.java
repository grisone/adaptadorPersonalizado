package com.gris.ejemplo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.gris.ejemplo4.adapters.ContactoAdapter;
import com.gris.ejemplo4.modelos.Contacto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener{


    ListView lvContactos;
    List<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    lvContactos = findViewById(R.id.lvContactos);
    contactos=new ArrayList<>();

    Contacto contacto = new Contacto();
    contacto.setNombre("Felipe");
    contacto.setApellido_p("Pinto");
    contacto.setApellido_m("Sanchez");
    contacto.setTelefono("+56993203881");

     Contacto contacto2 = new Contacto();
     contacto2.setNombre("Christian");
     contacto2.setApellido_p("Pinto");
     contacto2.setApellido_m("exavier");
     contacto2.setTelefono("+56993203881");

        contactos.add(contacto);
        contactos.add(contacto2);

       // ArrayAdapter<Contacto> adapter = new ArrayAdapter<Contacto>(this,android.R.layout.simple_list_item_1, contactos);
        ArrayAdapter<Contacto> adapter = new ContactoAdapter(this, R.layout.item_contacto,contactos);
        lvContactos.setAdapter(adapter);
        lvContactos.setOnItemClickListener(this);
        boolean miDato = false;
        recibirDatos(miDato);
    }


    private void recibirDatos(boolean dato){

    }
@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
    Context contexto = getApplicationContext();
        Toast.makeText(contexto, "Contacto position :"+position, Toast.LENGTH_SHORT).show();
    Contacto contacto =  contactos.get(position);
    String nombre =contacto.getNombre();

    Intent intent = new Intent( this,activity_detalle_contacto.class  );
    intent.putExtra("nombre", nombre);
    startActivity(intent);

    }


}