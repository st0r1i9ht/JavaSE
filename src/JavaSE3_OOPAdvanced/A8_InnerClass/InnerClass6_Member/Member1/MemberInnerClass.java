package JavaSE3_OOPAdvanced.A8_InnerClass.InnerClass6_Member.Member1;

public class MemberInnerClass
{
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.f1();

		//外部其他类访问成员内部类
		//方式1 外部其他类的外部类.内部类 = 外部类引用.new 内部类()
		Outer.Inner inner = outer.new Inner();
		inner.say();
		//方式2 外部类中提供一个方法返回内部类引用
		Outer.Inner inner1 = outer.getInnerInstance();
		inner1.say();
		//方式3 外部类对象.内部类对象
		new Outer().new Inner();
	}
}

//外部类
class Outer
{
	private int n1 = 10;
	public String name = "name";

	private void hi()
	{
		System.out.println("Outer private hi");
	}

	//成员内部类
	//1.可以添加任意 访问修饰符
	//2.作用域为外部类体
	//3.在外部类的成员方法中创建对象实例后调用
	//4.成员内部类 直接访问 外部类成员
	//5.外部类 访问成员内部类 创建对象访问
	//6.外部其他类 访问成员内部类三种方法
	class Inner
	{
		private int n1 = 1;
		private double sal = 99.9;

		//成员内部类成员和外部类成员重名 遵守就近原则
		//可以通过 外部类名.this.成员 访问外部类成员
		public void say()
		{
			//可以直接访问外部类的所有成员 包括私有成员
			System.out.println(n1 + " " + name + " " + Outer.this.n1);
		}
	}

	public void f1()
	{
		Inner inner = new Inner();
		inner.say();
		System.out.println(inner.sal);
	}

	public Inner getInnerInstance()
	{
		return new Inner();
	}
}