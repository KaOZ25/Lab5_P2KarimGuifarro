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
public class Docente extends Persona{
    private String meastria,clase,descripcion_clas;
    private int alum_max;

    public Docente(String Usuario, String Contraseña, String Nombre, String Apellido, String Titulacion,String meastria, String clase, String descripcion_clas, int alum_max) {
        super(Usuario, Contraseña, Nombre, Apellido, Titulacion);
        this.meastria = meastria;
        this.clase = clase;
        this.descripcion_clas = descripcion_clas;
        this.alum_max = alum_max;
    }

    public Docente() {
    }

    public String getMeastria() {
        return meastria;
    }

    public void setMeastria(String meastria) {
        this.meastria = meastria;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDescripcion_clas() {
        return descripcion_clas;
    }

    public void setDescripcion_clas(String descripcion_clas) {
        this.descripcion_clas = descripcion_clas;
    }

    public int getAlum_max() {
        return alum_max;
    }

    public void setAlum_max(int alum_max) {
        this.alum_max = alum_max;
    }

    @Override
    public String toString() {
        return "Docente{" + "meastria=" + meastria + ", clase=" + clase + ", descripcion_clas=" + descripcion_clas + ", alum_max=" + alum_max + '}';
    }
    
}
