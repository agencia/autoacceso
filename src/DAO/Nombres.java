/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import autoacceso.Bean;
import autoacceso.Motivos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Daniel Noriega
 */
public class Nombres implements OperacionesDAO{

    @Override
    public ArrayList select() {
                ArrayList adios=new ArrayList();
        
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps=null;
        ResultSet rs = null;
        try {
            ps=conexion.prepareStatement(SQL.NombreAlumno);
            
            rs = ps.executeQuery();
            while(rs.next()){
               //hola[1]=motivo.setMotivo(rs.getString("MotivoEntrada"));
                adios.add(rs.getString("NombreAlumno"));
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(Motivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adios;
//        throw new UnsupportedOperationException("Not supported yet.");
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
