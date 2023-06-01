package ex2;

/**
 * @author DIGINAMIC
 */
public class LivretA extends Compte {

    private static double tauxRemuneration;

    /**
     * @param solde
     */
    public LivretA(double solde) {
        super(solde);
    }

    /**
     * application du taux de rémunération annuel
     */
    public void appliquerRemuAnnuel() {
        this.solde = solde + solde * tauxRemuneration / 100;
    }

    /**
     * @return le taux de rémunération
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * @param txRem modification du taux de rémunération
     */
    public static void setTauxRemuneration(double txRem) {
        tauxRemuneration = txRem;
    }

    /**
     * @param credit Montant à créditer sur le LivretA
     */
    @Override
    public void crediterMontant(double credit) {
        this.solde += credit;
    }

    /**
     * @param debit Montant à débiter sur le LivretA
     */
    @Override
    public void debiterMontant(double debit) {
        this.solde -= debit;
    }

    /**
     * @return Solde du LivretA
     */
    @Override
    public double getSolde() {
        return super.getSolde();
    }

    /**
     * @param solde modification du solde du LivretA
     */
    @Override
    public void setSolde(double solde) {
        super.setSolde(solde);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "LivretA : " +
                "solde=" + solde +
                "tauxRemuneration=" + tauxRemuneration;
    }
}
