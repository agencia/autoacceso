/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import autoacceso.Bean;
import autoacceso.Motivos;
import autoacceso.Persona;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Daniel Noriega
 */
public class SalidasDAO implements OperacionesDAO {

    @Override
    public ArrayList select() {
        ArrayList motivos=null;
        return motivos;
        
        
    }

    @Override
    public int insert(Bean bean) {
        
        Persona amm = (Persona) bean;
        PreparedStatement sop=null;
        Connection conexion1 = DAOFactory.getConexion();
        int x;
//        CarreraDao nuevo = new CarreraDao();
//        x=nuevo.getIdCarreraByClave(null);
        Motivos omm =(Motivos) bean;
        try {
          
//           sop=(PreparedStatement) conexion1.prepareStatement(SQL.insertarAlumno);
           sop.setString(1, omm.getMotivo());
           sop.executeUpdate();
         
        } catch (SQLException ex) {
//            Logger.getLogger(CarreraDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
//        throw new UnsupportedOperationException("Not supported yet.");
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
