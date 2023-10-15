package JavaSE3_OOPAdvanced.A6_Interface.Interface6_ExtendsVsInterface;

public class ExtendsVsInterface
{
	public static void main(String[] args)
	{
		LittleMonkey littleMonkey = new LittleMonkey("LittleMonkey");
		littleMonkey.climbing();
		littleMonkey.swimming();
		littleMonkey.flying();
	}
}

//子类继承了父类 拥有父类的功能
//如果子类需要拓展功能 通过实现接口的方式拓展
//实现接口对Java单继承机制补充
//继承is-a 接口like-a
//接口在一定程度上实现代码解耦[接口规范性+动态绑定]
interface Fishable
{
	void swimming();
}

interface Birdable
{
	void flying();
}

class Monkey
{
	private String name;

	public Monkey(String name)
	{
		this.name = name;
	}

	public void climbing()
	{
		System.out.println(name + "会爬树");
	}

	public String getName()
	{
		return name;
	}
}

class LittleMonkey extends Monkey implements Fishable, Birdable
{

	public LittleMonkey(String name)
	{
		super(name);
	}

	@Override
	public void swimming()
	{
		System.out.println(getName() + "学会游泳");
	}

	@Override
	public void flying()
	{
		System.out.println(getName() + "学会飞");
	}
}
