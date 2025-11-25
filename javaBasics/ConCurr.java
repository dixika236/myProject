import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("CURRENCY CONVERTER");
		System.out.println();
		System.out.println("Enter the Amount(INR): ");
		float inr =sc.nextFloat();
		System.out.println();
		
		System.out.println("List if Currency");
		System.out.println("1. USD");
		System.out.println("2.EUR");
		System.out.println("3.AUS");
		System.out.println("4.JPN");
		System.out.println("5.CND");
		System.out.println("6.SNP");
		
		System.out.println();
		System.out.println("Enter the Currency:");
		String curr=sc.next().toUpperCase();
		
		float conCurr=0;
		if(curr.equals("USD"))
		{
			conCurr=inr/86.56f;
			System.out.println(inr+"INR =" + conCurr+"USD");
		}
		else if(curr.equals("EUR"))
		{
			conCurr =inr/90.25f;
			System.out.println(inr+"INR =" + conCurr+"EUR");
		}



		else if(curr.equals("AUS"))
		{
			conCurr =inr/54.05f;
			System.out.println(inr+"INR =" + conCurr+"AUS ");
		}
		else if(curr.equals("JPN"))
		{
			conCurr =inr/0.56f;
			System.out.println(inr+"INR =" + conCurr+"JPN");
		}
		else if(curr.equals("CND"))
		{
			conCurr =inr/60.13f;
			System.out.println(inr+"INR =" + conCurr+"CND");
		}
		else if(curr.equals("SGP"))
		{
			conCurr =inr/64.01f;
			System.out.println(inr+"INR =" + conCurr+"SGP");
		}
		else{
			System.out.println("INVALID OPTION");
		}
	}
}








		
	

