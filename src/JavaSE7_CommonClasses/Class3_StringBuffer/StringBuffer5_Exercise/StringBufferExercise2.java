package JavaSE7_CommonClasses.Class3_StringBuffer.StringBuffer5_Exercise;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringBufferExercise2
{
	public static void main(String[] args)
	{
		/*
		 * 输入商品名称和价格 打印效果示例
		 * 效果示例: 商品名 123,456.78
		 * 要求 价格的小数点前面每三位用逗号隔开 后输出
		 * 思路
		 * 1. 定义一个Scanner对象 接收用户输入 价格String
		 * 2. 使用StringBuffer的insert 需要String -> StringBuffer
		 * 3. 使用相关方法进行字符串处理
		 */
		String price = "12345689.78";
		StringBuffer stringBuffer = new StringBuffer(price);
		for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3)
		{
			stringBuffer.insert(i, ",");
		}
		System.out.println(stringBuffer);
	}
}
