package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly5_DynamicBinding;

public class A
{
	public int i = 10;

	public int sum()
	{
		return getI() + 10;
	}

	public int sum1()
	{
		return i + 10;
	}

	public int getI()
	{
		return i;
	}
}