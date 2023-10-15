package JavaSE3_OOPAdvanced.A6_Interface.Interface2;

public interface IA
{
	// 写属性
	public int n1 = 10;
	// 写方法
	// 接口中抽象方法可以省略abstract关键字
	public void hi();
	// jdk8后 可以有默认实现方法 需要使用default关键字修饰
	default public void ok()
	{
		System.out.println("ok()");
	}

	// jdk8以后 可以有静态方法
	public static void cry()
	{
		System.out.println("IA cry");
	}
}