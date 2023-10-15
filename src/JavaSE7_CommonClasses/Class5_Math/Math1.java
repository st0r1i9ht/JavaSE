package JavaSE7_CommonClasses.Class5_Math;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Math1
{
	public static void main(String[] args)
	{
		// Math常用的方法(静态)
		// 1. abs绝对值
		int abs = Math.abs(-9);
		System.out.println(abs);
		// 2. pow求幂
		double pow = Math.pow(2, 4);
		System.out.println(pow);
		// 3. ceil向上取整 返回>=该参数的最小整数
		double ceil = Math.ceil(-3.0001);
		System.out.println(ceil);
		// 4. floor向下取整 返回<=该参数的最大整数
		double floor = Math.floor(-4.999);
		System.out.println(floor);
		// 5. round 四舍五入 Math.floor(该参数+0.5)
		long round = Math.round(5.499);
		System.out.println(round);
		// 6. sqrt 求开平方根 开方
		double sqrt = Math.sqrt(9);
		System.out.println(sqrt);
		// 7. random随机数
		// 返回的是[0, 1)之间的随机小数
		// 实现: 获取a-b之间的一个随机整数 a, b均为整数, 比如 a = 2, b = 7
		// Math.random() * (b - a) 返回 [0, b - a)
		// a + Math.random() * (b - a) 返回 [a, b - a)
		int a = 2;
		int b = 7;
		for (int i = 0; i < 10; i++)
		{
			System.out.print((int) (a + Math.random() * (b - a + 1)) + " ");
		}
		System.out.println();
		// 8. max, min 返回最大值和最小值
		int min = Math.min(1, 9);
		int max = Math.max(45, 90);
		System.out.println("min=" + min);
		System.out.println("max=" + max);
	}
}
