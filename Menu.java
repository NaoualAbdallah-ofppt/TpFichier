import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args)
    {
        try{
        
        System.out.println("Menu");
        System.out.print("1. ajouter\n2.Lister\n Votre choix : ");
        Scanner sc = new Scanner(System.in);
        int choix=sc.nextInt();
        switch (choix)
        {
            case 1:
            System.out.print("Num :");
            int num=sc.nextInt();
            System.out.print("Nom :");
            String nom = sc.next();
            sc.close();
            Client cl= new Client(num, nom);
           cl.ajouterFichier();
    
            break;
            case 2 :
            ArrayList<Client> AL = Client.listerFichier();
            for (int i=0; i<AL.size();i++)
            {
             System.out.println(AL.get(i));
            }
            break;
            default:
            System.out.println("Erreur de choix");
        }
        
 
    }

catch (IOException ex)
{
    
   // txtErreur.setText("Erreur IO");
    System.out.println(ex.getMessage());

}
catch (Exception ex)
{
    System.out.println("Erreur autre ");
}    

}
}