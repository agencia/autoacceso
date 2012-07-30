/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

import Datos.Bean;
import Datos.Visitante;
import dao.VisitanteDAO;
import javax.swing.JOptionPane;
import vistas.VisitanteView;


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
        
        VisitanteView dialog = new VisitanteView(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        
        VisitanteDAO visitanteDAO = new VisitanteDAO();
        Visitante visitante = dialog.getVisitante();
        visitanteDAO.insert(visitante);
    }
}
