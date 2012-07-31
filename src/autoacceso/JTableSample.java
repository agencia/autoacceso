/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Memoeslink
 */
public class JTableSample extends JFrame{
    private Container contenedor;
    private JPanel panel;
    private JScrollPane scroll;
    private JTable tabla;
    private JButton boton;
    private TableColumn columna;
    private String nombresColumnas[] = {"ID", "Nombre", "Empresa"};
    private String matriz[][] = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}}; 
            
    public JTableSample()
    {
        contenedor = getContentPane();
        panel = new JPanel();
        tabla = new JTable(getMatriz(), getNombresColumnas());
        scroll = new JScrollPane(getTabla());
        panel.add(scroll);
        contenedor.add(panel);
        setVisible(true);
        setLocation(300, 400);
        setSize(600, 500);
    }

    /**
     * @return the contenedor
     */
    public Container getContenedor() {
        return contenedor;
    }

    /**
     * @param contenedor the contenedor to set
     */
    public void setContenedor(Container contenedor) {
        this.contenedor = contenedor;
    }

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * @return the scroll
     */
    public JScrollPane getScroll() {
        return scroll;
    }

    /**
     * @param scroll the scroll to set
     */
    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    /**
     * @return the tabla
     */
    public JTable getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    /**
     * @return the columna
     */
    public TableColumn getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(TableColumn columna) {
        this.columna = columna;
    }

    /**
     * @return the nombresColumnas
     */
    public String[] getNombresColumnas() {
        return nombresColumnas;
    }

    /**
     * @param nombresColumnas the nombresColumnas to set
     */
    public void setNombresColumnas(String[] nombresColumnas) {
        this.nombresColumnas = nombresColumnas;
    }

    /**
     * @return the matriz
     */
    public String[][] getMatriz() {
        return matriz;
    }

    /**
     * @param matriz the matriz to set
     */
    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }
}
