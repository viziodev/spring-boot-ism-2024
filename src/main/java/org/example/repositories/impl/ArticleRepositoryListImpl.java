package org.example.repositories.impl;

import org.example.entities.Article;
import org.example.repositories.ArticleRepository;

import java.util.List;

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
