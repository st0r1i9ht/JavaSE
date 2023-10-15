package JavaSE3_OOPAdvanced.A4_final.f2_Detail;

/*
 * final关键字使用细节
 * 1. final修饰的属性又叫常量 一般用XX_XX_XX来命名
 * 2. final修饰的属性在定义时必须赋初值 并且以后不能再修改
 *      赋值位置
 *      1. 定义时 public final double TAX_RATE = 0.08;
 *      2. 构造器
 *      3. 代码块
 * 3. final修饰静态属性时初始化位置受限
 *      赋值位置
 *      1. 定义时
 *      2. 静态代码块
 *      不能在构造器赋值
 * 4. final类可以实例化对象 不能继承
 * 5. 类不是final类 含有final方法 该方法不能重写 可以继承
 */
public class Test
{
	public static void main(String[] args)
	{
		C c = new C();
		new E().cal();
	}
}

class A
{
	public final double TAX_RATE = 0.08;

	public final double TAX_RATE2;
	public final double TAX_RATE3;

	public A()
	{
		this.TAX_RATE2 = 0.09;
	}

	{
		TAX_RATE3 = 0.1;
	}
}

class B
{
	public static final double TAX_RATE = 0.08;
	public static final double TAX_RATE1;

	static
	{
		TAX_RATE1 = 0.09;
	}
}

final class C
{

}

class D
{
	public final void cal()
	{
		System.out.println("cal()");
	}
}

class E extends D
{

}