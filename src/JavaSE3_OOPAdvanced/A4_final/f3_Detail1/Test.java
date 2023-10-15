package JavaSE3_OOPAdvanced.A4_final.f3_Detail1;

/*
 * final不能修饰构造器
 * Integer等包装类, String类是final类 不能被继承
 */
public class Test
{
	public static void main(String[] args)
	{
		System.out.println(B.num);
	}
}

final class A
{
	// final类不可继承 没必要再用final修饰方法防止重写
	public void cry()
	{

	}
}

//final和static搭配使用 往往效率更高 不会导致类加载 底层编译器做了优化
class B
{
	public final static int num = 100;
	static
	{
		System.out.println("B static codeblock");
	}
}