package fr.diginamic;

import fr.diginamic.entites.AbstractCompte;
import fr.diginamic.entites.Adresse;
import fr.diginamic.entites.AssuranceVie;
import fr.diginamic.entites.Banque;
import fr.diginamic.entites.Client;
import fr.diginamic.entites.LivretA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class TestBaseDeDonnees {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Config1");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        // Instanciation
        Banque b1 = new Banque("Boursobank");
        Banque b2 = new Banque("Crédit Mutuelle");
        Banque b3 = new Banque("Crédit Mutuel");
        Banque b4 = new Banque("BNP Paribas");

        // Persiste dans la base de données
        em.persist(b1);
        em.persist(b2);
        em.persist(b3);
        em.persist(b4);


        // Instanciation
        Adresse a1 = new Adresse(12, "Rue des Lilas", 75001, "Paris");
        Adresse a2 = new Adresse(28, "Avenue Victor Hugo", 69003, "Lyon");
        Adresse a3 = new Adresse(5, "Boulevard de la République", 33000, "Bordeaux");
        Adresse a4 = new Adresse(42, "Rue du Général Leclerc", 34000, "Montpellier");
        Adresse a5 = new Adresse(17, "Impasse des Myosotis", 44000, "Nantes");
        Adresse a6 = new Adresse(83, "Rue Saint-Michel", 35000, "Rennes");
        Adresse a7 = new Adresse(9, "Rue du Port", 59000, "Lille");
        Adresse a8 = new Adresse(31, "Chemin des Érables", 13008, "Marseille");
        Adresse a9 = new Adresse(66, "Rue de la Liberté", 21000, "Dijon");


        // Instanciation
        AbstractCompte av1 = new AssuranceVie("AV001", 15000.50, LocalDate.of(2030, 6, 1), 1.25);
        AbstractCompte av2 = new AssuranceVie("AV002", 22000.00, LocalDate.of(2032, 12, 31), 1.40);
        AbstractCompte av3 = new AssuranceVie("AV003", 8700.75, LocalDate.of(2029, 3, 15), 1.10);
        AbstractCompte av4 = new AssuranceVie("AV004", 30500.20, LocalDate.of(2035, 1, 1), 1.55);
        AbstractCompte av5 = new AssuranceVie("AV005", 12800.00, LocalDate.of(2031, 9, 10), 1.35);

        // Persiste dans la base de données
        em.persist(av1);
        em.persist(av2);
        em.persist(av3);
        em.persist(av4);
        em.persist(av5);


        // Instanciation
        AbstractCompte la1 = new LivretA("LA001", 2500.00, 3.00);
        AbstractCompte la2 = new LivretA("LA002", 13200.99, 3.00);
        AbstractCompte la3 = new LivretA("LA003", 7800.50, 3.00);
        AbstractCompte la4 = new LivretA("LA004", 950.75, 3.00);
        AbstractCompte la5 = new LivretA("LA005", 4100.10, 3.00);
        AbstractCompte la6 = new LivretA("LA006", 9999.99, 3.00);
        AbstractCompte la7 = new LivretA("LA007", 540.20, 3.00);

        // Persiste dans la base de données
        em.persist(la1);
        em.persist(la2);
        em.persist(la3);
        em.persist(la4);
        em.persist(la5);
        em.persist(la6);
        em.persist(la7);

        // Instanciation
        Client c1 = new Client("Jean", a1, b1, LocalDate.of(1990, 5, 12), "Dupont");
        Client c2 = new Client("Marie", a2, b2, LocalDate.of(1985, 11, 3), "Martin");
        Client c3 = new Client("Luc", a3, b1, LocalDate.of(2000, 2, 20), "Bernard");
        Client c4 = new Client("Claire", a4, b3, LocalDate.of(1998, 7, 18), "Robert");
        Client c5 = new Client("Sophie", a5, b2, LocalDate.of(1975, 9, 30),"Durand");
        Client c6 = new Client("Paul", a6, b4, LocalDate.of(1992, 1, 14), "Moreau");
        Client c7 = new Client("Hugo", a7, b3, LocalDate.of(2001, 12, 8), "Fournier");
        Client c8 = new Client("Camille", a8, b4, LocalDate.of(1996, 4, 22), "Girard");
        Client c9 = new Client("Nina", a9, b3, LocalDate.of(1988, 3, 10), "Roux");

        // Persiste dans la base de données
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(c4);
        em.persist(c5);
        em.persist(c6);
        em.persist(c7);
        em.persist(c8);
        em.persist(c9);



        // Liaison des Client avec Compte ⚠, insertion des comptes avant
        c1.getComptes().add(av1);
        c1.getComptes().add(la1);
        c1.getComptes().add(la4);
        c2.getComptes().add(av2);
        c2.getComptes().add(la2);
        c3.getComptes().add(av3);
        c3.getComptes().add(la3);
        c3.getComptes().add(la7);
        c4.getComptes().add(av4);
        c4.getComptes().add(la5);
        c5.getComptes().add(av5);
        c5.getComptes().add(la6);
        c6.getComptes().add(la1);
        c6.getComptes().add(la2);
        c7.getComptes().add(la3);
        c7.getComptes().add(la4);
        c8.getComptes().add(la6);
        c8.getComptes().add(la7);
        c9.getComptes().add(la5);

        transaction.commit();

    }
}
