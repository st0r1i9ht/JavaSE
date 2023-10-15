package JavaSE3_OOPAdvanced.A2_CodeBlock.CB2_staticCB;

public class Test
{
	public static void main(String[] args)
	{
		// 静态代码块在类加载时调用 类只会加载一次静态代码块只会被调用一次
		// 普通代码块在类创建时被调用
		// 静态代码块被加载的情况
		// 1. 创建实例对象时
		// B b = new B();
		// 2. 创建子类对象时 父类父类先被加载 子类后被加载
		// A a1 = new A();
		// 3. 使用类的静态成员时（静态成员，静态方法）
		// System.out.println(Cat.n1);

		// 普通代码块在创建对象实例时会被隐式调用
		// 被创建一次，就会调用一次
		// 如果只是使用类的静态成员，普通代码块并不会执行
		// D d = new D();
		// D d1 = new D();

		System.out.println(D.n1);
	}
}

class D
{
	public static int n1;
	static
	{
		System.out.println("D static Codeblock active");
	}

	{
		System.out.println("D Codeblock active");
	}
}

class Animal
{
	static
	{
		System.out.println("Animal static Codeblock active");
	}
}

class Cat extends Animal
{
	public static int n1 = 999;

	static
	{
		System.out.println("Cat static codeblock active");
	}
}

class B
{
	static
	{
		System.out.println("B Codeblock active");
	}
}

class A extends B
{
	static
	{
		System.out.println("A Codeblock active");
	}
}