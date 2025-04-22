package com.example.location.service;

import com.example.location.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduitById(Long id);
    List<Produit> getAllProduits();
}
