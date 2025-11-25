import java.util.Scanner;
class Buzzno 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		int cnt=0;
		
		
		
		if (num%7==0||num%10==7)
		{
			System.out.println("It is a buzz number");
		
		}
		else
		System.out.println("it is not a buzz number ");
	}
}
}