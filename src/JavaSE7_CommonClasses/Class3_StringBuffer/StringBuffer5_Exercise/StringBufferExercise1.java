package JavaSE7_CommonClasses.Class3_StringBuffer.StringBuffer5_Exercise;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringBufferExercise1
{
	public static void main(String[] args)
	{
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);// 源码调用AbstractStringBuilder的appendNull
		System.out.println(sb.length());

		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer(str);// 源码null.lenth()抛出NullPointerException
		System.out.println(sb1);
	}
}
