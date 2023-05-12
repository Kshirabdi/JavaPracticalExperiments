/*Experiment-12: Write a program to demonstrate the concept of boxing and unboxing.
 * written by:kshirabdi
 * date:11-052023
 */

package javapractical;
class BoxingUnboxing
{
	@SuppressWarnings("removal")
	void boxing() 
	{

		/** Boxing or Autoboxing denots convertion of primitive data types to the object of its corresponding wrapper class
		 */
		
		Byte byt = 28;
		Short s = new Short((short) 288);
		Character c ='K';
		Integer i=new Integer(12);
		Long l= new Long(5228);
		Float f = 78.9f;
		Double d= new Double(228.456);
		Boolean b=true;
		System.out.println("AUTOBOXING");
		System.out.println("-----------");
		System.out.println("value at Byte byt = "+byt);
		System.out.println("value at Short s = "+s);
		System.out.println("value at Charater c = "+c);
		System.out.println("value at Integer i = "+i);
		System.out.println("value at Long l = "+l);
		System.out.println("value at Float f = "+f);
		System.out.println("value at Double d = "+d);
		System.out.println("value at Boolean b = "+b);
	}
	void unboxing()
	{
		/** Unboxing denots convertion of object of wrapper class to its corresponding primitive data type
		 */
		
		Byte byt = new Byte((byte)(100));
		byte byt1= byt;
		Short s = new Short((short) 288);
		short s1=s;
		Character c ='K';
		char c1=c;
		Integer i=new Integer(12);
		int i1=i;
		Long l= new Long(5228);
		long l1=l;
		Float f = 78.9f;
		float f1=f;
		Double d= new Double(228.456);
		double d1=d;
		Boolean b=true;
		boolean b1=b;
		System.out.println("\nUNBOXING");
		System.out.println("---------");
		System.out.println("value at byte byt1 = "+byt1);
		System.out.println("value at short s1 = "+s1);
		System.out.println("value at char c1 = "+c1);
		System.out.println("value at int i1 = "+i1);
		System.out.println("value at long l1 = "+l1);
		System.out.println("value at float f1 = "+f1);
		System.out.println("value at double d1 = "+d1);
		System.out.println("value at boolean b1 = "+b1);
		
	}

}
public class Experiment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxingUnboxing ob = new BoxingUnboxing();
		ob.boxing();
		ob.unboxing();
	}

}
