/*EXPERIMENT-11: Write a program to show the use of static functions and to pass variable length arguments in a function.
 * written by:kshirabdi
 * date:11-05-2023
 */

package javapractical;

/**class VariableArg contains a static method named maxValue(int ...arr).
 * which takes an integer array as argument which can take variable number of values 
 * @author swain
 */
class VariableArg
{
	static int maxValue(int ...arr)   //static method with variable arguments
	{
		int max=arr[0];
		for(int i : arr)
		{
			if(max<i)
			{
				max=i;
			}
		}
		return max;
	}
}

public class Experiment11 {

	public static void main(String[] args) {
		
		System.out.println("maximum value among 10,20,30 = "+VariableArg.maxValue(10,20,30));
		System.out.println("maximum value among 10,40,30,20 = "+VariableArg.maxValue(10,40,30,20));
		System.out.println("maximum value among 50,40,30,20,10 = "+VariableArg.maxValue(50,40,30,20,10));

	}

}
