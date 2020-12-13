import java.io.Serializable;


public class Patient implements Serializable {
	String cin ; 
	String nom ; 
	String prenom ; 
	String DateNaissance ; 
	String lieu ; 
	String gsm ; 
	String premierRDV  ;
	String  genre  ;
	public Patient(String cin, String nom, String prenom, String dateNaissance, String lieu, String gsm,
			String premierRDV, String genre) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		DateNaissance = dateNaissance;
		this.lieu = lieu;
		this.gsm = gsm;
		this.premierRDV = premierRDV;
		this.genre = genre;
	} 
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getPremierRDV() {
		return premierRDV;
	}
	public void setPremierRDV(String premierRDV) {
		this.premierRDV = premierRDV;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
		
	
	
}
