package JavaSE7_CommonClasses.Class1_Wrapper.wrapper2_Exercise1;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class WrapperExercise1
{
	// 非常经典的面试题
	// 自动提升原则 表达式结果的类型自动提升为操作数中最大的的类型
	public static void main(String[] args)
	{
		Double d = 100d;
		Float f = 1.5f;

		Object obj1 = true? new Integer(1) : new Double(2.0);
		System.out.println(obj1);

		Object obj2;
		if (true)
			obj2 = new Integer(1);
		else
			obj2 = new Double(2.0);
		System.out.println(obj2);
	}
}