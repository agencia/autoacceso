/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datos.Bean;
import java.util.ArrayList;

/**
 *
 * @author Samsung
 */
public interface OperacionesDAO {
    
    ArrayList select();
    int insert(Bean bean);
    boolean delete(int id);
    boolean update(Bean bean);
    Bean find(int id);
    
}
