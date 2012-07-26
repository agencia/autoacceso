/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

import DAO.DAOFactory;
import DAO.OperacionesDAO;
import autoacceso.Alumno;
import autoacceso.Bean;
import autoacceso.Persona;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Daniel Noriega
 */
public class AlumnoDAO implements OperacionesDAO {

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
        
//        Persona amm = (Persona) bean;
        PreparedStatement sop=null;
        Connection conexion1 = DAOFactory.getConexion();
        int x;
        CarreraDao nuevo = new CarreraDao();
        x=nuevo.getIdCarreraByClave(null);
        Alumno amm =(Alumno) bean;
        try {
          
           sop=(PreparedStatement) conexion1.prepareStatement(SQL.insertarAlumno);
           sop.setString(1, amm.getMatricula());
           sop.setString(2, amm.getNombre());
           sop.setString(3, amm.getApellidoP());
           sop.setString(4, amm.getApellidoM());
           sop.setString(5, amm.getNumero());
           sop.setString(6, amm.getFecha());
           sop.setInt(7, nuevo.getIdCarreraByClave(amm.getObjeto().getClave()));
           sop.executeUpdate();
         
        } catch (SQLException ex) {
            Logger.getLogger(CarreraDao.class.getName()).log(Level.SEVERE, null, ex);
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
