package JavaSE3_OOPAdvanced.A5_abstract.a3_Detail1;

public class Test
{
	public static void main(String[] args)
	{

	}
}

// 抽象方法不能使用private final 和 static 来修饰 因为这些关键字都是和重写相违背的
abstract class H
{
	 //public final abstract void hi();
}


// 如果一个类继承了抽象类 则它必须实现抽象类的所有抽象方法 除非他自己也声明为abstract类
abstract class B
{
	public abstract void hi();
}

//演示 声明为抽象类 或实现方法
abstract class C extends B
{
	// @Override
	// public void hi()
	// {
	//
	// }
}

// 抽象类本质还是类
abstract class A
{
	public int n1 = 10;
	public static String name = "name";
	public void hi()
	{
		System.out.println("hi()");
	}
	public abstract void hello();
	public static void ok()
	{
		System.out.println("ok()");
	}
}