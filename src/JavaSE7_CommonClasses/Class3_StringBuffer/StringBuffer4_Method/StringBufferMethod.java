package JavaSE7_CommonClasses.Class3_StringBuffer.StringBuffer4_Method;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringBufferMethod
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("hello");
		// 增
		s.append(',');// "hello,"
		s.append("张三丰");// "hello,张三丰"
		s.append("赵敏").append(100).append(true).append(10.5);
		System.out.println(s);
		// 删
		// 删除索引为>= start && < end处的字符
		s.delete(11, 14);
		System.out.println(s);
		// 改
		// 替换索引[start, end)
		s.replace(9, 11, "周周周");
		System.out.println(s);
		// 查 查找指定的子串在字符串的第一次出现的索引 如果找不到返回-1
		int indexOf = s.indexOf("张三丰");
		System.out.println(indexOf);
		// 插 在索引为9的位置插入"insert" 原来索引为9的内容自动后移
		s.insert(9, "赵敏");
		// 长度
		System.out.println(s.length());
		System.out.println(s);
	}
}
