
package DAO;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class MiComboBoxModel extends AbstractListModel implements ComboBoxModel {
 ArrayList lista;
 
  public MiComboBoxModel(){
      lista = (new MotivosSalidaDAO()).select();
//      if(lista)
//      lista.add("No hay datos");
      selection=(String) lista.get(1);
  }
  String selection = " ";

  public Object getElementAt(int index) {
    return lista.get(index);
  }

  public int getSize() {
    return lista.size();
  }

  public void setSelectedItem(Object anItem) {
    selection = (String) anItem; // to select and register an
  } // item from the pull-down list

  // Methods implemented from the interface ComboBoxModel
  public Object getSelectedItem() {
    return selection; // to add the selection to the combo box
  }
}