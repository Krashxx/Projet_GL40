package Model;
import java.util.Date;

public class Personne {
	private String prenom;
	private String nom;
	private Date dateNaissance;
	private String tel;
	private String mail;
	private int numVoie;
	private String nomVoie;
	private int CP;
	private String ville;
	

	private Equipe equipe;
	
	public Personne(String prenom, String nom, Date dateNaissance,String tel, String mail, int numVoie, String nomVoie, int CP, String Ville)
	{
		this.setPrenom(prenom);
		this.setNom(nom);
		this.setDateNaissance(dateNaissance);
		this.setTel(tel);
		this.setMail(mail);
		this.setNumVoie(numVoie);
		this.setNomVoie(nomVoie);
		this.setCP(CP);
		this.setVille(Ville);
	}
	
	public Personne(Personne personne)
	{
		this.setPrenom(personne.getPrenom());
		this.setNom(personne.getNom());
		this.setDateNaissance(personne.getDateNaissance());
		this.setTel(personne.getTel());
		this.setMail(personne.getMail());
		this.setNumVoie(personne.getNumVoie());
		this.setNomVoie(personne.getNomVoie());
		this.setCP(personne.getCP());
		this.setVille(personne.getVille());
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getNumVoie() {
		return numVoie;
	}

	public void setNumVoie(int numVoie) {
		this.numVoie = numVoie;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	public String getAddresse()
	{
		return this.getNumVoie()+" "+this.getNomVoie()+","+this.getCP()+" "+this.getVille();
	}
	

}
