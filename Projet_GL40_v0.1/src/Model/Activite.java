package Model;
import java.util.ArrayList;
import java.util.Date;

public class Activite {
	
	private Date date;
	private ArrayList<Statistique> stat;
	private ArrayList<Joueur> joueurPresent;
	private ArrayList<Integer> noteJoueur;// Il faut que noteJoueur.get(i) soit la note du Joueur joueurPresent.get(i)
	
	public Activite(Date date)
	{
		this.setDate(date);
		this.stat=new ArrayList<Statistique>();
		this.joueurPresent=new ArrayList<Joueur>();
		this.noteJoueur=new ArrayList<Integer>();		
	}
	
	
	private void creerStat(Joueur joueur, TypeStatistique type, int valeur)
	{
		this.stat.add(new Statistique(joueur, this, type, valeur))	;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

}
