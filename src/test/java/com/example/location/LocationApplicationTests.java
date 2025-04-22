package com.example.location;

import com.example.location.entities.Produit;
import com.example.location.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LocationApplicationTests {
    @Autowired
    private ProduitRepository ProduitRepository;
    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("Lenovo",2780.50);
        ProduitRepository.save(prod);
    }
    @Test
    public void testFindProduit()
    {
        Produit p = ProduitRepository.findById(1L).get();
        System.out.println(p);
    }
    @Test
    public void testUpdateProduit()
    {
        Produit p = ProduitRepository.findById(1L).get();
        p.setPrixProduit(1000.0);
        ProduitRepository.save(p);
    }
    @Test
    public void testDeleteProduit()
    {
        ProduitRepository.deleteById(1L);;
    }
    @Test
    public void testListerTousProduits()
    {
        List<Produit> prods = ProduitRepository.findAll();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }
}
