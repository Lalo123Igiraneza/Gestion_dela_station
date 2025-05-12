
package gestionstation;

public class Factures {
   private int id;
   private String nom;
    private String produit;
    private int prix;
    private int quantite;
    private String date;
  private  String nomProduit;
  private int quantiteARetirer;

    public Factures(int id, String nom, String produit,  int quantite,int prix, String date) {
        this.id = id;
        this.nom = nom;
        this.produit = produit;
       this.quantite = quantite;
         this.prix = prix;
        this.date = date;
    }

    public Factures(String nomProduit, int quantiteARetirer) {
        this.nomProduit = nomProduit;
        this.quantiteARetirer = quantiteARetirer;
    }

    public Factures(String nom, String produit,  int quantite,int prix, String date) {
        this.nom = nom;
        this.produit = produit;
       this.quantite = quantite;
         this.prix = prix;
        this.date = date;
    }

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

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public int getQuantiteARetirer() {
        return quantiteARetirer;
    }

    public void setQuantiteARetirer(int quantiteARetirer) {
        this.quantiteARetirer = quantiteARetirer;
    }
    
}
