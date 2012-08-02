/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import autoacceso.Alumno;
import autoacceso.Bean;
import com.mysql.jdbc.Statement;
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
public class AlumnoDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        String b = "";
        Scanner scantool = new Scanner(System.in);
        System.out.println("Matrícula de alumno: ");
        b = scantool.nextLine();
        
        ArrayList mi_lista = new ArrayList();
        Alumno alumnoCall = new Alumno();
        Connection conexion = DAOFactory.getConexion();

        try {
            Statement llamada = (Statement) conexion.createStatement();
            ResultSet query = llamada.executeQuery(SQL.findAlumno.concat(b + "'"));
            while(query.next())
            {
                System.out.println("Nombre: " + query.getString("Nombre") + " " + query.getString("ApPaterno") + " " + query.getString("ApMaterno"));
                mi_lista.add(new Alumno(query.getInt("IdAlumno"), query.getString("Matricula"), query.getString("Nombre"), query.getString("ApPaterno"), query.getString("ApMaterno"), query.getInt("IdCarrera"), 1));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
        return mi_lista;
    }

    @Override
    public int insert(Bean bean) {
        Alumno alumno = (Alumno) bean;
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement data = null;
        try {
            data = (PreparedStatement) conexion.prepareCall(SQL.insertarAlumno);
            data.setString(1, alumno.getMatricula());
            data.setString(2, alumno.getNombre());
            data.setString(3, alumno.getApe_pat());
            data.setString(4, alumno.getApe_mat());
            data.setInt(5, alumno.getIdCarrera());
            data.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
