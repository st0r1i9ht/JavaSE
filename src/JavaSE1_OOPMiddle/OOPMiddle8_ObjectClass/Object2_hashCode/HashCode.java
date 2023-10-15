package JavaSE1_OOPMiddle.OOPMiddle8_ObjectClass.Object2_hashCode;

public class HashCode
{
	/*
	 * 对象一样 返回哈希码值一样
	 * 哈希码值不是地址 是根据内存地址生成的一段数字
	 */
	public static void main(String[] args)
	{
		A a = new A();
		A a1 = new A();
		A a3 = a;

		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a3.hashCode());
	}
}

class A
{

}