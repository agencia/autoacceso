/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Memoeslink
 */
public class SQL {
    public static String insertarAlumno = "INSERT INTO Alumnos(IdAlumno, Matricula, NombreAlumno, ApPaterno, ApMaterno, IdCarrera) VALUES(?, ?, ?, ?, ?, ?)";
    public static String insertarRegistro = "INSERT INTO Registro(IdMotivoEntrada, IdMotivoSalida, MotivoSalida, IdEmpleado, IdAlumno, IdVisitante, Aula, IdClase, FechaHoraEntrada, FechaHoraSalida) VALUES(?, null, null, null, null, null, ?, null, NOW(), null)";
    public static String findAlumno = "SELECT * FROM Alumnos WHERE Matricula = '";
    public static String findRegistro = "SELECT * FROM Registro WHERE IdRegistro = '";
    public static String showRegistro = "SELECT * FROM Registro";
}
