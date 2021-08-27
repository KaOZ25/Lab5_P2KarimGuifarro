/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Karim Ozael
 */
public class Alumno extends Persona{
    private int num_cuenta,cant_clases,año;
    private ArrayList <Evaluacion> prueba=new ArrayList();
    public Alumno() {
    }

    public Alumno(String Usuario, String Contraseña, String Nombre, String Apellido,int num_cuenta, int cant_clases, int año) {
        super(Usuario, Contraseña, Nombre, Apellido);
        this.num_cuenta = num_cuenta;
        this.cant_clases = cant_clases;
        this.año = año;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getCant_clases() {
        return cant_clases;
    }

    public void setCant_clases(int cant_clases) {
        this.cant_clases = cant_clases;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public ArrayList<Evaluacion> getPrueba() {
        return prueba;
    }

    public void setPrueba(ArrayList<Evaluacion> prueba) {
        this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "Alumno{" + "num_cuenta=" + num_cuenta + ", cant_clases=" + cant_clases + ", a\u00f1o=" + año + ", prueba=" + prueba + '}';
    }
    
}
