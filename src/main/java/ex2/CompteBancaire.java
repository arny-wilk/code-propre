package ex2;

/**
 * @author DIGINAMIC
 */
public class CompteBancaire extends Compte {

    private static double decouvert;

    /**
     * @param solde
     */
    public CompteBancaire(double solde) {
        super(solde);
    }

    /**
     * @param credit Montant à créditer sur le compte bancaire
     */
    @Override
    public void crediterMontant(double credit) {
        super.solde += credit;
    }

    /**
     * @param debit Montant à débiter sur le compte bancaire
     */
    @Override
    public void debiterMontant(double debit) {
        if (this.solde - debit <= decouvert) {
            System.out.println("Sorry your account is blocked");
        } else {
            this.solde -= debit;
        }
    }

    /**
     * @return le solde du compte courant
     */
    public double getSolde() {
        return solde;
    }

    /**
     * @param solde modifie le solde du compte courant
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * @return decouvert
     */
    public static double getDecouvert() {
        return decouvert;
    }

    /**
     * @param decouvert modifie la valeur du découvert
     */
    public static void setDecouvert(double decouvert) {
        CompteBancaire.decouvert = decouvert;
    }

    @Override
    public String toString() {
        return "Compte Courant : " +
                " solde=" + solde +
                " decouvert autorisé : " + decouvert;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
