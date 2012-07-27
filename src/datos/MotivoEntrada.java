/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Samsung
 */
public class MotivoEntrada  implements Bean{
    
    private String motivo;
    private int tipo=1;
    
    public void MotivoEntrada(){
        
    }
    
    public void MotivoEntrada(String motivo, int tipo){
        this.setMotivo(motivo);
        this.setTipo(tipo);
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
