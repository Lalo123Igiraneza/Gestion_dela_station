
package gestionstation;

public class Produits {
  
    private int id;
    private String nom;
    private int quantite;
    private String date;

    public Produits(int id, String nom, int quantite, String date) {
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
        this.date = date;
    }

    public Produits(String nom, int quantite, String date) {
        this.nom = nom;
        this.quantite = quantite;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDate(String date) {
        this.date = date;
    }
   
  
}
