package main.java.ca.etsmtl.log720.lab1.log720.lab1;

public class Dossier {

    private int id;
    private String nom;
    private String prenom;
    private String noPermis;
    private String noPlaque;
    private int niveau;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNoPermis() {
        return noPermis;
    }

    public void setNoPermis(String noPermis) {
        this.noPermis = noPermis;
    }

    public String getNoPlaque() {
        return noPlaque;
    }

    public void setNoPlaque(String noPlaque) {
        this.noPlaque = noPlaque;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String toString() {
        return "Id : " + getId() + "\n" +  "Nom : " + getNom() + "\n" + "Prenom : " + getPrenom() +
                "No permis : " + getNoPermis() + "\n" +  "No Plaque : " + getNoPlaque() + "\n" + "Niveau : " + getNiveau();
    }

}
