package JavaSE7_CommonClasses.Class2_String.String3_Method;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringMethod2
{
	public static void main(String[] args)
	{
		// 1. toUpperCase转换成大写
		String s = "Hello";
		System.out.println(s.toUpperCase());// HELLO
		// 2. toLowerCase
		System.out.println(s.toLowerCase());
		// 3. concat拼接字符串
		String s1 = "name:";
		s1 = s1.concat("name1").concat("name2").concat("name3");
		System.out.println(s1);
		// 4. replace替换字符串中的字符 原字符串不会被更改 返回更改后的结果
		String s2 = "name and name";
		System.out.println(s2.replace("name", "name1"));
		String s3 = s2.replace("name", "name1");
		System.out.println(s2);
		System.out.println(s3);
		// 5. split 分割字符串 对于某些分割字符 需要转义
		// 返回一个数组
		String s4 = "Hello World";
		String[] split = s4.split(" ");
		for (String sp : split)
		{
			System.out.println(sp);
		}
		s4 = "E:\\aaa\\bbb";
		split = s4.split("\\\\");
		for (String i : split)
		{
			System.out.println(i);
		}
		// 6. toCharArray 转换成字符数组
		s = "happy";
		char[] chs = s.toCharArray();
		for (char ch : chs)
		{
			System.out.println(ch);
		}
		// 7. compareTo 比较前后两个字符串的大小 前大返回整数 后大返回负数 相等返回0
		String a = "jchn";
		String b = "jack";
		System.out.println(a.compareTo(b));// 返回值是'c' - 'a' = 2的值
		a = "abc";
		b = "abcde";
		System.out.println(a.compareTo(b));// 长度不一样 前面相同 前长度减去后长度
		// 8. format 格式字符串
		/* 占位符:
		 * %s 字符串
		 * %c 字符
		 * %d 整形
		 * %.2f 浮点型 有四舍五入
		 */
		String name = "john";
		int age = 20;
		float score = 100f;
		char gender = '男';
		// 将所有的信息都拼接在一个字符串
		String formatStr = "name:%s, age:%d, gender:%c, score:%.2f";
		String info = String.format(formatStr, name, age, gender, score);
		System.out.println(info);
	}
}
