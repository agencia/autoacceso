/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Datos.Bean;
import Datos.Salida;
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
public class SalidaDAO implements OperacionesDAO{

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
        Salida salida = new Salida();
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            if(salida.getTipoUsuario() == "alumno"){
            ps = conexion.prepareStatement(SQL.findMotivoAlumno);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            salida.setMotivoVisita(rs.getString("MotivoEntrada"));
            salida.setFechaHoraEntrada("FechaHoraEntrada");
            salida.setFechaHoraSalida("FechaHoraSalida");
        }
            else if(salida.getTipoUsuario() == "visitante"){
                ps = conexion.prepareStatement(SQL.findMotivoVisitante);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                rs.next();
                salida.setMotivoVisita(rs.getString("MotivoEntrada"));
                salida.setFechaHoraEntrada("FechaHoraEntrada");
                salida.setFechaHoraSalida("FechaHoraSalida");
            }
            else if(salida.getTipoUsuario() == "personal"){
                ps = conexion.prepareStatement(SQL.findMotivoEmpleado);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                rs.next();
                salida.setMotivoVisita(rs.getString("MotivoEntrada"));
                salida.setFechaHoraEntrada("FechaHoraEntrada");
                salida.setFechaHoraSalida("FechaHoraSalida");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Bean) salida;
    }
    
}
