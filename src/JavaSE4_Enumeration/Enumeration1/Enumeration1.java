package JavaSE4_Enumeration.Enumeration1;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Enumeration1
{
	public static void main(String[] args)
	{
		//使用
		Season spring = new Season("春天", "温暖");
		Season summer = new Season("夏天", "炎热");
		Season autumn = new Season("秋天", "凉爽");
		Season winter = new Season("冬天", "寒冷");
		//对于季节而言 对象是固定的四个 不会有更多
		//按照这个设计类的思路 不能体现季节是固定的四个对象
		//因此这样的设计不好
		//引出枚举类 即把对象一个一个列举出来的类
	}
}

class Season
{
	private String name;
	private String desc;//描述

	public Season(String name, String desc)
	{
		this.name = name;
		this.desc = desc;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setDesc(String desc)
	{
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
}