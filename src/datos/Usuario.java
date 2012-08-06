/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author SAMSUNG
 */
public class Usuario {
    
    private String nombre="Siames"; 
    private String clave; 
    private String carrera; 
    private int tipo; 
    private String str_tipo;
    private int id;
    private int idMotivoEntrada;

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
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the str_tipo
     */
    public String getStr_tipo() {
        return str_tipo;
    }

    /**
     * @param str_tipo the str_tipo to set
     */
    public void setStr_tipo(String str_tipo) {
        this.str_tipo = str_tipo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idMotivoEntrada
     */
    public int getIdMotivoEntrada() {
        return idMotivoEntrada;
    }

    /**
     * @param idMotivoEntrada the idMotivoEntrada to set
     */
    public void setIdMotivoEntrada(int idMotivoEntrada) {
        this.idMotivoEntrada = idMotivoEntrada;
    }
    
}
