import java.util.Scanner;
class FactorialEvenOddSum
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		int num=new Scanner(System.in).nextInt();
		int sum=0;
		for (int i=1;i<=num ;i++ )
			if (num%2==1)
			{rem=num%10;
		sum=sum+rem;
		num%=10;
		System.out.println("no. is odd"+sum);
			}
			
		else
			{System.out.println("no.is even");
		}
	}
}