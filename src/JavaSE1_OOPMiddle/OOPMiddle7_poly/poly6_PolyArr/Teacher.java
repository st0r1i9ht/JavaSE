package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly6_PolyArr;

public class Teacher extends Person
{
	private double salary;

	public Teacher(String name, int age, double salary)
	{
		super(name, age);
		this.salary = salary;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	@Override
	public String show()
	{
		return super.show() + " " + salary;
	}

	public void teach()
	{
		System.out.println(getName() + " " + "teach");
	}
}