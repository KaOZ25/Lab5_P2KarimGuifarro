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
public class CEO extends Persona{
    private int años_xp;

    public CEO() {
    }

    public CEO(String Usuario, String Contraseña, String Nombre, String Apellido, String Id, String Titulacion, int edad,int años_xp) {
        super(Usuario, Contraseña, Nombre, Apellido, Id, Titulacion, edad);
        this.años_xp = años_xp;
    }

    public int getAños_xp() {
        return años_xp;
    }

    public void setAños_xp(int años_xp) {
        this.años_xp = años_xp;
    }
    
}
