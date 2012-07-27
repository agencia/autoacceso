/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datos.Bean;
import datos.MotivoEntrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samsung
 */
public class MotivoEntradaDao implements OperacionesDAO {

    @Override
    public ArrayList select() {
        
        ArrayList hola=new ArrayList();
        
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps=null;
        ResultSet rs = null;
        try {
            ps=conexion.prepareStatement(SQL.consultamotivos);
            rs = ps.executeQuery();
            while(rs.next()){
               //hola[1]=motivo.setMotivo(rs.getString("MotivoEntrada"));
                hola.add(rs.getString("MotivoEntrada"));
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(MotivoEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hola;
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
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
