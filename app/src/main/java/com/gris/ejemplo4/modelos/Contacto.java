package com.gris.ejemplo4.modelos;

import androidx.annotation.NonNull;

public class Contacto {
   private String  Nombre;
   private String  Apellido_p;
   private String  Apellido_m;
   private String  Telefono;
   private String  Foto;


   public String getNombre() {
      return Nombre;
   }

   public void setNombre(String nombre) {
      Nombre = nombre;
   }

   public String getApellido_p() {
      return Apellido_p;
   }

   public void setApellido_p(String apellido_p) {
      Apellido_p = apellido_p;
   }

   public String getApellido_m() {
      return Apellido_m;
   }

   public void setApellido_m(String apellido_m) {
      Apellido_m = apellido_m;
   }

   public String getTelefono() {
      return Telefono;
   }

   public void setTelefono(String telefono) {
      Telefono = telefono;
   }
   public String getFoto() {
      return Foto;
   }

   public void setFoto(String foto) {
      Foto = foto;
   }


   @Override
   public String toString() {
      return Nombre + " " + Apellido_p +
              " " + Apellido_m  ;
   }
}
