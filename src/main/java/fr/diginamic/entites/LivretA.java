package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Modélise un compte LivretA
 */
@Entity
@Table(name="livret_a")
public class LivretA extends AbstractCompte {

    @Column(scale=4, precision = 2)
    private double taux;


    public LivretA() {
    }

    /**
     * Constructor for: LivretA
     *
     * @param numero
     * @param solde
     * @param taux
     */
    public LivretA(String numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    /**
     * Getter for taux
     *
     * @return taux
     */
    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "LivretA: " + super.toString() + "taux= " + taux;
    }
}
