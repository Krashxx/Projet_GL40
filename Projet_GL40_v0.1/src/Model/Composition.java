package Model;
import java.util.ArrayList;

public class Composition {
	
	private Equipe equipe;
	private TypeComposition typeCompo;
	private ArrayList<Joueur> titulaire;
	private ArrayList<Joueur> remplacant;
	
	public Composition(Equipe equipe)
	{
		this.setEquipe(equipe);
	}
	
	public Composition(Equipe equipe, TypeComposition compo)
	{
		this.setEquipe(equipe);
		this.setTypeCompo(compo);
	}
	
	public Composition(Equipe equipe, TypeComposition compo,ArrayList<Joueur> titulaire,ArrayList<Joueur> remplacant)
	{
		this.setEquipe(equipe);
		this.setTypeCompo(compo);
		this.setTitulaire(titulaire);
		this.setRemplacant(remplacant);
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public TypeComposition getTypeCompo() {
		return typeCompo;
	}

	public void setTypeCompo(TypeComposition typeCompo) {
		this.typeCompo = typeCompo;
	}

	public ArrayList<Joueur> getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(ArrayList<Joueur> titulaire) {
		this.titulaire = titulaire;
	}

	public ArrayList<Joueur> getRemplacant() {
		return remplacant;
	}

	public void setRemplacant(ArrayList<Joueur> remplacant) {
		this.remplacant = remplacant;
	}
	
	
	

}
