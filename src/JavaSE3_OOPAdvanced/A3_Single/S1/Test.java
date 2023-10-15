package JavaSE3_OOPAdvanced.A3_Single.S1;

/**
 * 单例设计模式(单个实例)
 * 单例模式饿汉式
 * 加载类时对象已创建 即使没有使用
 * 单例设计模式中的对象通常是重量级对象 对象未使用会造成资源浪费
 */
public class Test
{
	public static void main(String[] args)
	{
		GirlFriend instance = GirlFriend.getInstance();
		System.out.println(instance);
		GirlFriend instance1 = GirlFriend.getInstance();
		System.out.println(instance == instance1);
	}
}

class GirlFriend
{
	private String name;

	// 为了能在静态方法中返回gf对象，需要将其修饰为static
	private static GirlFriend gf = new GirlFriend("gf");

	// 如何保障我们只能创建一个GirlFriend对象
	// 步骤
	// 1. 将构造器私有化
	// 2. 在类的内部直接创建static对象
	// 3. 提供一个公共的static方法 返回gf对象
	private GirlFriend(String name)
	{
		this.name = name;
	}

	public static GirlFriend getInstance()
	{
		return gf;
	}

	@Override
	public String toString()
	{
		return "GirlFriend{" +
				"name='" + name + '\'' +
				'}';
	}
}