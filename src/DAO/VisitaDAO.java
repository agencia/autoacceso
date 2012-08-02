/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import autoacceso.Alumno;
import autoacceso.Bean;
import autoacceso.Visita;
import com.mysql.jdbc.Statement;
import datos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        Connection conexion = DAOFactory.getConexion();

        try {
            Statement llamada = (Statement) conexion.createStatement();
            ResultSet query = llamada.executeQuery(SQL.findRegistro.concat(a + "'"));
            while(query.next())
            {
                mi_lista.add(new Visita(query.getInt("IdRegistro"), query.getInt("IdMotivoEntrada"), query.getInt("IdMotivoSalida"), query.getString("MotivoSalida"), query.getInt("IdEmpleado"), query.getInt("IdAlumno"), query.getInt("IdVisitante"), query.getString("Aula"), query.getInt("IdClase"), query.getString("FechaHoraEntrada"), query.getString("FechaHoraSalida")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
        return mi_lista;
    }
    
    public boolean reliableShowLastAdded(int idx) {
        Connection conexion = DAOFactory.getConexion();
        try {
            Statement llamada = (Statement) conexion.createStatement();
            ResultSet query = llamada.executeQuery(SQL.findRegistro.concat(idx + "'"));
            while(query.next())
            {
                String date = "", time = "";
                String add = query.getString("Fecha");

                for(int z = 0; z<add.length() - 2; z++)
                {
                    if(z>=0&&z<=10)
                        date = date.concat(Character.toString(add.charAt(z)));
                    else
                        time = time.concat(Character.toString(add.charAt(z)));
                }
                JOptionPane.showMessageDialog(null, "Adelante, ya puede pasar.\nFecha de acceso: " + date + "\nHora de acceso: " + time);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return true;
    }
    
    public boolean showLastAdded() {
        boolean hecho = false;
        int contar = 0;
        Connection conexion = DAOFactory.getConexion();
        
        try {
            Statement llamada = (Statement) conexion.createStatement();
            ResultSet count = llamada.executeQuery(SQL.showRegistro);
            while(count.next())
            {
                if(count.getInt("IdRegistro")>contar)
                    contar = count.getInt("IdRegistro");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        try {
            Statement llamada2 = (Statement) conexion.createStatement();
            ResultSet query = llamada2.executeQuery(SQL.findRegistro.concat(contar + "'"));
            while(query.next())
            {
                String date = "", time = "";
                String add = query.getString("FechaHoraEntrada");

                for(int z = 0; z<add.length() - 2; z++)
                {
                    if(z>=0&&z<=10)
                        date = date.concat(Character.toString(add.charAt(z)));
                    else
                        time = time.concat(Character.toString(add.charAt(z)));
                }
                JOptionPane.showMessageDialog(null, "Adelante, ya puede pasar.\nFecha de acceso: " + date + "\nHora de acceso: " + time);
            }
            hecho = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return hecho;
    }

    public int insert(Bean bean, Usuario usuario) {
        Visita visita = (Visita) bean;
        int id = 0;
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        try {
            switch(usuario.getTipo())
            {
                case 1:
                    ps = conexion.prepareStatement(SQL.insertarRegistroE, Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, visita.getIdMotivoEntrada());
                    ps.setInt(2, usuario.getId());
                    ps.setString(3, visita.getAula());
                    break;
                case 2:
                    ps = conexion.prepareStatement(SQL.insertarRegistroA, Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, visita.getIdMotivoEntrada());
                    ps.setInt(2, usuario.getId());
                    ps.setString(3, visita.getAula());
                    break;
                case 3:
                    ps = conexion.prepareStatement(SQL.insertarRegistroV, Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, visita.getIdMotivoEntrada());
                    ps.setInt(2, usuario.getId());
                    ps.setString(3, visita.getAula());
                    break;
                default: ; break;
            }
            
            int done = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys(); 
            while(rs.next()){ 
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VisitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
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

    @Override
    public int insert(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
