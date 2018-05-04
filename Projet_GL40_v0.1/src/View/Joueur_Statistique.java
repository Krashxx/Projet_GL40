package View;

import javax.swing.JPanel;

public class Joueur_Statistique extends JPanel{
	
	private int id;
	
	public Joueur_Statistique(int id)
	{
		this.id=id;
		
		
		BtnRetour btnRetour =new BtnRetour("Joueur_Acceuil", id);
		this.add(btnRetour);
	}

}
