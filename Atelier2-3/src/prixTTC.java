import java.util.Scanner; 
public class prixTTC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer le prix HT de l'article ");
		
		Float prixHT = Float.parseFloat(in.nextLine());
		
		System.out.println("Entrer le nombre d'articles "); 
		
		int nbrArticle = Integer.parseInt(in.nextLine());
		
		System.out.println("Entrer le taux de la TVA  "); 
		
		Float tva = Float.parseFloat(in.nextLine()) ;
		
		Float Calcul = (prixHT + prixHT * tva/100 ) * nbrArticle; 
		
		System.out.println("Le prix TTC EST de "+Calcul);
		in.close();

	}

}
