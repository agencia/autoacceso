/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

import DAO.AlumnoDAO;
import DAO.VisitaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author byde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //By Saúl Rodríguez Requenes and Guillermo Almaguer
        int id = 0;
        JOptionPane.showMessageDialog(null, "La entrada ha sido guardada.");
        VisitaDAO llamadaDAOV = new VisitaDAO();
        Visita llamadaVisita = new Visita(1, 1, 1, "", 0, 1, 0, "408", 1, "2012-01-01 09:30:00", "2000-01-01 00:00:00");
        //AlumnoDAO llamadaDAOA = new AlumnoDAO();
        //Alumno llamadaAlumno = new Alumno();
        //llamadaDAOA.insert(llamadaAlumno);
        id = llamadaDAOV.insert(llamadaVisita);
        
        //Muestra último registro añadido
        llamadaDAOV.reliableShowLastAdded(id);
        
        //Esta es una alternativa a consulta del último registro añadido, no tan confiable
        //llamadaDAOV.showLastAdded();
    }
}
