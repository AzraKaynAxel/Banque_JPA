package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


/**
 * Modélise un compte AssuranceVie
 */
@Entity
@Table(name="assurance_vie")
public class AssuranceVie extends AbstractCompte {

    @Column(name="date_fin", nullable=false)
    private LocalDate dateFin;

    @Column(name="taux", nullable = false, precision = 2, scale = 5)
    private double taux;


    public AssuranceVie() {
    }

    /**
     * Constructor for: AssuranceVie
     *
     * @param numero
     * @param solde
     * @param dateFin
     * @param taux
     */
    public AssuranceVie(String numero, double solde, LocalDate dateFin, double taux) {
        super(numero, solde);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    /**
     * Getter for dateFin
     *
     * @return dateFin
     */
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * Setter for dateFin
     *
     * @param dateFin
     */
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Getter for taux
     *
     * @return taux
     */
    public double getTaux() {
        return taux;
    }

    /**
     * Setter for taux
     *
     * @param taux
     */
    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "AssuranceVie: " + super.toString() + "dateFin=" + dateFin + ", taux=" + taux;
    }
}
