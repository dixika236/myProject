import java.util.Scanner;
class  Restaurant
{
		static String name;//null
		static long contact;//0
		static String address;//null
				
	    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for (; ; )
		{
			System.out.println();
			System.out.println("            JAVA KA DHABA ");
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2.Existing User");
			System.out.println();
			System.out.println("Enter an option:");
			int opt=sc.nextInt();
			System.out.println();
			switch (opt)
			{
			case 1: createAccount(sc);break;
			case 2: login(sc);break;
			default: System.out.println("INVALID INPUT");
			break;
			}
		}
	}
	public static void createAccount(Scanner sc)
	{
			System.out.println("     REGISTRATION");
			System.out.println();
			System.out.println("Name : ");
			   name =sc.next();
			System.out.println("Phone:  ");
			contact=sc.nextLong();
			System.out.println("Address : ");
			sc.nextLine();
			address=sc.nextLine();
			System.out.println("ACCOUNT CREATED SUCCESSFULLY");
	}
	public static void login(Scanner sc)
	{
		if (name==null)
		{
		    System.out.println("Create Yoour account first");
			return;//callig main method 
		}
		
				System.out.println("          Login");
				System.out.println();
				
				for (int attempt=3;attempt>=1 ;attempt-- )
				{System.out.print("Username : ");
				String username=sc.next();
				System.out.println("Password");
				long phone=sc.nextLong();
				System.out.println();
				if (name.equals(username)&& contact==phone)
				{
					homePage(sc);
					
				}else{
					System.out.println("INVALID CRED");
					System.out.println("ATTEMPT LEFT : "+(attempt-1));
					System.out.println();
				}
				}
				
				System.out.println("THANK YOU AND NEVER VISIT AGAIN");
				System.exit(0); //terminate the execution
				
	}
	public static void homePage(Scanner sc)
	{
					System.out.println("HOME PAGE");
					System.out.println();
					System.out.println("1. Menu");
					System.out.println("2. Order");
 					System.out.println("3. Table Booking");
 					System.out.println("4. Logout");
				    System.out.println();
 					System.out.println(" Enter an option :");
 					int opt=sc.nextInt();
					
					switch (opt)
					{
					//case 1: menu();break;
					
					}
	}
	}
	



					
				