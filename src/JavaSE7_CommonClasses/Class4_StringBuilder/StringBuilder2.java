package JavaSE7_CommonClasses.Class4_StringBuilder;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringBuilder2
{
	public static void main(String[] args)
	{
		/* String text = "";
		long startTime = 0L;
		long endTime = 0L;
		StringBuffer buffer = new StringBuffer("");
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++)
		{
			buffer.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer的执行时间:" + (endTime - startTime));
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++)
		{
			builder.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的执行时间:" + (endTime - startTime)); */
		Efficiency[] e = new Efficiency[]{new A(), new B(), new C()};
		for (Efficiency i : e)
		{
			i.time();
		}
	}
}

class A extends Efficiency
{
	@Override
	public void job()
	{
		StringBuffer buffer = new StringBuffer("");
		for (int i = 0; i < 80000; i++)
		{
			buffer.append(String.valueOf(i));
		}
		System.out.print("StringBuffer:");
	}
}

class B extends Efficiency
{
	@Override
	public void job()
	{
		StringBuilder builder = new StringBuilder("");
		for (int i = 0; i < 80000; i++)
		{
			builder.append(String.valueOf(i));
		}
		System.out.print("StringBuilder:");
	}
}

class C extends Efficiency
{
	@Override
	public void job()
	{
		String text = "";
		for (int i = 0; i < 80000; i++)
		{
			text = text + i;
		}
		System.out.print("String:");
	}
}

abstract class Efficiency
{
	public abstract void job();

	public void time()
	{
		long startTime = System.currentTimeMillis();
		job();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}