package JavaSE6_Exception.Exception4_TryCatch.TryCath1;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class TryCatch1
{
	public static void main(String[] args)
	{
		// 1. 如果异常发生 异常发生后的代码不会执行 直接进入到catch
		// 2. 如果异常没有发生 顺序执行try的代码块 不会进入catch
		// 3. 无论是否发生异常 finally都会执行
		try
		{
			String str = "Hello";
			int a = Integer.parseInt(str);
			System.out.println(a);
		}
		catch (NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("Progress Continue");
	}
}
