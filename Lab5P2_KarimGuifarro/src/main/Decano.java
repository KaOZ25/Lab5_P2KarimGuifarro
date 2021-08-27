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
public class Decano extends Persona{
    private String maestria;

    public Decano() {
    }

    public Decano(String Usuario, String Contraseña, String Nombre, String Apellido, String Id, String Titulacion, int edad,String maestria) {
        super(Usuario, Contraseña, Nombre, Apellido, Id, Titulacion, edad);
        this.maestria = maestria;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    @Override
    public String toString() {
        return "Decano{" + "maestria=" + maestria + '}';
    }
    
}
