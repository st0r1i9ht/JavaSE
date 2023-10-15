package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly4_PolyDetail;

public class PolyDetail03
{
	/*
	 * A instanceof B 比较操作符 判断对象A的运行类型是否为B子类型
	 */
	public static void main(String[] args)
	{
		BB bb = new BB();
		System.out.println((bb instanceof BB) + " " + (bb instanceof AA));

		AA aa = new BB();
		System.out.println((aa instanceof AA) + " " + (aa instanceof BB));

		Object obj = null;
		String str = "";
		System.out.println((obj instanceof AA) + " " + (str instanceof Object));
	}
}

class AA
{

}

class BB extends AA
{

}
