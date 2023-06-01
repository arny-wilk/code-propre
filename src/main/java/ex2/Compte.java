package ex2;

import java.util.Objects;

/**
 * Class Abstraite Compte
 */
public abstract class Compte {
    protected double solde;

    /**
     * @param solde
     */
    public Compte(double solde) {
        this.solde = solde;
    }

    /**
     * @param credit
     */
    public abstract void crediterMontant(double credit);

    /**
     * @param debit
     */
    public abstract void debiterMontant(double debit);

    /**
     * @return le solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * @param solde modification du solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "solde=" + solde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compte compte = (Compte) o;
        return Double.compare(compte.solde, solde) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(solde);
    }
}
