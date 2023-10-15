package JavaSE7_CommonClasses.Class8_BigNumber;

import java.math.BigDecimal;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class BigDecimal_
{
	public static void main(String[] args)
	{
		// 当我们需要保存一个精度很高的数时 double不够用
		// 可以使用BigDecimal
		// double d = 1999.1111111111111111111199999991d;
		// System.out.println(d);

		BigDecimal bigDecimal = new BigDecimal("1999.1111111111111111111199999991");
		BigDecimal bigDecimal1 = new BigDecimal("1.1");
		System.out.println(bigDecimal);
		// 1. 如果对BigDecimal进行运算 比如加减乘除 需要使用对应的方法
		// 2. 创建一个需要操作的BigDecimal然后调用相应的方法即可
		System.out.println(bigDecimal.add(bigDecimal1));
		System.out.println(bigDecimal.subtract(bigDecimal1));
		System.out.println(bigDecimal.multiply(bigDecimal1));
		// System.out.println(bigDecimal.divide(bigDecimal1)); // 可能抛出异常ArithmeticException 除法可能除不尽
		// 在调用divide方法时 指定精度即可 BigDecimal.ROUND_CEILING
		// 如果有无限循环小数 就会保留分子的精度
		System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING));
	}
}
