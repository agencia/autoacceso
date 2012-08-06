/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Al3x
 */
public class SQL {

    public static String getDentro = "SELECT count(idEmpleado) as empleados, COUNT(idAlumno) as alumnos, COUNT(idVisitante) as visitantes FROM `registro` WHERE FechaHoraSalida IS NULL AND Aula = ?";
    public static String getLogin = "(SELECT* , '1' AS`tipo` FROM`alumnos` WHERE contrasena = MD5(?) AND`Matricula`= ?)UNION (SELECT* , '2' AS`tipo` FROM`personal` WHERE contrasena = MD5(?) AND`Matricula`= ?)";
    
}
