package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.entities.Article;
import org.example.entities.Commande;
import org.example.repositories.ArticleRepository;
import org.example.repositories.CommandeRepository;
import org.example.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("serviceCmde")
@RequiredArgsConstructor
public class CommandeServiceImpl implements CommandeService {


    @Autowired
    @Qualifier("repoList")
    private     ArticleRepository articleRepository;
    private final  CommandeRepository commandeRepository;


    @Override
    public List<Article> listeArticle() {
       return articleRepository.getArticleList();
    }

    @Override
    public List<Commande> listeCommande() {
        return commandeRepository.getAllCommandes();
    }


}
