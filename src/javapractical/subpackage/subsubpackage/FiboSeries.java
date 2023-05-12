package javapractical.subpackage.subsubpackage;
import java.util.Scanner;
public class FiboSeries {
public void fibonacciSeries()
{
	Scanner sc= new Scanner(System.in);
	int n1=0,n2=1;
	System.out.println("Enter the limit of the series");
	int limit=sc.nextInt();
	System.out.print(n1+"   "+n2+"   ");
	while(true)
	{
		int temp=n1+n2;
		if(temp>limit)
			break;
		System.out.print(temp+ "   ");
		n1=n2;
		n2=temp;
		
		
	}
	
}
}
