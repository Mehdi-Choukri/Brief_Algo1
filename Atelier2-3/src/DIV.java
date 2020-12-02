
public class DIV {

	public static Boolean  divisibleParTroie(int N)
	{
		Boolean res;
		if(N%3==0)
		{
			res = true;
		}
		else
			res = false;
		 return res;
	}

	public static void main(String[] args) {
		
		if(divisibleParTroie(23))
		{
			System.out.print("divisible"); 
		}
		else
			
		{
			System.out.print("pas divisible"); 
		}


	}
}
