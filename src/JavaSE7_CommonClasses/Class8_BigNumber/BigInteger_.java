package JavaSE7_CommonClasses.Class8_BigNumber;

import java.math.BigInteger;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class BigInteger_
{
	public static void main(String[] args)
	{
		// 当我们编程中 需要处理很大的整数 long不够用 我们可以使用BigInteger的类来搞定
		// long l = 237888888899999999999999l;
		// System.out.println("l=" + l);

		BigInteger bigInteger = new BigInteger("237888888899999999999999999999999999999999999999999999999999999");
		BigInteger bigInteger1 = new BigInteger("100");
		System.out.println(bigInteger);
		// 1. 在对BigInteger进行加减乘除的时候 需要使用对应的方法 不能直接进行 + - * /
		// 2. 可以创建一个要操作的BigInteger然后进行操作
		BigInteger add = bigInteger.add(bigInteger1);
		System.out.println(add);
		BigInteger subtract = bigInteger.subtract(bigInteger1);
		System.out.println(subtract);
		BigInteger multiply = bigInteger.multiply(bigInteger1);
		System.out.println(multiply);
		BigInteger divide = bigInteger.divide(bigInteger1);
		System.out.println(divide);
	}
}
