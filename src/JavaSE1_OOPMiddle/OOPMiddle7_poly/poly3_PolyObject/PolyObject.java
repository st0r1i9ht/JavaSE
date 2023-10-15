package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly3_PolyObject;

public class PolyObject
{
	/*
	 * 1. 对象的编译类型和运行类型可以不一致
	 * 2. 编译类型不能改变
	 * 3. 运行类型可以改变
	 * 4. 编译类型 引用名 = new 运行类型
	 */
	public static void main(String[] args)
	{
		Animal animal = new Dog();
		animal.hello();//运行时animal的运行类型是Dog 运行Dog中的hello

		animal = new Cat();
		animal.hello();//运行Cat中的hello
	}
}
