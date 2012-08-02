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
    public static String insertarAlumno = "INSERT INTO Alumnos(Matricula, NombreAlumno, ApPaterno, ApMaterno, IdCarrera) VALUES(?, ?, ?, ?, ?)";
    public static String insertarRegistroE = "INSERT INTO Registro(IdMotivoEntrada, IdMotivoSalida, MotivoSalida, IdEmpleado, IdAlumno, IdVisitante, Aula, IdClase, FechaHoraEntrada, FechaHoraSalida) VALUES(?, null, null, ?, null, null, ?, null, NOW(), null)";
    public static String insertarRegistroA = "INSERT INTO Registro(IdMotivoEntrada, IdMotivoSalida, MotivoSalida, IdEmpleado, IdAlumno, IdVisitante, Aula, IdClase, FechaHoraEntrada, FechaHoraSalida) VALUES(?, null, null, null, ?, null, ?, null, NOW(), null)";
    public static String insertarRegistroV = "INSERT INTO Registro(IdMotivoEntrada, IdMotivoSalida, MotivoSalida, IdEmpleado, IdAlumno, IdVisitante, Aula, IdClase, FechaHoraEntrada, FechaHoraSalida) VALUES(?, null, null, null, null, ?, ?, null, NOW(), null)";
    public static String findAlumno = "SELECT * FROM Alumnos WHERE Matricula = '";
    public static String findRegistro = "SELECT *, DATE_FORMAT(FechaHoraEntrada, '%d/%m/%Y %r') as Fecha FROM Registro WHERE IdRegistro = '";
    public static String showRegistro = "SELECT * FROM Registro";
}
