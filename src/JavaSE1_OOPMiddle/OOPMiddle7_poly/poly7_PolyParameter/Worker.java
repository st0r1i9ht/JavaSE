package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly7_PolyParameter;

public class Worker extends Employee
{
	public Worker(String name, double salary)
	{
		super(name, salary);
	}

	public void work()
	{
		System.out.println(getName() + " " + "working");
	}

	@Override
	public double getAnnual()
	{
		return super.getAnnual();
	}
}
