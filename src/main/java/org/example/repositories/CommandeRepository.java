package org.example.repositories;

import org.example.entities.Article;
import org.example.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommandeRepository  {
    public List<Commande> getAllCommandes();
}
