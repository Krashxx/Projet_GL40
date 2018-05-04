package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Main;

public class Connexion extends JPanel{
	
	private int id;
	
	JTextField identifiant;
	JTextField mdp;
	private boolean entraineur;
	
	
	public Connexion(boolean entraineur)
	{
		this.entraineur=entraineur;
		this.entraineur =false;
		identifiant= new JTextField(20);
		mdp=new JTextField(20);
		
		JButton btnConnexion =new JButton("Me connecter");
		JButton btnInscription = new JButton("M'inscrire");
		BtnRetour btnRetour =new BtnRetour("Acceuil", id);
		
		btnConnexion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int idConnexion=1;//bonIndentifiant(id.getText(),mdp.getText());
				if(idConnexion!=0)
				{
					if(entraineur)
					{
						Main.f.passage_Entraineur_Acceuil(idConnexion);
					}
					else
					{
						Main.f.passage_Joueur_Acceuil(idConnexion);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Mauvais identifiant ou mot de passe", "Erreur d'identification", JOptionPane.INFORMATION_MESSAGE);
				}
					
			}
		});
		this.add(btnRetour);
		this.add(identifiant);
		this.add(mdp);
		this.add(btnConnexion);
		this.add(btnInscription);
	}
	
	
	private int bonIndentifiant(String id,String mdp)
	{
		int idd;
		if(true) //Test si correspond à la BDD de Joueur
		{
			this.entraineur=false;
			idd=1;//A changer par l'id du joueur
			return idd;
		}
		else if(true) // Test si correspond à la BDD de Entraineur
		{
			this.entraineur =true;
			idd=2;//A changer par l'id du joueur
			return idd;
		}
		//else // Correspond à aucune BDD
		{
			return 0;
		}
		
	}
	

}
