package org.example;


import org.example.services.CommandeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext("org.example.repositories","org.example.services");
        CommandeService service=( CommandeService ) context.getBean("serviceCmde");
        service.listeCommande();
        service.listeArticle();

    }
}
