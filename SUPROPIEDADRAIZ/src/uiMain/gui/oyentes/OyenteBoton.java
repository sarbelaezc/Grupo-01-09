package uiMain.gui.oyentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OyenteBoton implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		
		if(e.getSource() instanceof JButton){
			
			if("Salir".equals(actionCommand)){
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "¡Saliendo!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
				
				if(resp == 0){
					System.exit(0);
				}else if(resp == 1){
					
				}
			}
		}
	}
}
