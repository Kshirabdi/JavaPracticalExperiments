package javapractical;
import java.util.Scanner;
public class experiment5 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int sum=0;
		int []arr=new int[num];
		Scanner sc= new Scanner(System.in);
		for(int i =0;i<num;i++)
		{
			System.out.print("enter the number - "+ (i+1) + " = ");
			int n=sc.nextInt();
			arr[i]=n;
			sum+=n;
		}
		System.out.println("sum of the numbers :");
		int i=0;
		for(int tem:arr)
		{
			System.out.print(tem);
			if(i<(num-1))
			{
			System.out.print("+");
			i++;
			}
			else
			i++;
		}
		
		System.out.println("="+sum);
		sc.close();
		

	}

}
