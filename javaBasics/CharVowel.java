import java.util.Scanner;
class  CharLetterVowel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next().toLowerCase();
		int length=name.length();
		for (int i=0;i<length ;i++ )
		{
			char ch=name.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
          			System.out.print(name.charAt(i));
			}
			
		}
		
}}
		
		