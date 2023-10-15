package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly2_PolyMethod;

public class Poly
{
	public static void main(String[] args)
	{
		//重载多态
		A a = new A();
		System.out.println(a.sum(10, 20));
		System.out.println(a.sum(10, 20, 30));

		//重写多态
		B b = new B();
		a.say();
		b.say();
	}
}

class B
{
	public void say()
	{
		System.out.println("B.say() active");
	}
}

class A extends B
{
	public int sum(int n1, int n2)
	{
		return n1 + n2;
	}

	public int sum(int n1, int n2, int n3)
	{
		return n1 + n2 + n3;
	}

	public void say()
	{
		System.out.println("A.say() active");
	}
}
