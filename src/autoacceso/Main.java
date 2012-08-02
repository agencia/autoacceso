/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

import DAO.AlumnoDAO;
import DAO.VisitaDAO;
import datos.Usuario;
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
        
        //Llamada a usuario
        Usuario llamadaUsuario = new Usuario();
        
        //Llamada a registro
        Visita llamadaVisita = new Visita(0, 0, 0, "", 0, 0, 0, "", 0, "2012-01-01 09:30:00", "");
        
        //Inserción de registro y obtención de ID
        id = llamadaDAOV.insert(llamadaVisita, llamadaUsuario);
        
        //Muestra último registro añadido (fecha y hora)
        llamadaDAOV.reliableShowLastAdded(id);
        
        //Esta es una alternativa a consulta del último registro añadido, no tan confiable
        //llamadaDAOV.showLastAdded();
    }
}
