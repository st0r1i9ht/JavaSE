package JavaSE6_Exception.Exception4_TryCatch.TryCath3;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class TryCatch3
{
	// try-finally 配合使用 这种用法相当于没有捕获异常 执行finally之后 程序会直接崩溃
	// 没有处理异常 异常抛给JVM JVM处理会直接报错
	// 应用场景 执行一段代码 不管是否发生异常 都必须执行某个业务逻辑 finally
	public static void main(String[] args)
	{
		try
		{
			int n1 = 10;
			int n2 = 0;
			System.out.println(n1 / n2);
		}
		finally // 会执行
		{
			System.out.println("finally");
		}
		System.out.println("程序继续"); // 不会执行
	}
}
