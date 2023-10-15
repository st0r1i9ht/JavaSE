package JavaSE7_CommonClasses.Class2_String.String1;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class String1
{
	public static void main(String[] args)
	{
		// 1. String对象用于保存字符串, 一组数字序列
		// 2. "jack" 字符串常量 双引号引起的字符序列
		// 3. 字符串使用的字符使用Unicode字符编码 一个字符(不区分字母或汉字) 占两个字节
		// 4. String类有很多构造器 构造器的重载
		//    常用的有
		//    String s1 = new String();
		//    String s2 = new String(String original);
		//    String s3 = new String(char[] a);
		//    String s4 = new String(char[] a, int startIndex, int count);
		//    String s5 = new String(byte[] b);
		// 5. String类实现了接口Serializable String可以串行化: 数据可以在网络传输
		//                 接口Comparable String对象可以比较大小
		//    String 实现 接口 CharSequence Comparable Serializable
		//           继承 类 Object
		// 6. String是final类 不能被其他类继承
		// 7. String有属性private final char value[]; 用于存放字符串内容
		// 8. value 是一个final类型, 不可以修改: value不能指向新的地址 单个字符可以变化
		String name = "jack";
		name = "tom";
		final char[] value = {'a', 'b', 'c', 'd'};
		char[] v2 = {'t', 'o', 'm'};
		value[0] = 'H';
		// value = v2; 报错
	}
}
