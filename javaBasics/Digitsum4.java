import java.util.Scanner;
class DigitSum4 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 Digit no. :" );
		num =sc.nextInt();
		int sum=0;
		
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		 
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		 
		System.out.println("The Sum of all 4 digits = " +sum);
				
	}
}

