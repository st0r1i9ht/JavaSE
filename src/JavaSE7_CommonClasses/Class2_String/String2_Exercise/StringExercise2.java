package JavaSE7_CommonClasses.Class2_String.String2_Exercise;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringExercise2
{
	public static void main(String[] args)
	{
		// 学会看源码
		// 字符串常量相加 创建1个对象 字符串引用相加 创建3个对象
		String a = "hello";// 创建a对象 1
		String b = "abc";// 创建b对象 2
		// 1. 先创建StringBuilder sb = StringBuilder() 堆
		// 2. 执行sb.append("hello"); 池
		// 3. sb.append("abc"); 池
		// 4. String c = sb.toString() 堆 3
		// 最后是c指向堆中的对象(String) value[] -> 池中"helloabc"
		String c = a + b;
	}
}