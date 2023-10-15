package JavaSE4_Enumeration.Enumeration4_Exercise;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class EnumExercise1
{
	public static void main(String[] args)
	{
		//获取所有的枚举对象
		Week[] weeks = Week.values();
		//遍历 使用增强for
		for (Week week : weeks)
		{
			System.out.println(week);
		}

	}
}

enum Week
{
	//定义Week的枚举对象
	MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
	private String name;

	Week(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
}