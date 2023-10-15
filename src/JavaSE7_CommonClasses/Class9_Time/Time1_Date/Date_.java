package JavaSE7_CommonClasses.Class9_Time.Time1_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Date_
{
	public static void main(String[] args) throws ParseException
	{
		// 1. 获取当前系统时间
		// 2. 这里的Date类是在java.util包
		// 3. 默认输出的日期格式是国外的方式 因此通常需要对格式进行转换
		Date date = new Date();// 获取当前系统时间
		System.out.println(date);
		Date date1 = new Date(9234567);// 通过指定毫秒数得到时间
		System.out.println(date1);

		// 1. 创建SimpleDateFormat对象, 可以指定相应的格式
		// 2. 这里的格式使用的字母是规定好的 不能乱使用 在API中查找
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
		String format = sdf.format(date);// format 将日期转换成指定格式的字符串
		System.out.println("当前日期 " + format);

		// 1. 可以把一个格式化的String转换成对应的Date
		// 2. 得到Date在输出时仍然按照默认格式 如果希望指定格式输出 需要转换
		// 3. 在把String -> Date 使用的sdf格式需要和给的String格式一样 否则会抛出转换异常
		String s = "1996年01月01日 10:20:30 星期一";
		Date parse = sdf.parse(s);
		System.out.println(parse);
		System.out.println(sdf.format(parse));
	}
}
