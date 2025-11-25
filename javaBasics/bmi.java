import java.util.Scanner;
class BMIcalc 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter weight in pound:");
		double wgt=sc.nextDouble();
		
	   
		System.out.println("Enter height in inch:");
		double hgt=sc.nextDouble();
		 
		 double wgtkg=0.45359237;
		 double hgtm=0.0254;
		 
		 double totalweight=wgtkg*wgt;
		 double totalheight= hgtm*hgt;
		 
		 
		
		System.out.println("the total bmi is= "+totalweight/(totalheight*totalheight));
	}
}
