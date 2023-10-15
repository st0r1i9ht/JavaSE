package JavaSE3_OOPAdvanced.A8_InnerClass.InnerClass4_AnonymousDetail;


public class AnonymousInnerClassDetail
{
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.f1();
		System.out.println(outer);
	}
}

class Outer
{
	private int n1 = 99;

	public void f1()
	{
		//匿名内部类
		//不能添加访问修饰符 地位仅仅是局部变量
		//作用域仅在局部范围
		//外部其他类不能访问匿名内部类
		//外部类和匿名内部类重名 遵循就近原则 访问时使用 外部类名.this.成员
		Person p = new Person()
		{
			private int n1 = 100;
			@Override
			public void hi()
			{
				//可以直接访问外部类的所有成员包括私有的
				System.out.println("Anonymous hi " + Outer.this.n1);
				System.out.println(Outer.this);
			}
		};
		p.hi();//动态绑定 调用运行类型

		//直接调用 匿名内部类返回对象
		new Person()
		{
			@Override
			public void hi()
			{
				System.out.println("Anonymous hi 1");
			}

			@Override
			public void ok(String str)
			{
				super.ok(str);
			}
		}.ok("str");
	}
}

class Person
{
	public void hi()
	{
		System.out.println("Person hi");
	}

	public void ok(String str)
	{
		System.out.println("Person ok " + str);
	}
}