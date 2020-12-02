import java.util.Scanner; 
public class myName {

	public static void main(String[] args) {
		
		/*Algorithme AlgoName 
		 * 
		 * variable name : chaine
		 * debut 
			 * ecrire('entrer votre nom')
			 * lire (name)
			 * ecrire ('bonjour ,'+name)
		 * fin
		 * 
		 * 
		 * */
		
		System.out.println("Quel est votre nom ?");
		Scanner in = new Scanner(System.in);
		String Name = in.nextLine();
		System.out.println("Bonjour ,"+Name);
		in.close();
		
	}

}
