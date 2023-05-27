// Classe dérivée
// TODO 1.2
public class Chat extends Animal{
    private boolean estInterieur = true;

    public Chat(String nom, int age, boolean estInterieur) {
        super(nom, age);
        this.estInterieur = estInterieur;
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Miaouw");
    }
    public boolean getInterieur(){
        return estInterieur;
    }
    public void setEstInterieur(boolean i){
        estInterieur = i;
    }
    @Override
    public String toString() {
        return "Chat [" +
                "estInterieur=" + getInterieur() +
                ", " +  super.toString()+ "]";
    }
}