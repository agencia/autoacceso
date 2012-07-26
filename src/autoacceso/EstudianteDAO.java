/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

import DAO.DAOFactory;
import DAO.OperacionesDAO;
import autoacceso.Alumno;
import autoacceso.Bean;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Daniel Noriega
 */
public class EstudianteDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
        
        Alumno yo = (Alumno) bean;
        PreparedStatement tu=null;
        Connection conexion2 = (Connection) DAOFactory.getConexion();
        try {
          
           tu=(PreparedStatement) conexion2.prepareStatement(SQL.insertarAlumno);
           tu.setString(1, yo.getMatricula());
           
           tu.executeUpdate();
         
        } catch (SQLException ex) {
            Logger.getLogger(CarreraDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
