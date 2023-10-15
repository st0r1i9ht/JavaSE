package JavaSE4_Enumeration.Enumeration2;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Enumeration2
{
	public static void main(String[] args)
	{
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.AUTUMN);
		System.out.println(Season.WINTER);
	}
}

//自定义枚举类
class Season
{
	private String name;
	private String desc;

	public static final Season SPRING = new Season("春天", "温暖");
	public static final Season SUMMER = new Season("夏天", "炎热");
	public static final Season AUTUMN = new Season("秋天", "凉爽");
	public static final Season WINTER = new Season("冬天", "寒冷");

	//1.将构造器私有化 防止直接new
	//2.可以提供Getter 不提供Setter
	//3.在Season内部 直接创建固定的对象
	//4.优化 加入final修饰符 防止类加载
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