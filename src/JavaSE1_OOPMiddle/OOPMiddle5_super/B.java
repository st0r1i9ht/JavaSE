package JavaSE1_OOPMiddle.OOPMiddle5_super;

public class B extends A
{
	//访问父类的属性 但不能访问父类的private属性 super.属性名
	public void hi()
	{
		System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
	}

	//访问父类的方法 不能访问父类的private方法 super.方法名（参数列表）
	public void ok()
	{
		super.test100();
		super.test200();
		super.test300();
	}

	//调用父类构造器
	public B()
	{

	}

	public void cal()
	{

	}
	public void sum()
	{
		System.out.println("B.sum() active");
		cal();
		this.cal();
		super.cal();
	}
}
