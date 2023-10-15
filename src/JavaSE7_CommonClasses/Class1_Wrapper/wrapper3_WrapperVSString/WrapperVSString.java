package JavaSE7_CommonClasses.Class1_Wrapper.wrapper3_WrapperVSString;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class WrapperVSString
{
	public static void main(String[] args)
	{
		// 包装类(Integer)->String
		Integer i = 100;
		// 方式1
		String str1 = i + "";
		// 方式2
		String str2 = i.toString();
		// 方式3
		String str3 = String.valueOf(i);

		// String->包装类(Integer)
		String str4 = "12345";
		int i1 = Integer.parseInt(str4);// 自动装箱
		int i2 = new Integer(str4);// 构造器
	}
}
