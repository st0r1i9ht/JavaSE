package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly4_PolyDetail;

public class PolyDetail02
{
	public static void main(String[] args)
	{
		// 属性没有重写 属性的值看编译类型
		Base base = new Sub();
		System.out.println(base.count);
	}
}

class Base
{
	int count = 10;
}

class Sub extends Base
{
	int count = 20;
}