
// Classe dérivée Footballeur
class Footballeur extends Joueur {
    // TODO 2

    // Implémentation de la méthode abstraite pour afficher les détails du footballeur, incluant l'équipe
    @Override
    public void afficherDetails() {
        System.out.println("Nom: " + getNom());
        System.out.println("Âge: " + getAge());
        System.out.println("Équipe: " + equipe);
    }
}



