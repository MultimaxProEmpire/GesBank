import java.util.Scanner;

import src.views.VAgence;
import src.views.VCompte;
public class App{
     public static void main(String[] args){
        int choix;
        Scanner input = new Scanner(System.in);
       
        do{
            System.out.println("1- Agence ");
            System.out.println("2- Compte");
            System.out.println("Faites votre choix ! ");
            choix=input.nextInt();
            switch(choix){
                case 1:
                    VAgence.menu();
                case 2:
                    VCompte.menu();
            }

        }while(choix!=2);
            input.close();
        
    } 
}