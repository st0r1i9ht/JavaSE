package JavaSE4_Enumeration.Enumeration3;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class EnumMethod
{
	public static void main(String[] args)
	{
		Season spring = Season.SPRING;

		//name() 输出枚举对象名字
		System.out.println(spring.name());

		//ordinal() 输出的是该枚举对象的编号 次序
		System.out.println(spring.ordinal());//SPRING 枚举对象是第1个 因此输出0

		//values() 从反编译可以看到values方法 返回Season[]
		//含有定义的所有枚举对象
		Season[] seasons = Season.values();
		System.out.println("====遍历取出枚举对象====");
		for (Season season: seasons)//增强for循环
		{
			System.out.println(season);
		}

		//valueOf:将字符串转换成枚举对象，要求字符串必须为已有的常量名 否则报异常
		//执行流程
		//1.根据输入的"SPRING"到Season的枚举类中查找
		//2.如果找到了 就返回 如果没有找到 就报错
		Season season1 = Season.valueOf("SPRING");
		System.out.println(season1);
		System.out.println(season1 == spring);

		//compareTo:比较两个枚举常量编号
		//	public final int compareTo(E o) {
		//	return self.ordinal - other.ordinal;
		//}
		System.out.println(Season.AUTUMN.compareTo(Season.SPRING));

		//补充了一个增强for
		/*int[] nums = {1, 2, 3};
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(i);
		}

		//执行流程 依次从nums中取出数据 赋值给num 取出完毕后退出for
		for (int num : nums)
		{
			System.out.println(num);
		}*/
	}
}