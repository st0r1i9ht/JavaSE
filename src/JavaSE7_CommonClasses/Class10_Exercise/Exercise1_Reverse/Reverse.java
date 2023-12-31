package JavaSE7_CommonClasses.Class10_Exercise.Exercise1_Reverse;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Reverse
{
	public static void main(String[] args)
	{
		String str = "abcdef";
		System.out.print(str + "->");
		str = reverse(str, 1, 4);
		System.out.println(str);
	}

	/*
	 * 1. 将字符串中指定的部分进行反转 比如将"abcdef"反转为"aedcbf"
	 * 2. 编写方法public static String reverse(String str, int start, int end)
	 * 思路分析
	 * 1. 先把方法定义确定
	 * 2. 把String转成char[] 因为char[]的元素是可以交换的
	 * 3. 画出分析示意图
	 * 4. 代码实现
	 */
	public static String reverse(String str, int start, int end)
	{
		// 对输入的参数做一个验证
		// 重要的编程技巧(思想)
		// 1. 写验证的时候先写出正确的情况
		// 2. 取反
		if (!(str != null && start >= 0 && end <= str.length()))
		{
			throw new RuntimeException("参数不正确");
		}

		char[] chars = str.toCharArray();
		char temp = ' ';// 交换时临时变量
		for (int i = start, j = end; i < j; i++, j--)
		{
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
	}
}
