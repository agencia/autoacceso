package DAO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import Datos.Bean;
import java.util.ArrayList;

/**
 *
 * @author Garrison
 */
public interface OperacionesDAO {

    ArrayList select();
    int insert(Bean bean);
    boolean delete(int id);
    boolean update(Bean bean);
    int[] find();
    int [] findConfirm(String id, String pass);
    int regresar();

}
