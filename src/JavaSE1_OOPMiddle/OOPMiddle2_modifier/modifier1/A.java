package JavaSE1_OOPMiddle.OOPMiddle2_modifier.modifier1;

//访问修饰符 访问权限 可见性
// public 同类 同包 子类 不同包
// protected 同类 同包 子类
// 默认 同类 同包
// private 同类

public class A
{
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;

	public void m1()
	{
		// 该方法可以访问 四个属性
		// 同类
		System.out.println("n1=" + n1 + "n2=" + n2 + "n3=" + n3 + "n4=" + n4);
	}
}