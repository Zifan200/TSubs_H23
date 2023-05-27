// Classe dérivée Voiture
//TODO 5
class Voiture extends Vehicule {
    private int nombrePortes;

    // Constructeur
    public Voiture(String marque, String modele, int annee, int nombrePortes) {
        super(marque, modele, annee);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public String toString() {
        return "Voiture : Marque=" + getMarque() + ", Modèle=" +  getModele() + ", Année=" + getAnnee() + ", Nombre de portes=" + getNombrePortes();
    }

    // Getter et setter

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }
}
