package JavaSE4_Enumeration.Enumeration3;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Enumeration3
{
	public static void main(String[] args)
	{
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
	}
}

//使用enum关键字实现枚举类
//默认会继承一个enum类 并且是一个final类 可以通过javap看到
enum Season
{
	SPRING("春天", "温暖"), SUMMER("夏天", "炎热"),
	AUTUMN;

	//1.使用enum替代class
	//2.public static final Season SPRING = new Season("春天", "温暖") 去掉
	// 直接使用 SPRING("春天", "温暖") 常量名(实参列表)
	//3.多个变量(对象) 使用 , 间隔
	//4.要求把常量对象定义写在类最前面
	//5.如果我们使用的是无参构造器 创建常量对象可以省略括号
	private String name;
	private String desc;//描述

	Season()
	{
	}

	private Season(String name, String desc)
	{
		this.name = name;
		this.desc = desc;
	}

	public String getName()
	{
		return name;
	}

	public String getDesc()
	{
		return desc;
	}

	@Override
	public String toString()
	{
		return "Season{" +
				"name='" + name + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}