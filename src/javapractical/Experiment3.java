/*To convert a decimal to binary number
 * written by:kshirabdi
 * date:16-05-2023
 */
package javapractical;
import java.util.Scanner;
public class Experiment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a decimal number to find its coresponding binary number =");
		int n=sc.nextInt();
		System.out.println("Binry of "+ n +" = "+Integer.toBinaryString(n));
		sc.close();
	}

}
