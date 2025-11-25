import java.util.Scanner;
class Ascii
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter charecter");
		char ch=sc.next().charAt(0);
						
		/*String op=(ch>='A'&&ch<='Z')?("Uppercase"):((ch>='a'&&ch<='b')?("lowercase"):
			((ch>='0'&&ch<='9')?("digits"):("Special charecter"))); */
		
		String op= (ch>='A'&&ch<='Z')?("Uppercase"):((ch>='a'&&ch<='z')?("lowercase"):
			(((ch>='0'&&ch<='9')?("digits"):("Special charecter"))));
		
		System.out.println(op);
		
	}
}
