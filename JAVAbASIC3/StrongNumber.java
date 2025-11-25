class StrongNumber 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		System.out.println(isStrong(num));
		
		
	}
		
	
	
	public static boolean isStrong(int num)
	{
						
		int sum=0,temp=num;
		for (int j=num;j!=0 ;j/=10 )
		{
			sum=sum+factorial(j%10);
		}
		
		return sum==num;
	}
	
	public static int factorial(int digit)
	{
		int fact=1;
		for (int i=digit;i>0 ;i-- )
		{
			fact*=i;
					
		}
		return fact;
		
	}
}

