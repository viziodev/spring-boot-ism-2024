package org.example.repositories;

import org.example.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository  {
 List<Article> getArticleList();
 Article getArticleById(Long  id);

}
