package DAO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garrison
 */
public class DAOFactory  {

    private static String cadenaConexion = "jdbc:mysql://localhost/";
    private static String baseDeDatos = "upa";
    private static String usuario = "root";
    private static String password = "12345";

    public static Connection getConexion(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conexion = DriverManager.getConnection(cadenaConexion+baseDeDatos,usuario,password);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        

    return conexion;
    }

    public static Connection closeConexion(Connection conexion){
        try {
            if (conexion != null) {
                conexion.close();
                conexion=null;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conexion;
    }

    public static void main(String[] args) {

        Connection con = null;
        DAOFactory daoFactory = new DAOFactory();
        con = daoFactory.getConexion();
        if(con!= null)
            System.out.println("Conexion exitosa");
        else
            System.out.println("Conexion fallida");


         con = daoFactory.closeConexion(con);
         if(con==null){
             System.out.println("Conexion cerrada");
         }
         else
             System.out.println("Conexion sin cerrar");

    }
}
