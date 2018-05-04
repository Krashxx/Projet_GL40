package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Model.Main;

public class Joueur_Acceuil extends MesPannel{
	

	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Joueur_Acceuil(int id)
	{
		super(id,"JoueurAcceuil_");
		JButton btnStat=creationBtnStat();
		JButton btnPlanning=creationBtnPlanning();
		JButton btnInfo= creationBtnInfo();
		JButton btnEquipe=creationBtnEquipe();
		
		this.add(btnStat);
		this.add(btnPlanning);
		this.add(btnEquipe);
		this.add(btnInfo);
		
		this.add(new BtnDeconnexion());
	}
	
	
	private JButton creationBtnStat()
	{
		JButton btn= new JButton(new ImageIcon(getSrcImage()+getSrcBouton()+getSrcPage()+"Statistique.png"));
		btn.setText("Mes statistiques");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.f.passage_Joueur_Statistique(getId());
				
			}
		});
		return btn;
	}
	
	private JButton creationBtnPlanning()
	{
		JButton btn= new JButton(new ImageIcon(getSrcImage()+getSrcBouton()+getSrcPage()+"Planning.jpg"));
		btn.setText("Mon planning");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.f.passage_Joueur_Planning(getId());
				
			}
		});
		return btn;
	}
	
	private JButton creationBtnInfo()
	{
		JButton btn= new JButton(new ImageIcon(getSrcImage()+getSrcBouton()+getSrcPage()+"Info.png"));
		btn.setText("Mes infos");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		return btn;
	}

	
	private JButton creationBtnEquipe()
	{
		JButton btn= new JButton(new ImageIcon(getSrcImage()+getSrcBouton()+getSrcPage()+"Equipe.jpg"));
		btn.setText("Mon equipe");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		return btn;
	}
}
