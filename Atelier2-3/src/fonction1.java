
public class fonction1 {
	
	
	
	public static String ALOHA(String nom,String prenom,int age)
	{
		return "Bonjour "+nom+" "+prenom+", tu as "+age+" ans";
	}

	public static void main(String[] args) {
		
		String salutation = ALOHA ("Mehdi","Choukri",25);
		System.out.println(salutation);
		

	}

}
