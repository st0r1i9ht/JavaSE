package JavaSE1_OOPMiddle.OOPMiddle4_extends.Extends3_Theory;

public class ExtendsTheory
{
	public static void main(String[] args)
	{
		Son son = new Son();

	}

}

class GrandPa
{
	String name = "爷爷";
	String hobby = "旅游";
}

class Father extends GrandPa
{
	String name = "爸爸";
	int age = 39;
}

class Son extends Father
{
	String name = "儿子";
}