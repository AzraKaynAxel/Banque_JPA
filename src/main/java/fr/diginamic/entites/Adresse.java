package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

    @Column(name="numero", nullable = false)
    private int numero;

    @Column(name="rue", nullable = false)
    private String rue;

    @Column(name="code_postale", nullable = false)
    private int codePostale;

    @Column(name="ville", nullable = false)
    private String ville;


    public Adresse() {
    }

    /**
     * Constructor for: Adresse
     *
     * @param numero
     * @param rue
     * @param codePostale
     * @param ville
     */
    public Adresse(int numero, String rue, int codePostale, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostale = codePostale;
        this.ville = ville;
    }

    /**
     * Getter for codePostale
     *
     * @return codePostale
     */
    public int getCodePostale() {
        return codePostale;
    }

    /**
     * Setter for codePostale
     *
     * @param codePostale
     */
    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }

    /**
     * Getter for numero
     *
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Setter for numero
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Getter for rue
     *
     * @return rue
     */
    public String getRue() {
        return rue;
    }

    /**
     * Setter for rue
     *
     * @param rue
     */
    public void setRue(String rue) {
        this.rue = rue;
    }

    /**
     * Getter for ville
     *
     * @return ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Setter for ville
     *
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return  "codePostale= " + codePostale +
                ", numero= " + numero +
                ", rue= '" + rue + '\'' +
                ", ville= '" + ville + '\'';
    }
}
