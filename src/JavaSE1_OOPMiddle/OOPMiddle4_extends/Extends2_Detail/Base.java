package JavaSE1_OOPMiddle.OOPMiddle4_extends.Extends2_Detail;

public class Base
{
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;

	public Base()
	{
		System.out.println("Base()");
	}

	public int getN4()
	{
		return n4;
	}

	public void test100()
	{
		System.out.println("test100");
	}

	protected void test200()
	{
		System.out.println("test200");
	}

	void test300()
	{
		System.out.println("test300");
	}

	private void test400()
	{
		System.out.println("test400");
	}

	public void callTest400()
	{
		test400();
	}
}