/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import alumnos.datos.Alumno;
import alumnos.datos.Carrera;
import alumnos.datos.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Manuel ","Rodríguez ","Vázquez ","04/05/92 ","9-94-21-02 ");
        Carrera carrera = new Carrera("isei ","Ingeniería en Sistemas Estratégicos de la Información ");
        Alumno alumno = new Alumno("up100649 ",carrera);
        
        JOptionPane.showMessageDialog(null, persona.getNombre() + persona.getAppPaterno() + persona.getAppMaterno() + alumno.getMatricula() + carrera.getClave());
        
        
        
    }
}
