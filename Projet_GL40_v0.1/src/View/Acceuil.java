package View;
import java.awt.event.ActionEvent;
import Model.Main;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;



public class Acceuil extends MesPannel{
	private String srcImage="Images/";
	private String srcBtn="Bouton/";
	private String src_Acceuil="Acceuil_";
	
	public Acceuil(int id)
	{
		super(id,"Acceuil_");
		JButton btnEntraineur = creationBtnEntraineur();
		JButton btnJoueur= creationBtnJoueur();
		JButton btnEquipe=creationBtnEquipe();
		
		this.add(btnEntraineur);
		this.add(btnJoueur);
		this.add(btnEquipe);
	}



	private JButton creationBtnJoueur()
	{
		JButton btn= new JButton(new ImageIcon(srcImage+srcBtn+src_Acceuil+"Joueur.jpg"));
		btn.setText("Joueur");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.f.passage_Connexion(false);
				
			}
		});
		return btn;
	}
	
	private JButton creationBtnEntraineur()
	{
		JButton btn= new JButton(new ImageIcon(srcImage+srcBtn+src_Acceuil+"Entraineur.jpg"));
		btn.setText("Entraineur");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.f.passage_Connexion(true);
				
			}
		});
		return btn;
	}
	
	
	private JButton creationBtnEquipe()
	{
		JButton btn= new JButton(new ImageIcon(getSrcImage()+getSrcBouton()+getSrcPage()+"Equipe.jpg"));
		btn.setText("Liste des equipes");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		return btn;
	}
	
}
