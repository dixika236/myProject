import java.util.Scanner;
class scannerimport 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no 1:");
		int num1=sc.nextInt();
		System.out.println("Enter no 2:");
		int num2=sc.nextInt();
		int op= num1+num2;
		System.out.print("sum of two no.:" + op);
	}
}
