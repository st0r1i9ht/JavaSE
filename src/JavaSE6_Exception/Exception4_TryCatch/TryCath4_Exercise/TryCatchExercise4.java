package JavaSE6_Exception.Exception4_TryCatch.TryCath4_Exercise;

import java.util.Scanner;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class TryCatchExercise4
{
	public static void main(String[] args)
	{
		// 如果用户输入的不是一个整数 就提示他反复输入 直到输入一个整数为止
		// 1. 创建Scanner对象
		// 2. 使用无限循环 接收输入
		// 3. 将输入的值转换成int
		// 4. 转换时抛出异常 说明输入的内容不是一个可以转换成int的内容
		// 5. 如果没有抛出异常 则break
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		String inputStr = "";
		while (true)
		{
			System.out.println("输入一个整数:");
			inputStr = scanner.next();
			try
			{
				num = Integer.parseInt(inputStr); // 可能抛出异常
				break;
			}
			catch (NumberFormatException e)
			{
				System.out.println("你输入的不是一个整数:");
			}
		}
		System.out.println("你输入的值是:" + num);
	}
}