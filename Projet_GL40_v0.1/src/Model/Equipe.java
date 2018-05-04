package Model;
import java.util.ArrayList;

public class Equipe {

	private ArrayList<Joueur> joueurs;
	private Entraineur entraineur;
	
	public Equipe()
	{
		this.setJoueurs(new ArrayList<Joueur>());
	}
	
	public Equipe(ArrayList<Joueur> equipe, Entraineur entraineur)
	{
		this.setEntraineur(entraineur);
		this.setJoueurs(equipe);
	}
	
	public void ajouterJoueurEquipe(Joueur joueur)
	{
		this.joueurs.add(joueur);
	}

	public Entraineur getEntraineur() {
		return entraineur;
	}

	public void setEntraineur(Entraineur entraineur) {
		this.entraineur = entraineur;
	}

	public ArrayList<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(ArrayList<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	
}
