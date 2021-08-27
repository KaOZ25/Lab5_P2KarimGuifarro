/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Karim Ozael
 */
public class Persona {
    private String Usuario,Contraseña,Nombre,Apellido,Id,Titulacion;
    private int edad;

    public Persona() {
    }

    public Persona(String Usuario, String Contraseña, String Nombre, String Apellido) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public Persona(String Usuario, String Contraseña, String Nombre, String Apellido, String Id, String Titulacion, int edad) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Id = Id;
        this.Titulacion = Titulacion;
        this.edad = edad;
    }

    public Persona(String Usuario, String Contraseña, String Nombre, String Apellido, String Titulacion) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Titulacion = Titulacion;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
