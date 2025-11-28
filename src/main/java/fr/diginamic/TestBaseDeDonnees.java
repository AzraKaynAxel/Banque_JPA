package fr.diginamic;

import fr.diginamic.entites.Adresse;
import fr.diginamic.entites.Banque;
import fr.diginamic.entites.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestBaseDeDonnees {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Config1");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
    }
}
