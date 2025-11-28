package fr.diginamic.entites;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="client" )
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nom", length=50, nullable=false)
    private String nom;

    @Column(name="prenom", length=50, nullable=false)
    private String prenom;

    @Column(name="date_naissance", nullable=false)
    private LocalDate dateNaissance;

    @ManyToOne
    @JoinColumn(name="id_banque")
    private Banque banque;

    @ManyToMany
    @JoinTable(name="cli_comp",
                joinColumns=@JoinColumn(name="id_client", referencedColumnName="id"),
                inverseJoinColumns=@JoinColumn(name="id_compte", referencedColumnName="id")
    )
    private Set<AbstractCompte> comptes;

    // Permet de faire de deux classe une seul table en base de donnée
    @Embedded
    private Adresse adresse;

}
