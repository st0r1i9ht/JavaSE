package JavaSE3_OOPAdvanced.A1_static.Static2_method;

/*
 * 类方法
 * 方法不涉及和对象相关的成员，设计成静态方法提高开发效率 Math.sqrt();
 * 开发工具类时，可以将方法做成静态的，方便调用
 */
public class Test
{
	public static void main(String[] args)
	{
		Stu tom = new Stu("tom");
		tom.payFee(100);
		Stu marry = new Stu("marry");
		marry.payFee(200);

		Stu.showFee();
	}
}

class Stu
{
	private String name;
	public static double fee;

	public Stu(String name)
	{
		this.name = name;
	}

	public void payFee(double Fee)
	{
		Stu.fee += Fee;
	}

	public static void showFee()
	{
		System.out.println(Stu.fee);
	}
}

class A
{
	private int n1;//非静态字段
	public static int n2;

	//非静态方法
	public void m()
	{

	}

	public static void m1()
	{
		// 静态方法中不允许使用和对象有关的关键字this super
		//System.out.println(this.n1);
	}

	public static void m2()
	{
		// 静态方法中只能访问静态变量或静态方法
		System.out.println(n2);
		System.out.println(A.n2);
		m1();
		//m();
	}

	public void m3()
	{
		//非静态方法，既可以访问非静态成员也可以访问静态成员
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(A.n2);
		m1();
		m();
	}
}