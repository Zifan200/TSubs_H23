// Classe dérivée Ville
//TODO 3
class Ville extends Pays {
    private String nomVille;

    // Constructeur
    public Ville(String nom, int population, String nomVille) {
        super(nom, population);
        this.nomVille = nomVille;
    }

    // Getter et setter
    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public void afficherDetails(){
        super.afficherDetails();
    }
}