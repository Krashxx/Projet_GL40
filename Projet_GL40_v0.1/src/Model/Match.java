package Model;
import java.util.ArrayList;
import java.util.Date;

public class Match extends Activite{

	private String adversaire;
	private int score;
	private int scoreAdversaire;
	private Composition compoDepart;
	private ArrayList<Changement> changement;
	
	
	
	public Match(Date date, String adversaire) {
		super(date);
		this.setAdversaire(adversaire);
		this.changement=new ArrayList<Changement>();
	}
	
	public Match(Date date , String adversaire,int score, int scoreAdversaire) {
		super(date);
		this.setAdversaire(adversaire);
		this.setScore(score);
		this.setScoreAdversaire(scoreAdversaire);
		this.changement=new ArrayList<Changement>();
		
	}
	
	public Match(Date date,String adversaire, Composition compoDepart) {
		super(date);
		this.setAdversaire(adversaire);
		this.setCompoDepart(compoDepart);
		this.changement=new ArrayList<Changement>();
	}

	public String getAdversaire() {
		return adversaire;
	}

	public void setAdversaire(String adversaire) {
		this.adversaire = adversaire;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScoreAdversaire() {
		return scoreAdversaire;
	}

	public void setScoreAdversaire(int scoreAdversaire) {
		this.scoreAdversaire = scoreAdversaire;
	}

	public Composition getCompoDepart() {
		return compoDepart;
	}

	public void setCompoDepart(Composition compoDepart) {
		this.compoDepart = compoDepart;
	}
	
	public void nouveauChangement(Joueur joueurEntre,Joueur joueurSorti,int minute)
	{
		this.changement.add(new Changement(joueurEntre,joueurSorti,minute));
	}

}
