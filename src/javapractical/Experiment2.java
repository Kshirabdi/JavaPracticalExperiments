/*To find the factorial of a given number
 * written by:kshirabdi
 * date:16-05-2023
 */
package javapractical;
import java.util.Scanner;
class FactorialOfNumber
{
	static int  factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		else 
			return (n * factorial(n-1));
	}
}

public class Experiment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter a number to find its factorial =");
		while(true)
		{
			num=sc.nextInt();
			if(num<0)
				System.out.print("ERROR!!!!!!!!!!\nplease enter a positive number = ");
			else break;
		}
		System.out.println(num + " ! = " + FactorialOfNumber.factorial(num));
		

	}

}
