package javapractical;
import java.util.Scanner;
public class Class1 {
	String firstName;
	void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your name : ");
		firstName=sc.nextLine();
		sc.close();
	}

}
