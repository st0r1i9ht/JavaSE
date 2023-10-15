package JavaSE7_CommonClasses.Class3_StringBuffer.StringBuffer1;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringBuffer1
{
	public static void main(String[] args)
	{
		// 1. StringBuffer的直接父类AbstractStringBuffer
		// 2. StringBuffer实现了Serializable 可串行化(可保存到文件 可网络传输)
		// 3. 在父类AbstractStringBuffer中有属性char[] value 不是final
		//    该value数组存放字符串内容 因此存放在堆中
		// 4. StringBuffer是final类不可被继承
		StringBuffer stringBuffer = new StringBuffer();
		// String VS StringBuffer
		// 1. String保存的是字符串常量 里面的值不能修改 每次String类的更新实际上都是更改地址 效率较低
		// private final char value[];// 在池
		// 2. StringBuffer保存的是字符串变量 里面的值可以更改
		// 每次StringBuffer的更新实际上可以更新内容 不是每次创建新对象 不用更新地址 效率较高
		// char[] value; // 在堆
	}
}