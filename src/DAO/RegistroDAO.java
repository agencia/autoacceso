/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DATOS.Bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Al3x
 */
public class RegistroDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
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
    public int[] find() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        int [] op;
        op = new int [3];
        
        int lab = 102;
        Connection conexion = DAOFactory.getConexion();
        
        try{
            ps = conexion.prepareStatement(SQL.getDentro);
            ps.setInt(1, lab);
            rs = ps.executeQuery();
            rs.next();
            op[1] = rs.getInt("empleados");
            op[0] = rs.getInt("alumnos");
            op[2] = rs.getInt("visitantes");
           
        }
        catch(SQLException ex)
                {
                 Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);   
                }
        
        return op;
    }

    @Override
    public int findConfirm(String id, String pass) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
