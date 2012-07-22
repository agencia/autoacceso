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
    public static String insertarAlumno = "INSERT INTO alumnos (Matricula, Nombre, Parterno, Materno, Telefono, Fecha, idcarrera) VALUES (?,?,?,?,?,?,?);";
    public static String insertarCarrera = "INSERT INTO carrera (clave, carrera) VALUES (?,?);";
    public static String findCarrera = "SELECT * FROM carrera WHERE idcarrera = '?';";
    public static String getIdcarreraByMatricula ="SELECT * FROM carrera WHERE clave like ?";
}
