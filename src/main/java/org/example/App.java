package org.example;

import org.example.repositories.ArticleRepository;
import org.example.services.CommandeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
      //  ArticleRepository articleRepository=( ArticleRepository ) context.getBean("repoArticle");
       // articleRepository.getArticleList();

        CommandeService commandeService=( CommandeService ) context.getBean("serviceCmd");
        commandeService.listeArticle();
        commandeService.listeCommande();
    }
}
