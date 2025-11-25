import java.util.Scanner;
class tip 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill: ");
		float bill = sc.nextfloat();
		
		
		System.out.println("Enter the tip rate: ");
		float tiprate = sc.nextfloat();
		float tipAmount=(tipRate*bill)/100;
		float totalBill= bill+tipAmount;
		System.out.println(" totalbill= ");
		System.out.println("Enter the bill: ");
		
			
		
	}
}
