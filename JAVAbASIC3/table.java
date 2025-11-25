import java.util.Scanner;
class table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num; " );
		int num= sc.nextInt();
		
		
		System.out.println("Enter the value till num multiply " );
		int numtill= sc.nextInt();
		
		for(int i=1;i<=numtill; i++)
		System.out.println(num + "X "+ i+"= "+ (num*i));
	}
}
