package Model;
import java.util.Date;

public class Entraineur extends Personne{

	public Entraineur(String prenom, String nom, Date dateNaissance, String tel, String mail, int numVoie,
			String nomVoie, int CP, String Ville) {
		super(prenom, nom, dateNaissance, tel, mail, numVoie, nomVoie, CP, Ville);
	}
	
	public Entraineur(Joueur joueur)
	{
		super((Personne) joueur);
	}
	
	
}
