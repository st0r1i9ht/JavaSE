package JavaSE6_Exception.Exception4_TryCatch.TryCath4_Exercise;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class TryCatchExercise3
{
	public static void main(String[] args)
	{
		System.out.println(method());
	}

	public static int method()
	{
		int i = 1;
		try
		{
			i++; // i = 2
			String[] names = new String[3];
			if (names[1].equals("tom"))
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
			return ++i; // i = 3 =>保存临时变量temp=3 返回temp
		}
		finally
		{
			++i; // i = 4
			System.out.println("i=" + i);
		}
	}
}