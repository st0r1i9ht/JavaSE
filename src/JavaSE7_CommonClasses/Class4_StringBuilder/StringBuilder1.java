package JavaSE7_CommonClasses.Class4_StringBuilder;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringBuilder1
{
	public static void main(String[] args)
	{
		/*
		 * 1. StringBuilder继承AbstractStringBuilder类
		 * 2. 实现了Serializable 说明StringBuilder对象是可以串行化 可以网络传输 可以保存到文件
		 * 3. StringBuilder是final类 不能被继承
		 * 4. StringBuilder对象字符序列仍然是存放在其父类 AbstractStringBuilder的char[]value
		 *    因此字符序列在堆中
		 * 5. StringBuilder的方法没有做互斥的处理 即没有synchronized关键字 因此在单线程的情况下使用StringBuilder
		 */
		StringBuilder stringBuilder = new StringBuilder();

		/*
		 * String StringBuffer StringBuilder
		 * 0. StringBuilder和StringBuffer非常类似 均代表可变的字符序列 方法使用一样
		 * 1. String 不可变字符序列 效率低 但复用率高
		 * 2. StringBuffer 可变字符序列 效率较高(增删) 线程安全
		 * 3. StringBuilder 可变字符序列 效率较高 线程不安全
		 * 4. 如果我们对String做大量修改 不要使用String
		 * 效率 StringBuilder > StringBuffer > String
		 * 测试代码StringBuilder2.java
		 * 使用原则
		 * 1. 字符串存在大量修改 单线程用StringBuilder 多线程用StringBuffer
		 * 2. 字符串很少修改 被多个对象引用 使用String 比如配置信息
		 */
	}
}
