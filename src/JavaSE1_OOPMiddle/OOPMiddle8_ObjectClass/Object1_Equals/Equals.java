package JavaSE1_OOPMiddle.OOPMiddle8_ObjectClass.Object1_Equals;

public class Equals
{
	public static void main(String[] args)
	{
		/*
		 * == 比较运算符
		 * 判断基本数据类型值是否相等
		 * 判断引用类型地址是否相等
		 * 相同的引用类型会被自动池化 指向相同的地址
		 */
		A a = new A();
		A b = a;
		A c = b;
		System.out.println(a == c);// true
		System.out.println(b == c);// true
		B bObj = a;// 指向对象相同
		System.out.println(bObj == c);

		"hello".equals("abc");

	// 	public boolean equals (Object anObject){
	// 	if (this == anObject)
	// 	{
	// 		return true;
	// 	}
	// 	if (anObject instanceof String)
	// 	{
	// 		String anotherString = (String) anObject;
	// 		int n = value.length;
	// 		if (n == anotherString.value.length)
	// 		{
	// 			char v1[] = value;
	// 			char v2[] = anotherString.value;
	// 			int i = 0;
	// 			while (n-- != 0)
	// 			{
	// 				if (v1[i] != v2[i])
	// 					return false;
	// 				i++;
	// 			}
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }

	}

}

class B
{

}

class A extends B
{

}
