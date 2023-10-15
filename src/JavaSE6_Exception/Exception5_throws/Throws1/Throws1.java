package JavaSE6_Exception.Exception5_throws.Throws1;

import java.io.FileInputStream;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Throws1
{
	public static void main(String[] args)
	{

	}

	public void f1() throws Exception
	{
		// 创建了一个文件流对象
		// 1. 这里的异常是一个FileNotFoundException 编译异常 必须处理
		// 2. 使用try-catch-finally
		// 3. 使用throws, 抛出异常, 让调用f1方法的调用者(方法)处理
		// 4. throws后面的异常类型可以是方法中产生的异常类型 也可以是它的父类
		// 5. throws 关键字后也可以是 异常列表 即可以抛出多个异常
		FileInputStream fis = new FileInputStream("d://aa.txt");
	}
}
