package JavaSE3_OOPAdvanced.A8_InnerClass.InnerClass2_Local.LocalInnerClass;

/*
	局部内部类使用
	外部其他类不能访问局部内部类
 */
public class LocalInnerClass// 外部其他类
{
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.m1();
	}
}

class Outer// 外部类
{
	private int n1 = 100;

	private void m2()
	{
		System.out.println("Outer m2");
	}

	public Outer()
	{

	}

	public void m1()// 方法
	{
		// 1.局部内部类定义在外部类的局部位置 通常是方法
		// 2.不能添加访问修饰符 地位仅仅是局部变量 但是可以使用final修饰 修饰后不可被继承
		// 3.作用域在局部位置内
		class Inner// 局部内部类
		{
			private int n1 = 800;

			// 4.局部内部类可以直接访问外部类的所有成员 包含私有成员
			public void f1()
			{
				System.out.println("n1=" + n1);
				m2();

				// 外部类和局部内部类成员重名 遵循就近原则 想访问外部类成员 使用 外部类名.this.成员
				// Outer.this本质是外部类的对象
				System.out.println(Outer.this.n1);
			}
		}

		class Inner1 extends Inner// 继承局部内部类
		{

		}

		// 5.外部类在方法中创建内部类对象调用内部类成员
		Inner inner = new Inner();
		inner.f1();
	}

	{// 代码块
		class Inner2
		{

		}
	}
}