package View;
import javax.swing.JFrame;

public class Fenetre extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomAppli;
	
	public Fenetre()
	{
		this.nomAppli="Appli Sport";
		super.setTitle(nomAppli + " - Acceuil");
		super.setSize(1500, 1000);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		this.setContentPane(new Acceuil(0));
		
		super.setVisible(true);
	}
	
	public void passage_Acceuil()
	{
		this.setContentPane(new Acceuil(0));

		super.setTitle(nomAppli + " - Acceuil");
		this.revalidate();
	}

	
	public void passage_Connexion(boolean entraineur)
	{
		this.setContentPane(new Connexion(entraineur));
		super.setTitle(nomAppli + " - Connexion");
		this.revalidate();

	}
	
	public void passage_Joueur_Acceuil(int id)
	{
		this.setContentPane(new Joueur_Acceuil(id));
		super.setTitle(nomAppli + " - Page Joueur");
		this.revalidate();

	}
	
	public void passage_Entraineur_Acceuil(int id)
	{
		this.setContentPane(new Entraineur_Acceuil(id));
		super.setTitle(nomAppli + " - Page Entraineur");
		this.revalidate();

	}
	
	public void passage_Joueur_Statistique(int id)
	{
		this.setContentPane(new Joueur_Statistique(id));
		super.setTitle(nomAppli + " - Mes Statistiques");
		this.revalidate();

	}

	public void passage_Joueur_Planning(int id)
	{
		this.setContentPane(new Joueur_Planning(id));
		super.setTitle(nomAppli + " - Planning");
		this.revalidate();
	}

}
