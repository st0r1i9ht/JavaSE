package JavaSE1_OOPMiddle.OOPMiddle8_ObjectClass.Object3_ToString;

public class ToString
{
	public static void main(String[] args)
	{
		// 重写toString
		Monster monster = new Monster("name", "job", 0);
		System.out.println(monster.toString() + " " + Integer.toHexString(monster.hashCode()));

		// 直接输出对象 默认调用toString
		System.out.println(monster);
	}
}

class Monster
{
	private String name;
	private String job;
	private double sal;

	public Monster(String name, String job, double sal)
	{
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

/*	public String toString()
	{
		return getClass().getName();//返回全类名 + "@" + Integer.toHexString(hashCode())//将对象的hashCode值转换成16进制;
	}*/

	// @Override
	// public String toString()
	// {
	// 	return "Monster{" +
	// 			"name='" + name + '\'' +
	// 			", job='" + job + '\'' +
	// 			", sal=" + sal +
	// 			'}';
	// }
}
