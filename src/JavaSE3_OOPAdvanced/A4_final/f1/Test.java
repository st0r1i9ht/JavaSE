package JavaSE3_OOPAdvanced.A4_final.f1;

public class Test
{
	public static void main(String[] args)
	{
		// E e = new E();
		// e.TAX_RATE = 0.09;
	}
}

/*
 * 1
 * 如果我们要求A类不能被其它类继承
 * 可以使用final修饰
 */
final class A
{

}

// class B extends A
// {
//
// }

/*
 * 2
 * 如果我们要求父类方法不能被子类重写
 * 可以使用final修饰父类方法
 */
class C
{
	public final void hi()
	{

	}
}

// class D extends C
// {
// 	@Override
// 	public void hi()
// 	{
// 		super.hi();
// 	}
// }

/*
 * 3
 * 当不希望类的某个属性值被修改可以使用final修饰
 */
class E
{
	public final double TAX_RATE = 0.08;
}

/*
 * 4
 * 当不希望某个局部变量被修改可以使用final修饰
 */
class F
{
	public void cry()
	{
		final double NUM = 0.01;
		// NUM = 0.9;
		System.out.println(NUM);
	}
}