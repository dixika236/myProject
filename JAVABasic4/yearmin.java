import java.util.Scanner;
class yearsDays
{
	public static void main(String[] args) 
	{
		int min=(new Scanner(System.in)).nextInt();
		int minYear=365*24*60;
		int years= min/minYear;
			int days=(min%minYear)/(24*60);
		
		System.out.println("user entered min:" +min);
		
		System.out.println(years +"years "+days+ "days");
		
		
	}
}
