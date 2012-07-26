/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

/**
 *
 * @author Jose Daniel Noriega
 */
public class SQL {
   public static String insertarAlumno = "insert into alumnos(Matricula, Nombre, ApellidoP, ApellidoM, FechaNac, Telefono, IdCarrera) values (?,?,?,?,?,?,?)";
   public static String insertarCarrera = "insert into carrera(clave, NomCarrera) values(?,?)";
   public static String findCarrera="select * from carrera where IdCarrera=?";
   public static String getIdCarreraByClave="select IdCarrera from Carrera where Clave = ?";
}