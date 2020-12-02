
public class boucle1 {

		/*
		 * Algo jusquaDix 
		 * variable 
		 * i :entier
		 * virgule :chaine
		 * 
		 * debut
		 * virgule <- ","
		 * pour i <- 1 à 11 
		 * si (i=10) alors
		 * ecrire(i)
		 *sinon 
		 *ecrire (i+virgule)
		 *finsi
		 *fin
		 * 
		 * */
	
	public static void main(String[] args) {
		 String virgule =",";
		
		for(int i=1; i<11 ; i++)
		{
			
			if( i==10)
			{
				
				System.out.print(i);
				
			}
			else
			{
				System.out.print(i+virgule);
			}
			
		}

	}

}
