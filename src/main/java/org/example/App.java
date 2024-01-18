package org.example;


import org.example.config.PersistenceConfig;
import org.example.services.CommandeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("org.example");
        appContext.refresh();
        CommandeService service=( CommandeService ) appContext.getBean("serviceCmde");
        EntityManagerFactory emf = appContext.getBean(EntityManagerFactory.class);
        EntityManager em = emf.createEntityManager();
        service.listeCommande();
        service.listeArticle();

    }
}
