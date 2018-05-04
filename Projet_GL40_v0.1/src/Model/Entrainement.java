package Model;
import java.util.Date;

public class Entrainement extends Activite {
	

	private String ContenuEntrainement;
	
	public Entrainement(Date date) {
		super(date);
		// TODO Auto-generated constructor stub
	}
	public Entrainement(Date date, String contenu) {
		super(date);
		this.setContenuEntrainement(contenu);
	}
	public String getContenuEntrainement() {
		return ContenuEntrainement;
	}
	public void setContenuEntrainement(String contenuEntrainement) {
		ContenuEntrainement = contenuEntrainement;
	}

}
