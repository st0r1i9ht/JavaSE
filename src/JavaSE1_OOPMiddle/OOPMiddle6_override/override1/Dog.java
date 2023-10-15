package JavaSE1_OOPMiddle.OOPMiddle6_override.override1;

public class Dog extends Animal
{
	//Dog的cry方法重写/覆写了父类的cry方法
	public void cry()
	{
		System.out.println("hello class Dog active");
	}

	//子类复写方法返回类型需为父类的子类或与父类相同
	public String m1()
	{
		return null;
	}
	public BBB m2()
	{
		return null;
	}

	//子类复写方法不能缩小父类方法的访问权限
	public void m3()
	{

	}


}

class AAA
{

}

class BBB extends AAA
{

}