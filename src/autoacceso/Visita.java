/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

/**
 *
 * @author Memoeslink
 */
public class Visita {
    private int idRegistro;
    private int idMotivoEntrada;
    private int idMotivoSalida;
    private String motivoSalida;
    private int idEmpleado;
    private int idAlumno;
    private int idVisitante;
    private String aula;
    private int idClase;
    private String fechaHoraEntrada;
    private String fechaHoraSalida;

    /**
     * @return the idRegistro
     */
    public int getIdRegistro() {
        return idRegistro;
    }

    /**
     * @param idRegistro the idRegistro to set
     */
    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
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

    /**
     * @return the idMotivoSalida
     */
    public int getIdMotivoSalida() {
        return idMotivoSalida;
    }

    /**
     * @param idMotivoSalida the idMotivoSalida to set
     */
    public void setIdMotivoSalida(int idMotivoSalida) {
        this.idMotivoSalida = idMotivoSalida;
    }

    /**
     * @return the motivoSalida
     */
    public String getMotivoSalida() {
        return motivoSalida;
    }

    /**
     * @param motivoSalida the motivoSalida to set
     */
    public void setMotivoSalida(String motivoSalida) {
        this.motivoSalida = motivoSalida;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

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
     * @return the idVisitante
     */
    public int getIdVisitante() {
        return idVisitante;
    }

    /**
     * @param idVisitante the idVisitante to set
     */
    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    /**
     * @return the idClase
     */
    public int getIdClase() {
        return idClase;
    }

    /**
     * @param idClase the idClase to set
     */
    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    /**
     * @return the fechaHoraEntrada
     */
    public String getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    /**
     * @param fechaHoraEntrada the fechaHoraEntrada to set
     */
    public void setFechaHoraEntrada(String fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    /**
     * @return the fechaHoraSalida
     */
    public String getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    /**
     * @param fechaHoraSalida the fechaHoraSalida to set
     */
    public void setFechaHoraSalida(String fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    
        /**
     * @return the aula
     */
    public String getAula() {
        return aula;
    }

    /**
     * @param aula the aula to set
     */
    public void setAula(String aula) {
        this.aula = aula;
    }
    
    public Visita(int idRegistro, int idMotivoEntrada, int idMotivoSalida, String motivoSalida, int idEmpleado, int idAlumno, int idVisitante, String aula, int idClase, String fechaHoraEntrada, String fechaHoraSalida)
    {
        this.idRegistro = idRegistro;
        this.idMotivoEntrada = idMotivoEntrada;
        this.idMotivoSalida = idMotivoSalida;
        this.motivoSalida = motivoSalida;
        this.idEmpleado = idEmpleado;
        this.idAlumno = idAlumno;
        this.idVisitante = idVisitante;
        this.aula = aula;
        this.idClase = idClase;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida = fechaHoraSalida;
    }
    
    public Visita()
    {
        this.idRegistro = 0;
        this.idMotivoEntrada = 0;
        this.idMotivoSalida = 0;
        this.motivoSalida = "";
        this.idEmpleado = 0;
        this.idAlumno = 0;
        this.idVisitante = 0;
        this.aula = "";
        this.idClase = 0;
        this.fechaHoraEntrada = "";
        this.fechaHoraSalida = "";
    }
}
