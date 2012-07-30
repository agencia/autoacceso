/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Datos.Alumno;
import Datos.Bean;
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
public class AlumnoDAO implements OperacionesDAO{

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
        Alumno alumno = new Alumno();
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conexion.prepareStatement(SQL.findAlumno);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            alumno.setMatricula(rs.getString("Matricula"));
            alumno.setNombreAlumno(rs.getString("NombreAlumno"));
            alumno.setApPaterno(rs.getString("ApPaterno"));
            alumno.setApMaterno(rs.getString("ApMaterno"));
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Bean) alumno;
    }    
}
