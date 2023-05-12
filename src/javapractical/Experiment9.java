/*Write a program to show that during function overloading ,if no matching arguments is found,then java will apply automatic type conversions
 * (from lower to higher data type) 
 */

package javapractical;

class Overloading
{
	void typeConversion(int i)
	{
		System.out.println("This is integer variable\ni= "+i);
	}

	void typeConversion(double d)
	{
		System.out.println("This is double variable\nd= "+d);
	}
	void typeConversion(char c)
	{
		System.out.println("This is character variable\nc= "+c);
	}

	void typeConversion(long l)
	{
		System.out.println("This is long variable\nl= "+l);
	}
}

public class Experiment9 {

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		byte b=6;
		short s=2227;
		obj.typeConversion(b);  //integer
		obj.typeConversion(s);//integer
		obj.typeConversion('k');
		obj.typeConversion(228);
		//obj.typeConversion(655366l);//long
		obj.typeConversion(6.7f);//it will automatically the method accepting double variable as argument
		//obj.typeConversion(456676.78d);
		

	}

}
