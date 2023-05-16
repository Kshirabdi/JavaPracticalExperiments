//to find the sum of any number of integers entered as command line arguments
//written by:21DIT228
//date:16-05-2023
package javapractical;

public class Experiment1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			int number=Integer.parseInt(args[i]);
			sum += number;
		}
		System.out.println("the sum of entered numbers = "+ sum);
	}

}
