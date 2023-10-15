package JavaSE6_Exception.Exception4_TryCatch.TryCath4_Exercise;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class TryCatchExercise1
{
	// 输出什么?
	public static void main(String[] args)
	{
		System.out.println(method());
	}

	public static int method()
	{
		try
		{
			String[] names = new String[3];
			if (names[1].equals("tom")) // NullPointerException
			{
				System.out.println(names[1]);
			}
			else
			{
				names[3] = "hello";
			}
			return 1;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			return 2;
		}
		catch (NullPointerException e)
		{
			return 3;
		}
		finally // 必须执行
		{
			return 4;
		}
	}
}
