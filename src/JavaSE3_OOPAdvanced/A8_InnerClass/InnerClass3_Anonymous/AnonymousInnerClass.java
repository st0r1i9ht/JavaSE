package JavaSE3_OOPAdvanced.A8_InnerClass.InnerClass3_Anonymous;

/*
	匿名内部类
 */

public class AnonymousInnerClass
{
	public static void main(String[] args)
	{
		//传统实现方法
		Tiger tiger = new Tiger();
		Dog dog = new Dog();
		tiger.cry();
		dog.cry();

		Outer outer = new Outer();
		outer.method();
	}
}

class Outer
{
	private int n1 = 10;

	public void method()
	{
		//基于接口的匿名内部类
		//1.想使用接口IA 并创建对象
		//2.传统方式 类实现接口 创建对象
		//3.接口实现类只需求一次 定义一个类冗余
		//4.使用匿名内部类简化开发

		//底层源码
		//class Outer$1 implements IB
		//{
		//	@Override
		//	public void cry()
		//	{
		//		System.out.println("Tiger cry");
		//	}
		//}
		//5.jdk底层在创建匿名内部类Outer$1 同时创建Outer$1实例 并把地址返回给引用
		IB tiger = new IB()
		{
			@Override
			public void cry()
			{
				System.out.println("Tiger cry");
			}
		};

		System.out.println("tiger的运行类型 " + tiger.getClass());
		tiger.cry();

		//基于类的匿名内部类
		//参数会传递给构造器
		Father father = new Father("name")
		{
			@Override
			public void test()
			{
				System.out.println("Override test");
			}
		};
		System.out.println(father.getClass());
		father.test();

		//基于抽象类的匿名内部类
		//抽象类的匿名内部类要实现全部抽象方法
		Animal animal = new Animal()
		{
			@Override
			void eat()
			{
				System.out.println("animal eat");
			}
		};
		animal.eat();
	}
}


//传统实现方法
interface IB
{
	void cry();
}

class Tiger implements IB
{
	@Override
	public void cry()
	{
		System.out.println("Tiger cry");
	}
}

class Dog implements IB
{
	@Override
	public void cry()
	{
		System.out.println("Dog cry");
	}
}

class Father
{
	public Father(String name)
	{
		System.out.println(name);
	}

	public void test()
	{

	}

	@Override
	public String toString()
	{
		return super.toString();
	}
}

abstract class Animal
{
	abstract void eat();
}