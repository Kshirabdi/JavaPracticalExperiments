/*Write a program to create a multilevel package and also creates a reusable class 
 * to generate Fibonacci series, where the function to generate Fibonacci series is
 *  given in a different file belonging to the same package.
 *  written by:kshirabdi
 *  date:12-05-2023
 */

package javapractical;
import javapractical.subpackage.subsubpackage.*;
public class Experiment14 {

	public static void main(String[] args) {
		FiboSeries fs=new FiboSeries();
		fs.fibonacciSeries();

	}

}
