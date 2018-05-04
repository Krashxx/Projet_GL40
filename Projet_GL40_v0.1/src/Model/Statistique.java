package Model;

public class Statistique {
	private TypeStatistique type;
	private int valeur;
	private Activite activite; //Match ou entrainement relatif à cette stat
	private Joueur joueur;//Joueur relatif à cette stat
	
	public Statistique(Joueur joueur, Activite act, TypeStatistique type, int valeur)
	{
		
	}

	public TypeStatistique getType() {
		return type;
	}

	public void setType(TypeStatistique type) {
		this.type = type;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	

}
