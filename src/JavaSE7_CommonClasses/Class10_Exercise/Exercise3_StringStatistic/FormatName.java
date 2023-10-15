package JavaSE7_CommonClasses.Class10_Exercise.Exercise3_StringStatistic;

public class FormatName
{
	public static void main(String[] args)
	{
		String name = "Ren hong Pu";
		printName(name);
	}

	/*
	 * 输入形式为Ren hong Pu 的人名 以Pu,Ren.H的形式打印
	 * 其中.S是中间单词的首字母
	 * 1. 对接收的字符串进行分割split(" ")
	 * 2. 对得到的String[]进行格式化String.format()
	 * 3. 对输入的字符串进行校验
	 */
	public static void printName(String str)
	{
		if (str == null)
		{
			System.out.println("str不能为空");
			return;
		}

		String[] names = str.split(" ");
		if (names.length != 3)
		{
			System.out.println("输入的字符串格式不对");
			return;
		}

		String format = String.format("%s,%s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
		System.out.println(format);
	}
}