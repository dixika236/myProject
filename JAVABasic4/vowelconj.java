import java.util.Scanner;
class  VowelConj
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter any alpthabet");
		char ch= sc.next().charAt(0);
		
	   String find= (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?("It is a vowel"):("It is Conjonent");
	   System.out.println(find);
	}
}
/*String month =sc.next().toUpperCase();
char ch=sc.next().charAt(0);*/
		