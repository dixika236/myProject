import java.util.Scanner;
class EvmMachine 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp =0 , cng = 0,ss=0, app=0 ,mns=0,nota=0;
		System.out.println();
		System.out.println("              WELCOME ");
		System.out.println();
		System.out.println("Enter the Population: ");
		int population =sc.nextInt();
		
		for(int i=1;i<=population;i++)
		{
			System.out.println();
			System.out.println(" ###LIST OF PARTIES###");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. APP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();
			System.out.println("Enter the Option: ");
			int opt=sc.nextInt();
			
			
				if(opt==1)
				{
					bjp++;
					System.out.println("ACHE DIN NHI AATE");
				}
				if(opt==2)
				{
					cng++;
					System.out.println("BHARAT TOODO");
				}
				if(opt==3)
				{
					ss++;
					System.out.println("HUM HAI ASLI SENA");
				}
				if(opt==4)
				{
					app++;
					System.out.println("MUZE AZAD KARO");
				}
				if(opt==5)
				{
					mns++;
					System.out.println("JAI MAHARASTRA");
				}
				if(opt==6)
				{
					nota++;
					System.out.println("YOU ARE AN EDUCATED PERSON");
				}
				System.out.println();
				
				if(!(opt>=1 && opt<=6)){
					i--;
					System.out.println("INVALID OPTION");
					
		}
		
			}
	if(bjp>=cng && bjp>=ss && bjp>=app && bjp>=mns && bjp>=nota){
		System.out.println("BJP HAS WON THE ELECTION BY" +bjp+"votes");}
		
		if(cng>=bjp && cng>=ss && cng>=app && cng>=mns && cng>=nota){
		System.out.println("CNG HAS WON THE ELECTION BY" +cng+"votes");}
		
		if(ss>=cng && ss>=bjp && ss>=app && ss>=mns && ss>=nota){
		System.out.println("SS HAS WON THE ELECTION BY" +ss+"votes");}
		
		if(app>=cng && app>=ss && app>=bjp && app>=mns && app>=nota){
		System.out.println("APP HAS WON THE ELECTION BY" +app+"votes");}
		
		if(mns>=cng && mns>=ss && mns>=app && mns>=bjp && mns>=nota){
		System.out.println("MNS HAS WON THE ELECTION BY" +mns+"votes");}

		if(nota>=cng && nota>=ss && nota>=app && nota>=mns && nota>=bjp){
		System.out.println("NOTA HAS WON THE ELECTION BY" +nota+"votes");}
	}
		
	}

		