/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Datos.Bean;
import Datos.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel
 */
public class PersonalDAO implements OperacionesDAO{

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
    public Bean find(int id) {
        Personal personal = new Personal();
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conexion.prepareStatement(SQL.findEmpleado);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            personal.setNoEmpleado(rs.getString("NoEmpleado"));
            personal.setNombre(rs.getString("Nombre"));
            personal.setApPaterno(rs.getString("ApPaterno"));
            personal.setApMaterno(rs.getString("ApMaterno"));
            personal.setPuesto(rs.getString("Puesto"));
        } catch (SQLException ex) {
            Logger.getLogger(PersonalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Bean) personal;
    }
    
}
