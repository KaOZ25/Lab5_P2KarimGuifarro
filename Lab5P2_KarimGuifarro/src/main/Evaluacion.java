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
public class Evaluacion {
    private String trab_equip,cooperacion,participacion,nota;
    private int ev_gen;

    public Evaluacion() {
    }

    public Evaluacion(String trab_equip, String cooperacion, String participacion, String nota, int ev_gen) {
        this.trab_equip = trab_equip;
        this.cooperacion = cooperacion;
        this.participacion = participacion;
        this.nota = nota;
        this.ev_gen = ev_gen;
    }
    

    public String getTrab_equip() {
        return trab_equip;
    }

    public void setTrab_equip(String trab_equip) {
        this.trab_equip = trab_equip;
    }

    public String getCooperacion() {
        return cooperacion;
    }

    public void setCooperacion(String cooperacion) {
        this.cooperacion = cooperacion;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getEv_gen() {
        return ev_gen;
    }

    public void setEv_gen(int ev_gen) {
        this.ev_gen = ev_gen;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "trab_equip=" + trab_equip + ", cooperacion=" + cooperacion + ", participacion=" + participacion + ", nota=" + nota + ", ev_gen=" + ev_gen + '}';
    }
    
}
