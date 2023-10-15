package JavaSE3_OOPAdvanced.A8_InnerClass.InnerClass1;

public class InnerClass//外部其他类
{
	public static void main(String[] args)
	{

	}
}

/*
	类的五大成员
	属性 方法 构造器 代码块 内部类
	底层源码有大量内部类
	内部类分类
	定义在外部类的局部位置 例如方法
	1.局部内部类 有类名
	2.匿名内部类 没有类名
	定义在外部类的成员位置
	1.成员内部类 没有static
	2.静态内部类 有static
 */

class Outer//外部类
{
	private int n1 = 100;

	public Outer(int n1)
	{
		this.n1 = n1;
	}

	public void m1()
	{
		System.out.println("Outer m1");
	}

	{
		System.out.println("CodeBlock");
	}

	class Inner //内部类
	{

	}
}