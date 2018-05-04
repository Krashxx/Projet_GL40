package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Model.Main;

public class Entraineur_Acceuil extends MesPannel{
	
	private int id;
	

	
	public Entraineur_Acceuil(int id)
	{
		super(id,"EntraineurAcceuil_");
		JButton btnCompo =creationBtnCompo();
		JButton btnJoueur =creationBtnJoueur();

		JButton btnPlanning=creationBtnPlanning();
		JButton btnInfo=creationBtnInfo();
		
		this.add(btnCompo);
		this.add(btnJoueur);
		this.add(btnPlanning);
		this.add(btnInfo);
		this.add(new BtnDeconnexion());
	}
	
	private JButton creationBtnCompo()
	{
		JButton btn= new JButton(new ImageIcon(getSrcImage()+getSrcBouton()+getSrcPage()+"Compo.jpg"));
		btn.setText("Mes compositions");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		return btn;
	}
	
	private JButton creationBtnJoueur()
	{
		JButton btn= new JButton(new ImageIcon(getSrcImage()+getSrcBouton()+getSrcPage()+"Joueur.jpg"));
		btn.setText("Mes joueurs");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
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
				
			}
		});
		return btn;
	}
	

	private JButton creationBtnInfo()
	{
		JButton btn= new JButton(new ImageIcon(getSrcImage()+getSrcBouton()+getSrcPage()+"Info.png"));
		btn.setText("Mes Info");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		return btn;
	}
}
