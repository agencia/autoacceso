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
    public static String insertarRegistro = "INSERT INTO Registro(IdRegistro, IdMotivoEntrada, IdMotivoSalida, MotivoSalida, IdEmpleado, IdAlumno, IdVisitante, Aula, IdClase, FechaHoraEntrada, FechaHoraSalida) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static String findAlumno = "SELECT * FROM Alumnos WHERE Matricula = '";
    public static String findRegistro = "SELECT * FROM Registro WHERE IdRegistro = '";
}
