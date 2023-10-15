package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly5_DynamicBinding;

public class DynamicBinding
{
	/* 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
	 * 属性没有动态绑定机制 哪里声明哪里使用
	 */
	public static void main(String[] args)
	{
		A a = new B();
		System.out.println(a.sum());
		System.out.println(a.sum1());
		a = new A();
		System.out.println(a.sum());
		System.out.println(a.sum1());
	}
}
