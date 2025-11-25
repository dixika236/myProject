import java.util.Scanner;
class Season
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first three letters of month: ");
		String month =sc.next().toUpperCase();
		
		
		String check=(month.equals("OCT"))||(month.equals("NOV"))||
			         (month.equals("DEC"))||(month.equals("JAN"))?month+" WINTER SEASON":
			         (month.equals("FEB"))||(month.equals("MAR"))||
			         (month.equals("APR"))||(month.equals("MAY"))?month+" SUMMMER SEASON":
			         (month.equals("JUN"))||(month.equals("JUL"))||
			         (month.equals("AUG"))||(month.equals("SEP"))?month+" MONSOON SEASON":
			         "INVALID MONTH";
			
		
		System.out.println(check);
	}
}
