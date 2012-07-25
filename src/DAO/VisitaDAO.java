/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import autoacceso.Alumno;
import autoacceso.Bean;
import autoacceso.Visita;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Memoeslink
 */
public class VisitaDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        int a = 0;
        Scanner scantool = new Scanner(System.in);
        System.out.println("ID de alumno: ");
        try
        {
            a = Integer.parseInt(scantool.nextLine());
        }
        catch(NumberFormatException error)
        {
            System.out.println("\n Error: " + error.getMessage());
            a = 0;
        }

        ArrayList mi_lista = new ArrayList();
        Visita visitaCall = new Visita();
        Connection conexion = DAOFactory.getConexion();

        try {
            Statement llamada = (Statement) conexion.createStatement();
            ResultSet query = llamada.executeQuery(SQL.findRegistro.concat(a + "'"));
            while(query.next())
            {
                System.out.println("Motivo de entrada: " + query.getString("idMotivoEntrada"));
                mi_lista.add(new Visita(query.getInt("IdRegistro"), query.getInt("IdMotivoEntrada"), query.getInt("IdMotivoSalida"), query.getString("MotivoSalida"), query.getInt("IdEmpleado"), query.getInt("IdAlumno"), query.getInt("IdVisitante"), query.getString("Aula"), query.getInt("IdClase"), query.getString("FechaHoraEntrada"), query.getString("FechaHoraSalida")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
        return mi_lista;
    }

    @Override
    public int insert(Bean bean) {
        Visita visita =  (Visita) bean;
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement(SQL.insertarRegistro);
            ps.setInt(1, visita.getIdRegistro());
            ps.setInt(2, visita.getIdMotivoEntrada());
            ps.setInt(3, visita.getIdMotivoSalida());
            ps.setString(4, visita.getMotivoSalida());
            ps.setInt(5, visita.getIdEmpleado());
            ps.setInt(6, visita.getIdAlumno());
            ps.setInt(7, visita.getIdVisitante());
            ps.setString(8, visita.getAula());
            ps.setInt(9, visita.getIdClase());
            ps.setString(10, visita.getFechaHoraEntrada());
            ps.setString(11, visita.getFechaHoraSalida());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VisitaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
