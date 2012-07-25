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
}
