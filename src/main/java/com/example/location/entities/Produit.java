package com.example.location.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nomProduit;
    private double prixProduit;

    public Produit() {
        super();
    }
    public Produit(String nomProduit, double prixProduit) {
        super();
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomProduit() {
        return nomProduit;
    }
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
    public double getPrixProduit() {
        return prixProduit;
    }
    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }
    public String toString() {
        return "Produit [idProduit=" + id + ", nomProduit=" +
                nomProduit + ", prixProduit=" + prixProduit +"]";
    }

}
