package JavaSE7_CommonClasses.Class10_Exercise.Exercise3_StringStatistic;

public class CountString
{
	public static void main(String[] args)
	{
		String str = "hello world";
		countStr("");
	}

	/*
	 * 输入字符串 判断有多少大写字母 多少小写字母 多少数字
	 * 1. 遍历字符串 如果char在'0'~'9'就是数字
	 * 2. 如果char在'a'~'z'就是小写字母
	 * 3. 如果char在'A'~'Z'就是大写字母
	 * 4. 使用三个变量来记录 统计结果
	 */
	public static void countStr(String str)
	{
		if (str == null)
		{
			System.out.println("输入不能为null");
			return;
		}
		int strLen = str.length();
		int numCount = 0;
		int lowerCount = 0;
		int upperCount = 0;
		int otherCount = 0;
		for (int i = 0; i < strLen; i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				numCount++;
			}
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				lowerCount++;
			}
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				upperCount++;
			}
			else
			{
				otherCount++;
			}

			System.out.println("数字有" + numCount);
			System.out.println("小写字母有" + lowerCount);
			System.out.println("大写字母有" + upperCount);
			System.out.println("其他字符有" + otherCount);
		}
	}
}
