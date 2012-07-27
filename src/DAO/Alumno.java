/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import autoacceso.Carrera;
import autoacceso.Persona;
import autoacceso.Persona;

/**
 *
 * @author Jose Daniel Noriega
 */
public class Alumno extends Persona {
    private Carrera Objeto = new Carrera();
    private String Matricula;

    /**
     * @return the Matricula
     */
    public String getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula.toUpperCase();
    }

    /**
     * @return the Objeto
     */
    public Carrera getObjeto() {
        return Objeto;
    }

    /**
     * @param Objeto the Objeto to set
     */
    public void setObjeto(Carrera Objeto) {
        this.Objeto = Objeto;
    }
}
