/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author VAERON
 */
public class Visitante implements Bean {
    private String nombre;
    private String procedencia;
    
    public Visitante(String nombre,String procedencia){
        this.nombre = nombre;
        this.procedencia = procedencia;
    }

    public Visitante(){
        this.nombre = "";
        this.procedencia = "";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the procedencia
     */
    public String getProcedencia() {
        return procedencia;
    }

    /**
     * @param procedencia the procedencia to set
     */
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
}
