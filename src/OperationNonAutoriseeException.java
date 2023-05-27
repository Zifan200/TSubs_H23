// Exception personnalisée pour une opération non autorisée
//TODO 9

public class OperationNonAutoriseeException extends Exception{
    public OperationNonAutoriseeException(String message) {
        super(message);
    }
}