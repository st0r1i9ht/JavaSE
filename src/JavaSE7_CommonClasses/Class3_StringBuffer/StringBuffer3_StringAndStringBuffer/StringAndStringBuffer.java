package JavaSE7_CommonClasses.Class3_StringBuffer.StringBuffer3_StringAndStringBuffer;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringAndStringBuffer
{
	public static void main(String[] args)
	{
		// String -> StringBuffer
		String str = "hello world";
		// 方式1 使用构造器
		// 返回的是StringBuffer对象 对String没有影响
		StringBuffer stringBuffer = new StringBuffer(str);
		// 方式2 使用append方法
		StringBuffer stringBuffer1 = new StringBuffer();
		stringBuffer1 = stringBuffer1.append(str);

		// StringBuffer -> String
		StringBuffer stringBuffer2 = new StringBuffer("hello world");
		// 方式1 使用StringBuffer提供的toString方法
		String s = stringBuffer2.toString();
		// 方式2 使用构造器
		String s1 = new String(stringBuffer2);
	}
}
