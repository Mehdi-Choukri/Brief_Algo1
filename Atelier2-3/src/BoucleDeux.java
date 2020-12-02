
public class BoucleDeux {

	public static void main(String[] args) {
		
		/*
		 *  Algo jusquacents
		 * variable 
		 * i :entier
		 * 
		 * 
		 * debut
		 *  
		 * pour i <- 1 à 11
		 *  si(i<>10) alors
		 *  
		 * ecrire(i+","+(101-i))
		 * sinon 
		 * ecrire(i)
		 * finsi
		 * finpour
		 * 
		 * 
		 * fin
		 * 
		 * 
		 * */ 
		
		for(int i=1 ; i<11 ; i++)
		{
			if(i!=10)
			{
				System.out.print(i+", "+(101-i)+", ");
			}
			else
			{
				System.out.print(i);
			}
			
		}
		 

	}

}
