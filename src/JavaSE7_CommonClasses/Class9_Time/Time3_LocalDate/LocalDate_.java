package JavaSE7_CommonClasses.Class9_Time.Time3_LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class LocalDate_
{
	public static void main(String[] args)
	{
		// 第三代日期
		// 1. 使用now()返回表示当前日期时间的对象

		LocalDateTime ldt = LocalDateTime.now(); // LocalDate.now(); LocalTime.now();

		System.out.println(ldt);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());

		LocalDate now = LocalDate.now();// 可以获取年月日
		LocalTime now1 = LocalTime.now();// 获取时分秒
		System.out.println(now.getYear());
		System.out.println(now1.getHour());

		// 2. 使用DateTimeFormatter对象来进行格式化 格式在API规范中
		// 首先创建DateTimeFormatter对象
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH小时mm分钟ss秒");
		String format = dateTimeFormatter.format(ldt);
		System.out.println("格式化的日期=" + format);

		// 提供plus和minus方法可以对当前时间进行加或者减
		// 加890天
		LocalDateTime plus = ldt.plusDays(890);
		System.out.println("890天后" + dateTimeFormatter.format(plus));
		// 减3456分钟
		LocalDateTime localDateTime = ldt.minusMinutes(3556);
		System.out.println("3456分钟前=" + dateTimeFormatter.format(localDateTime));
	}
}
