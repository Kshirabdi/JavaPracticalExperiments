/*Experiment 7
 * written by:kshirabdi
 * date:6-05-2023
 */
package javapractical;
import java.util.Scanner;
class Distance
{
	
	int feet,inches;
	Scanner sc=new Scanner(System.in);
	void input(int feet)
	{
		this.feet=feet;
	}
	void convertFeetToInches()
	{
		inches=12*feet;
	}
	void show()
	{
		System.out.println(feet+" feet = "+inches+" inches..");
	}
}
public class experiment7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the feet = ");
		int feet=sc.nextInt();
		Distance obj= new Distance();
		obj.input(feet);
		obj.convertFeetToInches();
		obj.show();
		sc.close();

	}

}
