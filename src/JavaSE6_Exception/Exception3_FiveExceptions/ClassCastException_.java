package JavaSE6_Exception.Exception3_FiveExceptions;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ClassCastException_
{
	// 类型转换异常
	public static void main(String[] args)
	{
		A b = new B();// 向上转型
		B b2 = (B) b;// 向下转型
		C c2 = (C) b;// 抛出ClassCastException
	}
}

class A
{

}

class B extends A
{

}

class C extends A
{

}