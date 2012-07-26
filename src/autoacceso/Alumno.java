/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

/**
 *
 * @author Memoeslink
 */
public class Alumno implements Bean{
    private int idAlumno;
    private int idCarrera;
    private String matricula;
    private String nombre;
    private String ape_pat;
    private String ape_mat;

    /**
     * @return the idAlumno
     */
    public int getIdAlumno() {
        return idAlumno;
    }

    /**
     * @param idAlumno the idAlumno to set
     */
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    /**
     * @return the idCarrera
     */
    public int getIdCarrera() {
        return idCarrera;
    }

    /**
     * @param idCarrera the idCarrera to set
     */
    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
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
        this.matricula = matricula;
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
     * @return the ape_pat
     */
    public String getApe_pat() {
        return ape_pat;
    }

    /**
     * @param ape_pat the ape_pat to set
     */
    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }

    /**
     * @return the ape_mat
     */
    public String getApe_mat() {
        return ape_mat;
    }

    /**
     * @param ape_mat the ape_mat to set
     */
    public void setApe_mat(String ape_mat) {
        this.ape_mat = ape_mat;
    }
    
    //Constructor por defecto
    public Alumno()
    {
        this.idAlumno=0;
        this.matricula="";
        this.nombre="";
        this.ape_pat="";
        this.ape_mat="";
        this.idCarrera=0;
    }
    
    public Alumno(int idAlumno, String matricula, String nombre, String ape_pat, String ape_mat, int idCarrera)
    {
        this.idAlumno = idAlumno;
        this.matricula = matricula;
        this.nombre = nombre;
        this.ape_pat = ape_pat;
        this.ape_mat = ape_mat;
        this.idCarrera = idCarrera;
    }
}
