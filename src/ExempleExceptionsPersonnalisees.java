// Classe utilisant les exceptions personnalisées

class ExempleExceptionsPersonnalisees {
    private int valeur;

    // Méthode pour définir la valeur. N'acepte que des valeurs entre 1 et 100 inclusivement.
    //TODO 7
    public static class OperationNonAutoriseeException extends Exception{
        public OperationNonAutoriseeException(String s) {
            super(s);
        }
    }

    // Méthode pour effectuer une opération
    public void effectuerOperation() throws OperationNonAutoriseeException{
        // Condition de vérification pour l'opération
        boolean condition = valeur >= 1 && valeur <= 100;

        if (!condition) {
            throw new OperationNonAutoriseeException("L'opération n'est pas autorisée.");
        }

        // Logique de l'opération
    }

    public void setValeur(int valeur)  throws ValeurHorsLimiteException{
        if (valeur < 1 || valeur > 100) {
            throw new ValeurHorsLimiteException("L'opération n'est pas autorisée.");
        }
        this.valeur = valeur;
    }
}
