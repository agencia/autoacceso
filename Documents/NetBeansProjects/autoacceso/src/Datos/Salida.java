/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Manuel
 */
public class Salida implements Bean{
    private String nombreAlumno;
    private String apPaternoA;
    private String apMaternoA;
    private String matricula;
    private String nombreVisitante;
    private String procedencia;
    private String nombreEmpleado;
    private String noEmpleado;
    private String apPaternoE;
    private String apMaternoE;
    private String puesto;
    private String motivoVisita;
    private String fechaHoraEntrada;
    private String fechaHoraSalida;
    private String tipoUsuario;
    
    public Salida (){
        this.nombreAlumno = "";
        this.apPaternoA = "";
        this.apMaternoA = "";
        this.matricula = "";
        this.nombreVisitante = "";
        this.procedencia = "";
        this.nombreEmpleado = "";
        this.noEmpleado = "";
        this.apPaternoE = "";
        this.apMaternoE = "";
        this.puesto = "";
        this.motivoVisita = "";
        this.fechaHoraEntrada = "";
        this.fechaHoraSalida = "";
        this.tipoUsuario = "";
    }
    
    public Salida (String nombreAlumno, String apPaternoA, String apMaternoA, String matricula, String nombreVisitante, String procedencia, String nombreEmpleado,
            String noEmpleado, String apPaternoE, String apMaternoE, String puesto, String motivoVisita, String fechaHoraEntrada, String fechaHoraSalida,
            String tipoUsuario){
        this.nombreAlumno = nombreAlumno;
        this.apPaternoA = apPaternoA;
        this.apMaternoA = apMaternoA;
        this.matricula = matricula;
        this.nombreVisitante = nombreVisitante;
        this.procedencia = procedencia;
        this.nombreEmpleado = nombreEmpleado;
        this.noEmpleado = noEmpleado;
        this.apPaternoE = apPaternoE;
        this.apMaternoE = apMaternoE;
        this.puesto = puesto;
        this.motivoVisita = motivoVisita;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida = fechaHoraSalida;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the nombreAlumno
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * @param nombreAlumno the nombreAlumno to set
     */
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    /**
     * @return the apPaternoA
     */
    public String getApPaternoA() {
        return apPaternoA;
    }

    /**
     * @param apPaternoA the apPaternoA to set
     */
    public void setApPaternoA(String apPaternoA) {
        this.apPaternoA = apPaternoA;
    }
    /**
     * @return the apMaternoA
     */
    public String getApMaternoA() {
        return apMaternoA;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @return the nombreVisitante
     */
    public String getNombreVisitante() {
        return nombreVisitante;
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

    /**
     * @return the nombreEmpleado
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * @return the noEmpleado
     */
    public String getNoEmpleado() {
        return noEmpleado;
    }

    /**
     * @return the apPaternoE
     */
    public String getApPaternoE() {
        return apPaternoE;
    }

    /**
     * @return the apMaternoE
     */
    public String getApMaternoE() {
        return apMaternoE;
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
     * @return the motivoVisita
     */
    public String getMotivoVisita() {
        return motivoVisita;
    }

    /**
     * @param motivoVisita the motivoVisita to set
     */
    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
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
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
