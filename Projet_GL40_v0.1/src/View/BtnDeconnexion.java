package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Model.Main;

public class BtnDeconnexion extends JButton{
	
	public BtnDeconnexion()
	{
		modelisationBtnDeconnexion();
	}
	
	
	private void modelisationBtnDeconnexion()
	{
		this.setText("Deconnexion");
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.f.passage_Acceuil();
				
				
				
			}
		});
	}
	

}
