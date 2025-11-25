class Fabonacci 
// 0  1 1 2 3 5  8
{
	public static void main(String[] args) 
	{
		
		
		int first=0,second=1;
		System.out.println("Fabonacci no. series is");
		
		
		for (int i=0;i<=7;i++)
		{
			int fab =first+second;
			first=second;
			second=fab;
			
		System.out.println(fab);
			}
						
		}
	}

