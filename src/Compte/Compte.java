package Compte;

public class  Compte {
    private int code;
    private double solde;
    private int nb_compte = 0;

    public Compte (int code, double solde){
        this.code = code;
        this.code = 0;
        this.solde = solde;
        this.solde = 0;

    }
    public String toString(){
return "Le code de votre compte est "+code+ " votre solde est  "+solde;
    }
    public void depot(double prix){
        this.solde = this.solde + prix;
    }

    public void retrait(double prix){
        this.solde = this.solde - prix;
    }

    public double getSolde() {
        return solde;
    }
}
