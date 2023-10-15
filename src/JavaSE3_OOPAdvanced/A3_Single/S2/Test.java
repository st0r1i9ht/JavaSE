package JavaSE3_OOPAdvanced.A3_Single.S2;

/**
 * 单例设计模式
 * 懒汉式
 * 只有当用户使用getInstance时 才返回cat对象 后面再次调用时 会返回上次创建的cat对象 从而保证了单例
 * 饿汉式和懒汉式区别在于调用时机不同
 * 懒汉式 存在线程安全问题 多线程调用没有互斥处理
 */
public class Test
{
	public static void main(String[] args)
	{
		Cat Instance = Cat.getInstance();
		System.out.println(Instance);
	}
}

class Cat
{
	private String name;
	private static Cat cat;

	// 步骤
	// 1.构造器私有化
	// 2.定义一个static 静态属性对象
	// 3.提供一个public static方法 可以返回一个Cat对象
	private Cat(String name)
	{
		this.name = name;
	}

	public static Cat getInstance()
	{
		if (cat == null)
		{
			cat = new Cat("cat");
		}
		return cat;
	}

	@Override
	public String toString()
	{
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}
}