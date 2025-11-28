package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="banque" )
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nom", length=50, nullable=false, unique=true)
    private String nom;

    @OneToMany(mappedBy="banque")
    private Set<Client> client;


    public Banque() {
    }

    /**
     * Constructor for: Banque
     *
     * @param nom
     */
    public Banque(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for client
     *
     * @return client
     */
    public Set<Client> getClient() {
        return client;
    }

    /**
     * Setter for client
     *
     * @param client
     */
    public void setClient(Set<Client> client) {
        this.client = client;
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

    @Override
    public String toString() {
        return "Banque: " +
                "client= " + client +
                ", id= " + id +
                ", nom= '" + nom + '\'';
    }
}
