package JavaSE3_OOPAdvanced.A8_InnerClass.InnerClass7_Static.Static1;

public class StaticInnerClass
{
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.m1();
		//外部其他类 访问 静态内部类
		//方式1 静态内部类 可以直接通过类名访问
		Outer.Inner inner = new Outer.Inner();
		inner.say();
		//方式2 提供一个方法返回静态内部类对象实例
		//外部类对象调用外部类非静态方法
		Outer.Inner inner1 = outer.getInnerInstance();
		inner1.say();
		//外部类名调用外部类静态方法
		Outer.Inner inner2 = Outer.staticGetInnerInstance();
		inner2.say();
	}
}

class Outer
{
	private int n1 = 10;
	private static String name = "name";

	private static void cry()
	{
	}

	//静态内部类
	//1.外部类的成员
	//2.使用static修饰
	//3.可以直接访问外部类的静态成员 包括私有成员 不能访问非静态成员
	//4.可以添加任意 访问修饰符
	//5.作用域与其他成员相同 整个类体
	//6.静态内部类 直接访问 外部类静态成员
	//7.外部其他类 访问 静态内部类 两种方式
	//8.外部类和静态内部类成员重名 静态内部类访问时 遵守就近原则 访问外部类成员 使用 外部类名.成员
	static class Inner
	{
		private String name = "innerName";

		public void say()
		{
			System.out.println(name);
			cry();
			System.out.println(Outer.name);
		}
	}

	public void m1()
	{
		Inner inner = new Inner();
		inner.say();
	}

	public Inner getInnerInstance()
	{
		return new Inner();
	}

	public static Inner staticGetInnerInstance()
	{
		return new Inner();
	}
}