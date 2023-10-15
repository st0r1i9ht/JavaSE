package JavaSE1_OOPMiddle.OOPMiddle4_extends.Extends2_Detail;

public class Sub extends Base
{
	// Constructor
	public Sub()
	{
		// super();//默认调用父类的无参构造器
		//父类没有无参构造器时必须用super指向父类构造器完成初始化
		//super用来调用父类构造器
		//super必须放在构造器第一行
		//super和this不能共存 super只能存在于构造器内
		System.out.println("sub");
	}

	public void sayOK()
	{
		System.out.println(n1 + " " + n2 + " " + n3);
		test100();
		test200();
		test300();
		//test400报错

		//私有属性或方法通过父类提供公共方法访问
		System.out.println(getN4());
		callTest400();
	}
}