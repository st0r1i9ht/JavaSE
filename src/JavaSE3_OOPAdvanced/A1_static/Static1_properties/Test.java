package JavaSE3_OOPAdvanced.A1_static.Static1_properties;

/*
 * 类变量定义访问
 * 类变量是随着类加载时创建的 直接使用类名访问 不需要创建对象实例来访问
 * 对象变量不能通过类名访问
 * 类变量访问遵守访问权限
 */
public class Test
{
	public static void main(String[] args)
	{
		//类名.类变量名
		System.out.println("A.name " + A.name);
		//对象名.类变量名
		A a = new A();
		System.out.println("a.name " + a.name);
	}
}

class A
{
	//类变量
	public static String name = "static String name";

}