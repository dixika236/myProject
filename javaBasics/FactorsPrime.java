import java.util.Scanner;a
class FactorsPrime
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. ");
		int num=sc.nextInt();
		int cnt=0;
		for (int i=2;i<num ;i++ )
			if (num%i==0)
			cnt++;
		
		System.out.println(cnt==0?"is prime":num+"is  not prime");
	}
}