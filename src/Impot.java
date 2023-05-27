// Classe Impot
//TODO 4
class Impot {
    private String nomContribuable;
    private double revenuAnnuel;
    private double tauxImposition;

    // Constructeur
    public Impot(String nomContribuable, double revenuAnnuel, double tauxImposition) {
        this.nomContribuable = nomContribuable;
        this.revenuAnnuel = revenuAnnuel;
        this.tauxImposition = tauxImposition;
    }

    // Getter et setter
    public void afficher(){
        System.out.println("nom du contribuable: " + getNomContribuable() + "\n"
                + "Revenu annuel: " + getRevenuAnnuel() + "\n"
                + "Taux d'imposition: " + getTauxImposition() + "\n"
                + "Impôt à payer: " + calculerImpot());
    }

    public double calculerImpot(){
        return (revenuAnnuel * tauxImposition);
    }
    public void setTauxImposition(double tauxImposition) {
        this.tauxImposition = tauxImposition;
    }
    public double getTauxImposition() {
        return tauxImposition;
    }

    public void setRevenuAnnuel(double revenuAnnuel) {
        this.revenuAnnuel = revenuAnnuel;
    }

    public double getRevenuAnnuel() {
        return revenuAnnuel;
    }

    public void setNomContribuable(String nomContribuable) {
        this.nomContribuable = nomContribuable;
    }

    public String getNomContribuable() {
        return nomContribuable;
    }
}
