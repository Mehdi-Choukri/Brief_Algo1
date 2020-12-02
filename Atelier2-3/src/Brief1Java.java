import java.util.Scanner;

public class Brief1Java {
	
	public static String Bonjour(String nom,String prenom)
	{
		return "Bienvenue "+nom+" "+prenom;
	}
	
	public static void Calcul(int nbrHeure) 

	{
		double NewTarif = 0;
		if(nbrHeure<=60)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Entrer le tarif par heure");
			double Tph = Double.parseDouble(in.nextLine());
			in.close();
			double bonus = (nbrHeure-40);
			if(bonus>0)
			{
				NewTarif=(Tph*40)+(Tph*bonus)+(Tph*bonus*0.5);
			}
			else
			{
				NewTarif=(Tph*nbrHeure);
			}
			
			System.out.println("Votre indemnisation est de "+NewTarif+" MAD");
		}else if(nbrHeure>60)
		{
			System.out.println("Informations erronés !");
		}
		
	}

	public static void main(String[] args) {
		 
		System.out.println("Bonjour\n veuillez saisir votre nom et prenom");
		System.out.println("  votre nom :\n");
		Scanner SC = new Scanner(System.in);
		String nom = SC.nextLine();
		System.out.println("  votre prénom :\n");
		String prenom = SC.nextLine();
		System.out.println(Bonjour( nom, prenom) );
		System.out.println(" veuillez saisir le nombre d'heure que vous avez travailler \n");
		int nbr_heure = SC.nextInt();
		SC.close();
		Calcul( nbr_heure) ;
		
		

	}

}
