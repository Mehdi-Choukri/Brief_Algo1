
public class fonction2 {
	
	public static String genderAndMaturity (String sexe , int age)
	{
		String ageCalificaiton="";
		String SexeCalification="";
		String res="";
		if(age>=18)
		{
			ageCalificaiton="Majeur";
					
		}
		else
		{
			ageCalificaiton="Mineur";
		}
		if(sexe=="Homme" || sexe=="H")
		{
			SexeCalification="un homme";
		}
		else if(sexe=="Femme" || sexe=="F")
		{
			SexeCalification="une femme";
		}
		res ="Vous êtes "+SexeCalification+" et vous êtes "+ageCalificaiton;
				 return res;

	}

	public static void main(String[] args) {
		
		System.out.println(genderAndMaturity("H",18));
		 
	}

}
