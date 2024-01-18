package org.example.repositories;

import org.example.entities.Article;

import java.util.List;

public interface ArticleRepository {
 List<Article> getArticleList();
 Article getArticleById(Long  id);

}
