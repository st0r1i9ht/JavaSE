package JavaSE3_OOPAdvanced.A2_CodeBlock.CB5_Detail4;

public class Test
{
	public static void main(String[] args)
	{
		new B();
		new C();
	}
}

class C
{
	private int n1 = 100;
	private static int n2 = 200;

	private void m1()
	{

	}

	private static void m2()
	{

	}

	static
	{
		// 静态代码块 只能调用静态成员
		// System.out.println(n1);
		System.out.println(n2);
		// m1();
		m2();
	}

	{
		// 普通代码块 可以使用任意成员
		System.out.println(n1);
		System.out.println(n2);
		m1();
		m2();
	}
}

class A
{
	private static int n1 = getVal01();

	static
	{
		System.out.println("A static codeblock1");
	}

	{
		System.out.println("A code block1");
	}

	public int n3 = getVal02();

	public static int getVal01()
	{
		System.out.println("A getVal01");
		return 0;
	}

	public int getVal02()
	{
		System.out.println("A getVal02");
		return 0;
	}

	public A()
	{
		System.out.println("A A()");
	}
}

class B extends A
{
	private static int n1 = getVal01();

	static
	{
		System.out.println("B static codeblock1");
	}

	{
		System.out.println("B codeblock1");
	}

	public int n2 = getVal02();

	public static int getVal01()
	{
		System.out.println("B getVal01");
		return 0;
	}

	public int getVal02()
	{
		System.out.println("B getVal02");
		return 0;
	}

	public B()
	{
		System.out.println("B B()");
	}
}