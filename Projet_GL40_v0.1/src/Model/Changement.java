package Model;

public class Changement {
	private Joueur joueurEntre;
	private Joueur joueurSorti;
	private int minute;

	public Changement(Joueur entre, Joueur sorti, int minute)
	{
		this.setJoueurEntre(entre);
		this.setJoueurSorti(sorti);
		this.setMinute(minute);
	}

	public Joueur getJoueurEntre() {
		return joueurEntre;
	}

	public void setJoueurEntre(Joueur joueurEntre) {
		this.joueurEntre = joueurEntre;
	}

	public Joueur getJoueurSorti() {
		return joueurSorti;
	}

	public void setJoueurSorti(Joueur joueurSorti) {
		this.joueurSorti = joueurSorti;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	
	
}
