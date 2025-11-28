package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractCompte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero", length = 50, nullable = false)
    private String numero;

    @Column(name = "solde", nullable = false, precision = 2, scale = 10)
    private double solde;

    @ManyToMany
    @JoinTable(name="cli_comp",
            joinColumns=@JoinColumn(name="id_compt", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="id_client", referencedColumnName="id")
    )
    private Set<Client> clients;


    public AbstractCompte() {
    }

    /**
     * Constructor for: AbstractCompte
     *
     * @param numero
     * @param solde
     */
    public AbstractCompte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return  "id= " + id + ", numero= '" + numero + '\'' + ", solde= " + solde;
    }
}