import Compte.Compte;
i

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Compte compte1 = new Compte(3030, 2000000);
        System.out.println(compte1.toString());

    }

}
