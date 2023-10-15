package JavaSE3_OOPAdvanced.A1_static.Static;

public class Test
{
	public static void main(String[] args)
	{
		Child child1 = new Child("child1");
		Child.count++;
		child1.showCount();
		System.out.println(child1.count);
		Child child2 = new Child("child2");
		Child.count++;
		child2.showCount();
		System.out.println(child2.count);
		Child child3 = new Child("child3");
		Child.count++;
		child3.showCount();
		System.out.println(child3.count);

	}
}

class Child
{
	private String name;
	public static int count;
	// 类变量(静态变量) static
	// 类变量被类中所有对象共享

	public Child(String name)
	{
		this.name = name;
	}

	public void showCount()
	{
		System.out.println(Child.count);
	}
}