package Compte;

public class CompteEpargne extends Compte {
    private double interet;


    public CompteEpargne(int code, double solde) {
        super(code, solde);
    }
    public void  Calculeinteret(double interet){
            this.interet =  interet;
            this.interet =  1,06 ;
    }
}
