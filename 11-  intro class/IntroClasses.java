import java.util.Scanner;

public class IntroClasses {



public static void main(String[] args) {


    //Creation dun objet
    // Classe maclasse = new maclasse(parametre1, parametre2, parametre3);

 
    Polygone poly1 = new Polygone(5.0 ,4.8 , 7.5 ,"rose" );

    Polygone poly2 = new Polygone(800,78, 42.3, "noir");

   System.out.println("Voici les infos de vos polygones");

   System.out.println("Les attributs de polygone1:");
   System.out.println("Longueur: " + poly1.largeur);
   System.out.println("hauteur: " + poly1.hauteur);
   System.out.println("profondeur: " + poly1.profondeur);
   System.out.println("Couleur: " + poly1.couleur);

   System.out.println("__________________________");

   System.out.println("Les attributs de polygone2:");
   System.out.println("Longueur: " + poly2.largeur);
   System.out.println("hauteur: " + poly2.hauteur);
   System.out.println("profondeur: " + poly2.profondeur);
   System.out.println("Couleur: " + poly2.couleur);


 /*
  * 
N'utilisez pas cette facon pour faire vos variables.perte d'espace
double x1;
double y1;
double z1;
double c1;

  */

  Scanner scan = new Scanner(System.in);

   double x1,y1,z1;
   double x2,y2,z2;

   String c1 ;
   String c2 ;


  ;

   System.out.println("Entrez les infos pour les 2 prochains objets");
   System.out.println("___________");

   
   System.out.println("Troisieme objet: ");

   System.out.println("Couleur du polygone 3: ");
   c1 = scan.nextLine();

   System.out.println("largeur du polygone3: ");
   x1 = scan.nextDouble();
   System.out.println("hauteur du polygone3: ");
   y1 = scan.nextDouble();
   System.out.println("profondeur du polygone3: ");
   z1 = scan.nextDouble();
   System.out.println("cc");
 
  
   

   System.out.println("Quatrieme objet: ");
   System.out.println("largeur du polygone4: ");
   x2 = scan.nextDouble();
   System.out.println("hauteur du polygone4: ");
   y2 = scan.nextDouble();
   System.out.println("profondeur du polygone4: ");
   z2 = scan.nextDouble();
   System.out.println("couleur du polygone4: ");
 c2 = scan.nextLine();






   scan.close();
  
   System.out.println("   ");


   Polygone poly3 = new Polygone(x1, y1, z1, c1);
   Polygone poly4 = new Polygone(x2, y2, z2, c2);

   System.out.println("Les attributs de polygone3:");
   System.out.println("Longueur: " + poly3.largeur);
   System.out.println("hauteur: " + poly3.hauteur);
   System.out.println("profondeur: " + poly3.profondeur);
   System.out.println("Couleur: " + poly3.couleur);

   System.out.println("__________________________");

   System.out.println("Les attributs de polygone4:");
   System.out.println("Longueur: " + poly4.largeur);
   System.out.println("hauteur: " + poly4.hauteur);
   System.out.println("profondeur: " + poly4.profondeur);
   System.out.println("Couleur: " + poly4.couleur);





  
}







}
