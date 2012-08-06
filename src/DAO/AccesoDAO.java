/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Datos.Bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Al3x
 */
public class AccesoDAO implements OperacionesDAO{

    public AccesoDAO() {
//        throw new UnsupportedOperationException("Not yet implemented");
    }

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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int[] findConfirm(String id, String pass) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = DAOFactory.getConexion();
        String o;
        int op [] = {0,0};

 
        try{
            ps = conexion.prepareStatement(SQL.getLogin);
            ps.setString(1, pass);
            ps.setString(2, id);
            ps.setString(3, pass);
            ps.setString(4, id);
            rs = ps.executeQuery();
            rs.next();
            op[0] = rs.getInt(1);
            op[1] = Integer.parseInt(rs.getString("tipo"));
        }
        catch(SQLException ex)
                {
                 JOptionPane.showMessageDialog(null, "Contraseña o Usuario erroneos. "+ex);
                }
        
        return op;
    }

    @Override
    public int regresar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
