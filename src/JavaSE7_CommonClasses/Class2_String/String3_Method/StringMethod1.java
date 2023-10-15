package JavaSE7_CommonClasses.Class2_String.String3_Method;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringMethod1
{
	public static void main(String[] args)
	{
		// String常用方法
		// 1. equals 判断内容是否相等
		String str1 = "hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		// 2. equalsIgnoreCase 忽略大小写的判断内容是否相等
		String username = "JOHN";
		if ("john".equalsIgnoreCase(username))
		{
			System.out.println("SUCCESS");
		}
		else
		{
			System.out.println("FAILURE");
		}
		// 3. lengh 获取字符的个数 字符串长度
		System.out.println("12345".length());
		// 4. indexOf 获取字符在字符串对象中第一次出现的索引 索引从0开始 如果找不到 返回-1
		String s1 = "war@terwe@g";
		int index = s1.indexOf('@');
		System.out.println(index);
		System.out.println(s1.indexOf("we"));
		// 5. lastIndexOf 获取字符在字符串中最后一次出现的索引, 索引从0开始 如果找不到 返回-1
		s1 = "wer@terwe@g@";
		index = s1.lastIndexOf('@');
		System.out.println(index);
		System.out.println(s1.lastIndexOf("we"));
		// 6. substring 截取指定范围的子串
		String name = "Hello World";
		System.out.println(name.substring(6));// 从索引6开始截取后面的所有内容
		System.out.println(name.substring(0, 5));// 从索引0开始 截取到5 不包括5 (截取到5-1)
		System.out.println(name.substring(2, 5));// 从开始索引到结束索引不包括结束索引
	}
}
