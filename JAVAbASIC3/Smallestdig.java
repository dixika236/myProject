class SmallestDig 
{
	public static void main(String[] args) 
	{
		int num=34034512;
		 int min=9;
		for (int i=num;i>0 ;i/=10 )
		{
			 int rem=i%10;
			if (rem<min)
			{
				min=rem;
			}
		}
		System.out.println("Smallest digit from"+ num +" is "+min);
	}
}