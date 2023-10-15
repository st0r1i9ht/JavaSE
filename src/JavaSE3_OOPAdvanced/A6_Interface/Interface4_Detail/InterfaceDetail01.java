package JavaSE3_OOPAdvanced.A6_Interface.Interface4_Detail;

public class InterfaceDetail01
{
	public static void main(String[] args)
	{

	}
}

/*
 * 1. 接口不能被实例化
 * 2. 接口中所有的方法是 public 方法 接口中抽象方法 可以不用abstract修饰
 * 3. 一个普通类实现接口 就必须将该接口的所有方法实现 可用生成快捷键
 * 4. 抽象类实现接口 可以不用实现接口的方法
 */

interface IA
{
	public abstract void say(); // 省略 public abstract

	void hi();
}

class Cat implements IA
{
	@Override
	public void say()
	{

	}

	@Override
	public void hi()
	{

	}
}

abstract class Tiger implements IA
{
	//抽象类实现接口 可以不用实现接口的方法
}