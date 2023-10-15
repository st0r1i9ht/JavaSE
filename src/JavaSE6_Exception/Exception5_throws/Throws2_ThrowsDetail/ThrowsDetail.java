package JavaSE6_Exception.Exception5_throws.Throws2_ThrowsDetail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ThrowsDetail
{
	public static void main(String[] args)
	{

	}

	public static void f2() /* throws ArithmeticException */
	{
		// 1. 对于编译异常 程序中必须处理 比如try-catch 或者throws
		// 2. 对于运行时异常 程序中如果没有处理 默认就是throws的方式处理
		int n1 = 10;
		int n2 = 0;
		double res = n1 / n2;
	}

	public static void f1() throws FileNotFoundException
	{
		// 调用f3()报错
		// 1. 因为f3() 方法抛出的是一个编译异常
		// 2. 即这时 就要去f1() 必须处理这个编译异常
		// 3. 在f1() 中, 要么try-catch-finally, 或者继续throws 这个编译异常
		f3(); // 抛出异常
	}

	public static void f3() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d://aa.txt");
	}

	public static void f4()
	{
		// 1. f4()中调用f5() 可以
		// 2. 原因f5() 抛出的时运行异常
		// 3. java中 不要求程序员显式处理 有默认处理机制
		f5();
	}

	public static void f5() throws ArithmeticException
	{

	}
}

class Father
{
	public void method() throws RuntimeException
	{

	}
}

class Son extends Father
{
	// 3. 子类重写父类方法时 对抛出异常的规定: 子类重写的方法
	//    所抛出的异常类型要么和父类抛出的一场一致 要么为父类抛出异常类型的子类型
	// 4. 在throws 过程中 如果有try-catch, 就相当于异常处理, 就可以不必throws
	@Override
	public void method() throws NullPointerException
	{

	}
}