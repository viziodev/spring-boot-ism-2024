package org.example.services;

import org.example.entities.Article;
import org.example.entities.Commande;

import java.util.List;

public interface CommandeService {
    List<Article> listeArticle();
    List<Commande> listeCommande();
}
