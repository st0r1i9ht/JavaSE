package JavaSE6_Exception.Exception3_FiveExceptions;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class NumberFormatException_
{
	// 数字格式不正确异常
	public static void main(String[] args)
	{
		String name = "HelloWorld";

		int num = Integer.parseInt(name);
		System.out.println(num);
	}
}
