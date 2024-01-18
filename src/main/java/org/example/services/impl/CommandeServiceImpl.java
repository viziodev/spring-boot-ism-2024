package org.example.services.impl;

import lombok.Setter;
import org.example.entities.Article;
import org.example.entities.Commande;
import org.example.repositories.ArticleRepository;
import org.example.repositories.CommandeRepository;
import org.example.services.CommandeService;

import java.util.List;

public class CommandeServiceImpl implements CommandeService {
    private final  ArticleRepository articleRepository;
    @Setter
    private  CommandeRepository commandeRepository;

    public CommandeServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> listeArticle() {
       return articleRepository.getArticleList();
    }

    @Override
    public List<Commande> listeCommande() {
        return commandeRepository.getAllCommandes();
    }


}
