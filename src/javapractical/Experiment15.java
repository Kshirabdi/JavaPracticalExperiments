/*Write a program that creates illustrates different level of protection in classes /sub classes belonging to same package or different
 * packages.
 * written by:kshirabdi
 * date:12-05-2023
 */

package javapractical;

import javapractical2.Parent2;

/**creating a parent class having data members and methods in private,default,protected and public access specifiers.
 * @author swain
 */

class Parent1
{
	void p1Show1()
	{
		System.out.println("package1(same package)->parent1->default method called");
	}
	protected void p1Show2()
	{
		System.out.println("package1(same package)->parent1->protected method called");
	}
	public void p1Show3()
	{
		System.out.println("package1(same package)->parent1->public method called");
	}
	@SuppressWarnings("unused")
	private void p1Show4()
	{
		System.out.println("package1(same package)->parent1->private method called");
	}
	
}

/**Creating another class names SubClass1 which will derived from the parent class with in the same package.
 */

class SubClass1 extends Parent1
{
	void AccessParent1()
	{
		super.p1Show1();
		super.p1Show2();
		super.p1Show3();
//		super.p1Show4();compilation error : The method show4() from the type Parent is not visible
	}
	

}

/**Creating another class names SubClass2 which will derived from the parent class in different package.
 */

class SubClass2 extends Parent2
{
	void AccessParent2()
	{
		//super.show1();compilation error : The method show1() from the type Parent2 is not visible
		super.show2();
		super.show3();
		//super.Show4();compilation error : The method Show4() is undefined for the type Parent2
	}
}
public class Experiment15 {

	public static void main(String[] args) {
		SubClass1 sc1=new SubClass1 ();
		sc1.AccessParent1();
		SubClass2 sc2=new SubClass2 ();
		sc2.AccessParent2();
		@SuppressWarnings("unused")
		Parent2 p2 = new Parent2();
		//p2.show2();c.e->The method show2() from the type Parent2 is not visible
	}

}
