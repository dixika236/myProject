import java.util.Scanner;
class Duckno 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Emnetr a no.");
		String numStr= sc.next();
		 boolean flag=false;
		 for (int i=0;i<numStr.length() ; i++)
		 {
			 if (numStr.charAt(i)=='0')
			 {
				 flag=true;
				 break;
			 }
		 }
		 if (flag&&numStr.charAt(0)!='0')
		 {
			 System.out.println("it is duck no. ");
		 }
		
		else
			System.out.println("it is not a duck number");
						
	}}
