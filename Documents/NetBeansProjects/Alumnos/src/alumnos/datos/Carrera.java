/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos.datos;

/**
 *
 * @author Manuel
 */
public class Carrera {
    private String clave;
    private String nombreCarrera;
    
    public Carrera(){
        
    }
    
    public Carrera(String clave, String nombreCarrera){
        this.clave = clave;
        this.nombreCarrera = nombreCarrera;
        setClave(clave);
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @return the nombreCarrera
     */
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave.toUpperCase();
    }

    /**
     * @param nombreCarrera the nombreCarrera to set
     */
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera.toUpperCase();
    }
    
}
