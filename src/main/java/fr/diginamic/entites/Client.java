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

    public Client(String prenom, Adresse adresse, Banque banque, LocalDate dateNaissance, Integer id, String nom) {
        this.prenom = prenom;
        this.adresse = adresse;
        this.banque = banque;
        this.dateNaissance = dateNaissance;
        this.id = id;
        this.nom = nom;
    }

    /**
     * Getter for adresse
     *
     * @return adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Setter for adresse
     *
     * @param adresse
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * Getter for banque
     *
     * @return banque
     */
    public Banque getBanque() {
        return banque;
    }

    /**
     * Setter for banque
     *
     * @param banque
     */
    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    /**
     * Getter for comptes
     *
     * @return comptes
     */
    public Set<AbstractCompte> getComptes() {
        return comptes;
    }

    /**
     * Setter for comptes
     *
     * @param comptes
     */
    public void setComptes(Set<AbstractCompte> comptes) {
        this.comptes = comptes;
    }

    /**
     * Getter for dateNaissance
     *
     * @return dateNaissance
     */
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Setter for dateNaissance
     *
     * @param dateNaissance
     */
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * Getter for id
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter for id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for nom
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter for nom
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for prenom
     *
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter for prenom
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client: " +
                ", id= " + id +
                ", nom= '" + nom + '\'' +
                ", prenom= '" + prenom + '\'' +
                ", dateNaissance= " + dateNaissance +
                ", adresse= " + adresse +
                ", banque=" + banque +
                ", comptes=" + comptes;
    }
}