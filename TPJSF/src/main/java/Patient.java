
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
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

    }
    public Patient(){}

    private Date actualDate = new Date();

    public Date getActualDate() {
        return actualDate;
    }

    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
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
/*public void validPatient() {
    }*/
/*
    public void pushPatient(
            String cin,
            String nom, 
            String prenom, 
            String dateNaissance, 
            String lieu,
            String gsm,
            String premierRDV, 
            String genre, 
            Date dateActuel) {
        try {
            System.out.println("Connecting to a selected database...");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
            Statement st = conn.createStatement();
            String sql = "CREATE TABLE patient "
                    + "(cin VARCHAR(255), "
                    + " nom VARCHAR(255), "
                    + " dateNaissance VARCHAR(255), "
                    + " lieu VARCHAR(255), "
                    + " genre VARCHAR(255), " 
                    + " gsm VARCHAR(255), "
                    + " rdv VARCHAR(255), "
                    + " dateRdv VARCHAR(255), "
                    + " prenom VARCHAR(255))";
            st.executeUpdate(sql);
            st.executeUpdate("insert into patient values('" + cin + "','" + nom + "','" + prenom + "','" + dateNaissance + "','" + lieu + "','" + gsm + "','" + premierRDV + "','" + genre + "','" + dateActuel + "')");

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException ex) {
            
        }
    */
}
