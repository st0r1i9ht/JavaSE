package JavaSE6_Exception.Exception4_TryCatch.TryCath2;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class TryCatch2
{
	public static void main(String[] args)
	{
		// 1. 如果try 代码块有可能有多个异常
		// 2. 可以使用多个catch 分别捕获不同的异常 相应处理 捕获最先抛出的异常 只捕获一个异常
		// 3. 要求子类异常写在前面 父类异常写在后面 父类异常全部捕获了 后面写子类异常没有意义 会报错
		try
		{
			Person person = new Person();
			// person = null;
			System.out.println(person.getName());// NullPointerException
			int n1 = 10;
			int n2 = 0;
			int res = n1 / n2;// ArithmeticException
		}
		catch (NullPointerException e)
		{
			System.out.println("NullPointer" + e.getMessage());
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic" + e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("Exception" + e.getMessage());
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("程序继续");
	}
}

class Person
{
	private String name = "name";

	public String getName()
	{
		return name;
	}
}
