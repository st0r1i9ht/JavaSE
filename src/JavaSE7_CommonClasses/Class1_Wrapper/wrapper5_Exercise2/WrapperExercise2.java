package JavaSE7_CommonClasses.Class1_Wrapper.wrapper5_Exercise2;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class WrapperExercise2
{
	public static void main(String[] args)
	{
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);

		//    public static Integer valueOf(int i) {
		//         if (i >= IntegerCache.low && i <= IntegerCache.high)
		//             return IntegerCache.cache[i + (-IntegerCache.low)];
		//         return new Integer(i);
		//     }
		// -128 - 127不创建对象 直接返回
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);

		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);
	}
}
