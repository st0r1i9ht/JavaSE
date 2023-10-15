package JavaSE3_OOPAdvanced.A5_abstract.a1;

public class Test
{

}

abstract class Animal
{
	private String name;
	private int age;

	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// 方法实现了但无意义
	// 父类方法不确定性的问题
	// 考虑将该方法设计为抽象方法
	// 抽象方法就是没有实现的方法
	// 当一个类中存在抽象方法 需要将该类声明为抽象类
	// 一般来说 抽象类会被继承 由其子类来实现抽象方法
	// 抽象方法没有方法体
	public abstract void eat();
}
