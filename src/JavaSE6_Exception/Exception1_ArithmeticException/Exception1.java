package JavaSE6_Exception.Exception1_ArithmeticException;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
/*
异常快速入门
 */
public class Exception1
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 0;
		// int res = num1 / num2;
		// 1. num1 / num2 => 10 / 0
		// 2. num2 = 0 程序抛出异常 ArithmeticException 数学运算异常
		// 3. 抛出异常后 程序退出 崩溃了 下面代码不再执行
		// 4. 不应该出现一个不算致命的问题就导致整个系统崩溃
		// 5. java提供 异常处理机制 来解决问题
		// 如果开发者认为一段代码可能出现异常/问题 可以使用try-catch异常处理机制来解决
		// 从而保证程序的健壮性
		// 选中代码块 ctrl + alt + t -> try-catch
		// 6. 如果进行异常处理， 那么即使出现了异常， 程序可以继续执行
		try
		{
			int res = num1 / num2;
		}
		catch (Exception e)
		{
			// e.printStackTrace();
			System.out.println(e.getMessage());// 输出异常信息
		}
		System.out.println("Progress Continue");
	}
}
