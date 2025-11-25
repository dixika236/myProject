import java.util.Scanner;
class  Uppercase
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabets");
		char ch=sc.next().charAt(0);
		
		
		/* String upc=(ch>='A'&&ch<='Z')?("the charecter is uppercase"):((ch>='a'&&ch<='z'||ch>='0'&&ch<='9')?
			 ("It is not an Uppercase charecter"):("it is another special charecter"));
		 System.out.println(upc);  */
		 
		 String up = (ch>='A'&&ch<='Z')?("The charecter is Uppercase"):("It is not a uppercase ");
		 System.out.println(up); 
		
		
	}
}
