package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Model.Main;

public class BtnRetour extends JButton{
	
	private String pageRetour;
	private int id;
	
	public BtnRetour(String pageRetour,int id)
	{
		this.setPageRetour(pageRetour);
		this.setId(id);
		modelisationBtnRetour();
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPageRetour() {
		return pageRetour;
	}

	public void setPageRetour(String pageRetour) {
		this.pageRetour = pageRetour;
	}
	
	private void modelisationBtnRetour()
	{
		this.setText("Retour");
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(pageRetour)
				{
				case "Acceuil":
					Main.f.passage_Acceuil();
					break;
				case "Entraineur_Acceuil":
					Main.f.passage_Entraineur_Acceuil(id);
					break;
				case "Joueur_Acceuil":
					Main.f.passage_Joueur_Acceuil(id);
					break;
				
				}
				
			}
		});
	}

}
