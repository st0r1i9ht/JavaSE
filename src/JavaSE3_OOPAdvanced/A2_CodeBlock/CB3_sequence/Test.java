package JavaSE3_OOPAdvanced.A2_CodeBlock.CB3_sequence;

public class Test
{
	public static void main(String[] args)
	{
		/**
		 * 类属性初始化优先级
		 * 优先级一样 按顺序调用
		 * 1. 静态属性和静态代码块初始化
		 * 2. 普通属性和普通代码块初始化
		 * 3. 构造器
		 */
		A a = new A();

	}
}

class A
{
	private int n2 = getN2();

	{
		System.out.println("A codeblock");
	}

	private static int n1 = getN1();

	static
	{
		System.out.println("A static codeblock");
	}

	public static int getN1()
	{
		System.out.println("getN1()");
		return 100;
	}

	public int getN2()
	{
		System.out.println("getN2()");
		return 0;
	}

	public A()
	{
		System.out.println("constructor A()");
	}

}
