/*to checka number is prime or not
 * written by:kshirabdi
 * date:16-05-2023
 */

package javapractical;
import java.util.Scanner;
class CheckPrime
{
	static int count=0;
	static int primeNumber(int n)
	{
		if(n<=1)
			return -1;
		else 
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
					
			}
			if(count == 0)
				return 0;
			else
				return 1;
			
		}
	}
}
public class Experiment4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check prime or not = ");
		int n=sc.nextInt();
		int rs= CheckPrime.primeNumber(n);
		if(rs == -1)
			System.out.println(n+" is neither prime or composite");
		else if(rs==0)
			System.out.println(n+" is prime ");
		else
			System.out.println(n+" is composite");
		
	}

}
