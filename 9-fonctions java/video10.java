import java.util.Scanner;

public class video10 {

  static void japper() {

    System.out.println("OUFF OUFF");

  }

  static void courrir() {

    System.out.println("Le chien cours");

  }

  static void dormir() {

    System.out.println("ZZZZZZZZZZ");

  }

  static void  messageErreur() {

   System.out.println("Désolé. ce chiffre ne correspond a aucune action");

  }


  static void  afficherMenu(){
    System.out.println("_ _ _ _ _");
    System.out.println("Actions:");
    System.out.println("1-japper");
    System.out.println("2-courrir");
    System.out.println("3- dormir");
    




  }

  public static void main(String[] args) {

    // japper();
    // courrir();
    // dormir();

    System.out.println("qu'est-ce que le chien fait");

    afficherMenu();

    int choix;

    Scanner scan = new Scanner(System.in);
    System.out.print("Reponse: ");
    choix = scan.nextInt();

    
    scan.close();

    switch (choix) {

      case 1:
        japper();
        break;

      case 2:
        courrir();
        break;

      case 3:
        dormir();
        break;

      default:
        //System.out.println("Désolé. ca ne correspond a aucune action");
        messageErreur();
        break;

    }

  }

}
