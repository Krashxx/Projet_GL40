package Model;
import java.util.ArrayList;
import java.util.Date;

public class Joueur extends Personne{


	private Poste poste;

	private ArrayList<Statistique> stat;

	
	public Joueur(String prenom, String nom, Date dateNaissance, String tel, String mail, int numVoie, String nomVoie,
			int CP, String Ville) {
		super(prenom, nom, dateNaissance, tel, mail, numVoie, nomVoie, CP, Ville);
		this.stat=new ArrayList<>();
	}
	
	public Joueur(String prenom, String nom, Date dateNaissance, String tel, String mail, int numVoie, String nomVoie,
			int CP, String Ville,Poste poste) {
		super(prenom, nom, dateNaissance, tel, mail, numVoie, nomVoie, CP, Ville);
		this.setPoste(poste);
		this.stat=new ArrayList<>();
	}
	
	public Joueur(Entraineur entraineur)
	{
		super((Personne) entraineur);
		this.stat=new ArrayList<>();
	}
	

	private void creerStat(Activite activite,TypeStatistique type, int valeur)
	{
		this.stat.add(new Statistique(this, activite , type, valeur))	;
	}



	public Poste getPoste() {
		return poste;
	}


	public void setPoste(Poste poste) {
		this.poste = poste;
	}


	public ArrayList<Statistique> getStat() {
		return stat;
	}


	public void setStat(ArrayList<Statistique> stat) {
		this.stat = stat;
	}
}
