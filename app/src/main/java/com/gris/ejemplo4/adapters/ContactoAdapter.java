package com.gris.ejemplo4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gris.ejemplo4.R;
import com.gris.ejemplo4.modelos.Contacto;

import java.nio.file.attribute.FileTime;
import java.util.List;

public class ContactoAdapter extends ArrayAdapter<Contacto> {
    Context context;
    List<Contacto> objects;

    public ContactoAdapter(@NonNull Context context, int resource, @NonNull List<Contacto> objects) {
        super(context, resource, objects);

        this.context= context;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Contacto contacto = objects.get(position);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_contacto, null);
        TextView tvNombre = view.findViewById(R.id.tvNombre);
        TextView tvApellido = view.findViewById(R.id.tvApellidos);


        String nombre=contacto.getNombre();
        String apellidos=contacto.getApellido_p()+' '+contacto.getApellido_m();

        tvNombre.setText(nombre);
        tvApellido.setText(apellidos);
        return view;
    }
}
