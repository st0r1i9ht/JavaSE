package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly4_PolyDetail;

public class PolyDetail
{
	public static void main(String[] args)
	{
		/*
		 * 向上转型 父类引用指向子类对象
		 * 1. 可以调用父类成员和子类重写成员 不能调用子类特有成员 父类为编译类型 子类没有编译
		 * 2. 遵守访问权限
		 */
		Animal animal = new Cat();
		Object obj = new Cat();
		System.out.println("hello");

		animal.eat();
		animal.run();
		animal.show();
		animal.sleep();

		/*
		 * 向下转型 子类类型 引用名 = （子类类型） 父类引用
		 */

		Cat cat = (Cat) animal;
	}
}