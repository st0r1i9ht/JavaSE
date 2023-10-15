package JavaSE3_OOPAdvanced.A4_final.f4_Exercise;

public class Test
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(5.0);
		System.out.println(circle.area());
	}
}

class Circle
{
	private double radius;
	//1.
	private final double PI = 3.14;
	public Circle(double radius)
	{
		this.radius = radius;
		// 2.
		// PI = 3.14;
	}

	//3.
	// {
	// 	PI = 3.14;
	// }

	public double area()
	{
		return PI * Math.pow(radius, 2);
	}
}