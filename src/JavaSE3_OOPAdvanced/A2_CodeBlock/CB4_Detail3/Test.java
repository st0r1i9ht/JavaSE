package JavaSE3_OOPAdvanced.A2_CodeBlock.CB4_Detail3;

public class Test
{
	public static void main(String[] args)
	{
		new B();
	}
}

class A
{
	public A()
	{
		super();
		System.out.println("A constructor");
	}
	{
		System.out.println("A codeblock");
	}
	static
	{
		System.out.println("A static codeblock");
	}

}

class B extends A
{
	{
		System.out.println("B codeblock");
	}
	public B()
	{
		System.out.println("B constructor");
	}
}