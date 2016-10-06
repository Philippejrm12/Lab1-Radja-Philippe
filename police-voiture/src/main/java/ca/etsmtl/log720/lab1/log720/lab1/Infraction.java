package main.java.ca.etsmtl.log720.lab1.log720.lab1;

public class Infraction {
    private int id;
    private String description;
    private int niveau;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String toString() {
        return "Id : " + getId() + "\n" +  "Description : " + getDescription() + "\n" + "Niveau : " + getNiveau();
    }
}
