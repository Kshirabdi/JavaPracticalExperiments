package javapractical2;

public class Parent2 {
	
	void show1()
	{
		System.out.println("package2(another package)->parent2->default method called");
	}
	protected void show2()
	{
		System.out.println("package2(another package)->parent2->protected method called");
	}
	public void show3()
	{
		System.out.println("package2(another package)->parent2->public method called");
	}
	@SuppressWarnings("unused")
	private void show4()
	{
		System.out.println("package2(another package)->parent2->private method called");
	}

}
