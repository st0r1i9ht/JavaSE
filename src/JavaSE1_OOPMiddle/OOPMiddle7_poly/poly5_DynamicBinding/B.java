package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly5_DynamicBinding;

public class B extends A
{
	public int i = 20;
	int age = 2;

	public int sum()
	{
		return i + 20;
	}

	public int getI()
	{
		return i;
	}

	public int sum1()
	{
		return i + 10;
	}
}