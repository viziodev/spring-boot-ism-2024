package org.example.repositories.impl;

import org.example.entities.Article;
import org.example.repositories.ArticleRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("repoList")
public class ArticleRepositoryListImpl implements ArticleRepository {
    @Override
    public List<Article> getArticleList() {
        System.out.println("ArticleRepositoryListImpl for List");
        return null;
    }

    @Override
    public Article getArticleById(Long id) {
        return null;
    }
}
