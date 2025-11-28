package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class AbstractOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="montent", nullable = false, precision = 2, scale = 10)
    private double montent;

    @Column(name="motif", nullable = false)
    private String motif;


    public AbstractOperation() {

    }

    /**
     * Constructor for: AbstractOperation
     *
     * @param id
     * @param montent
     * @param motif
     */
    public AbstractOperation(Integer id, double montent, String motif) {
        this.id = id;
        this.montent = montent;
        this.motif = motif;
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
     * Getter for montent
     *
     * @return montent
     */
    public double getMontent() {
        return montent;
    }

    /**
     * Setter for montent
     *
     * @param montent
     */
    public void setMontent(double montent) {
        this.montent = montent;
    }

    /**
     * Getter for motif
     *
     * @return motif
     */
    public String getMotif() {
        return motif;
    }

    /**
     * Setter for motif
     *
     * @param motif
     */
    public void setMotif(String motif) {
        this.motif = motif;
    }

    @Override
    public String toString() {
        return  "id= " + id + ", montent= " + montent + ", motif= '" + motif + '\'';
    }
}