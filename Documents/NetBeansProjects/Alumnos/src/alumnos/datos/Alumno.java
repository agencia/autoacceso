/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos.datos;

/**
 *
 * @author Manuel
 */
public class Alumno extends Persona{
    private Carrera carrera = new Carrera();
    private String matricula;
    
    public Alumno(){
        
    }
    
    public Alumno(String matricula, Carrera carrera){
        this.carrera = carrera;
        this.matricula = matricula;
        setMatricula(matricula);
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    /**
     * @return the carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
}
