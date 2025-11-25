//import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		
		int num=76;
		int prd=1;
		int sum=0;
		
		for (int i=num; i>0 ;i/=10 )
		{
			int rem =i%10;
           
			 sum+=rem;
			 prd*=rem;
		}	 
			
		if (sum!=prd)
			System.out.println(num+"it is not spy no");
		
		
			else
		System.out.println(num+"it is  spy no");
		}
			}
		
			
	

