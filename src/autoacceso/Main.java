/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autoacceso;

import Vistas.MotivoSalida;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author byde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vistas.BotonMotivo x = new Vistas.BotonMotivo();
        x.setVisible(true);
        MotivoSalida ventana = new MotivoSalida();
        
        
        Alumno Pepe=new Alumno();
        Carrera car=new Carrera();
        Pepe.setNombre("José");
        Pepe.setApellidoP("Noriega");
        Pepe.setApellidoM("Moreno");
        Pepe.setMatricula("UP100757");
        Pepe.setFecha("28/02/1992");
        Pepe.setNumero("4492228997");
        car.setClave("ISEI");
        car.setNombreCarrera("Ingeniería en Sistemas");
        Pepe.setObjeto(car);
        EstudianteDAO estudiantedao=new EstudianteDAO();
        CarreraDao carreraDAO =new CarreraDao();
        AlumnoDAO alumnodao=new AlumnoDAO();
        Persona datos=new Persona();
        carreraDAO.insert(car);
//        estudiantedao.insert(estudiante);
        alumnodao.insert(Pepe);
    }
}
