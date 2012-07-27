/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Manuel
 */
public class Personal implements Bean{
    private String noEmpleado;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String puesto;
    
    public Personal(String noEmpleado, String nombre, String apPaterno,String apMaterno, String puesto){
        this.noEmpleado = noEmpleado;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.puesto = puesto;
    }
    
    public Personal(){
        this.noEmpleado = "";
        this.nombre = "";
        this.apPaterno = "";
        this.apMaterno = "";
        this.puesto = "";
    }

    /**
     * @return the noEmpleado
     */
    public String getNoEmpleado() {
        return noEmpleado;
    }

    /**
     * @param noEmpleado the noEmpleado to set
     */
    public void setNoEmpleado(String noEmpleado) {
        this.noEmpleado = noEmpleado;
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
     * @return the apPaterno
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * @param apPaterno the apPaterno to set
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the apMaterno
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * @param apMaterno the apMaterno to set
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    
}
