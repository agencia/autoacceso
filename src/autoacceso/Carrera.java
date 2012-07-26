/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

import autoacceso.Bean;

/**
 *
 * @author Jose Daniel Noriega
 */
public class Carrera implements Bean {
    private String Clave;
    private String NombreCarrera;

    /**
     * @return the Clave
     */
    public String getClave() {
        return Clave;
    }

    /**
     * @param Clave the Clave to set
     */
    public void setClave(String Clave) {
        this.Clave = Clave.toUpperCase();
    }

    /**
     * @return the NombreCarrera
     */
    public String getNombreCarrera() {
        return NombreCarrera;
    }

    /**
     * @param NombreCarrera the NombreCarrera to set
     */
    public void setNombreCarrera(String NombreCarrera) {
        this.NombreCarrera = NombreCarrera;
    }
}
