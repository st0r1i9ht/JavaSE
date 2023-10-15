package JavaSE6_Exception.Exception7_ThrowException;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ThrowException
{
	public static void main(String[] args)
	{
		try
		{
			methodA();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		methodB();
	}

	static void methodA()
	{
		try
		{
			System.out.println("进入方法A");
			throw new RuntimeException("制造异常");
		}
		finally
		{
			System.out.println("用A方法的finally");
		}
	}

	static void methodB()
	{
		try
		{
			System.out.println("进入方法B");
			return;
		}
		finally // 优先于return执行 return结束方法 但finally一定要执行
		{
			System.out.println("调用方法B的finally");
		}
	}
}