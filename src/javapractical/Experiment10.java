/*write a program to show difference between public and private access specifiers.the program should also show that primitive data types
 * are passed by value and objects are passed by reference and to learn use of final keyword
 */
/*written by:kshirabdi
 * date:09-05-2023
 */

package javapractical;
import java.util.Scanner;
class AccessSpecifier
{
	@SuppressWarnings("unused")
	private int x;
	public void show ()
	{
		System.out.println("public method show()");
	}
}

class PassbyvalAndReference
{
	int num1,num2;
	void inputByValue(int n1,int n2)
	{
		num1=n1*10;
		num2=n2*10;
		System.out.println("value of primitive data type passed by value(inside method) \nnum1 ="+num1+"   num2="+num2);
	}
	void inputByObject(PassbyvalAndReference ob)
	{
		num1=++ob.num1;
		num2=++ob.num2;
		System.out.println("value of the objct passed by reference \nnum1="+num1+"   num2="+num2);
	}
	
}


public class Experiment10 {

	public static void main(String[] args) {
		
		/**difference between public private access specifiers.
		 */
		
		AccessSpecifier ob =new AccessSpecifier();
		ob.show();
		//ob.x;// -> this line will show error because integer variable x is under private access specifier
		
		/** primitive data types are passed by value and objects are passed by reference
		 */
		
		PassbyvalAndReference object =new PassbyvalAndReference();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers =");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		object.inputByValue(n1,n2);
		System.out.println("value of the arguments passed in main method= "+n1+"and "+n2);
		//pass by refernce
		//passing object as reference
		PassbyvalAndReference object2=new PassbyvalAndReference();
		object2.inputByObject(object);
		System.out.println("value of the arguments passby reference = "+object.num1+"and "+object.num2);
		sc.close();
		
		/**use of final keyword
		 */
		@SuppressWarnings("unused")
		final int x1=10;
		//x1++;//-> after declaring a variable as final we can not in change its value it will show error
		System.out.println(x1);

	}

}


