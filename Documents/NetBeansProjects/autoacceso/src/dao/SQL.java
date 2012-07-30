/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Pussy
 */
public class SQL {
    public static String insertarVisitante     = "INSERT INTO visitantes (NombreVisitante, Procedencia) VALUES (?,?)";
    public static String findVisitante         = "SELECT NombreVisitante, Procedencia FROM visitantes WHERE IdVisitante = ?";
    public static String findAlumno            = "SELECT Matricula, NombreAlumno, ApPaterno, ApMaterno FROM alumnos WHERE IdAlumno = ?";
    public static String findEmpleado          = "SELECT NoEmpleado, Nombre, ApPaterno, ApMaterno, Puesto FROM personal WHERE IdEmpleado = ?";
    public static String findMotivoAlumno      = "SELECT MotivoEntrada, FechaHoraEntrada, FechaHoraSalida FROM motivosentrada, registro WHERE"
                                               + "registro.IdMotivoEntrada = motivosentrada.IdMotivoEntrada and IdAlumno = ?";
    public static String findMotivoEmpleado    = "SELECT MotivoEntrada, FechaHoraEntrada, FechaHoraSalida FROM motivosentrada, registro WHERE"
                                               + "registro.IdMotivoEntrada = motivosentrada.IdMotivoEntrada and IdEmpleado = ?";
    public static String findMotivoVisitante   = "SELECT MotivoEntrada, FechaHoraEntrada, FechaHoraSalida FROM motivosentrada, registro WHERE"
                                               + "registro.IdMotivoEntrada = motivosentrada.IdMotivoEntrada and IdVisitante = ?";
}
