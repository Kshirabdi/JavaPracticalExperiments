/*Create a multi file program where in one file a string message is taken as in put from the user and the function to display the message on
 * the screen is given in another file(make use of Scanner package in this program)
 * written by : kshirabdi
 * date: 12-05-2023 
 */

package javapractical;
class Class2
{
	static void showString()
	{
		Class1 c1=new Class1();
		c1.input();
		System.out.println("Entered name is = "+c1.firstName);
	}
}
public class Experiment13 {

	public static void main(String[] args) {
		Class2.showString();

	}

}
