
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

@Named("Patient")
@ApplicationScoped
@FacesConfig(version = FacesConfig.Version.JSF_2_3)

public class Patient implements Serializable {

    String cin;
    String nom;
    String prenom;
    String dateNaissance;
    String lieu;
    String gsm;
    String premierRDV;
    String genre;
    Date sysdate;

    public Date getSysdate() {
        return sysdate;
    }

    public void setSysdate(Date sysdate) {
        this.sysdate = new Date();
    }
    public Patient(String cin, String nom, String prenom, String dateNaissance, String lieu, String gsm,
            String premierRDV, String genre) {
        super();
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieu = lieu;
        this.gsm = gsm;
        this.premierRDV = premierRDV;
        this.genre = genre;
        this.sysdate=sysdate;

    }

    private Patient() {
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
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
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

    @PostConstruct
    public void init() {
        Patient p = new Patient();
    }
}
