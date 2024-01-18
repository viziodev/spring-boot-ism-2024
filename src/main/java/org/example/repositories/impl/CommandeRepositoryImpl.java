package org.example.repositories.impl;

import org.example.entities.Commande;
import org.example.repositories.CommandeRepository;

import java.util.List;

public class CommandeRepositoryImpl implements CommandeRepository {
    @Override
    public List<Commande> getAllCommandes() {
        System.out.println("getAllCommandes");
        return null;
    }
}
