/* Experiment 8-Modify the -"distance" class by creating constructor for assigning values(feet and inches)to the distance object.Create 
 * another object and assign second object as reference variable to another object reference variable.Further create a third object which
 * is a clone of the first object
 */
/*
 * written by:kshirabdi
 * date:08-05-2023
 */


package javapractical;

class DistanceClass
{
	
	int feet,inches;
	DistanceClass(int feet,int inches)  //constructor that will accept integet as agguments
	{
		this.feet=feet;
		this.inches=inches;
	}
	DistanceClass(DistanceClass d)      //construction that will accept reference as argument
	{
		this.feet=d.feet;
		this.inches=d.inches;
	}
	void show()
	{
		System.out.println(feet+" feet = "+inches+" inches..");
	}
}
public class Experiment8 {

	public static void main(String[] args) {

		DistanceClass distance1= new DistanceClass(1,12);   //creating first object
		DistanceClass distance2=new DistanceClass(2,24);   //creating 2nd object
		DistanceClass distance3=new DistanceClass(distance2); //creating an object and assigning the second object as a reference
		DistanceClass distance4=distance1;               //creating clone of first object
		distance1.show();
		distance2.show();
		distance3.show();
		distance4.show();

	}

}
