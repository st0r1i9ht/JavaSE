package JavaSE7_CommonClasses.Class9_Time.Time2_Calendar;

import java.util.Calendar;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Calendar_
{
	public static void main(String[] args)
	{
		// 1. Calender是一个抽象类
		// 2. 构造器是private 可以通过getInstance() 来获取实例
		// 3. 提供大量的方法和字段
		// 4. Calendar没有提供对应的格式化的类 因此需要程序员自己组合来输出(灵活)
		// 5. 如果需要按照24小时制来获取时间 Calender.HOUR ==> 改成 => Calendar.HOUR_OF_DAY

		// 1. 创建日历类对象 比较简单 自由
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// 2. 获取日历对象的某个日历字段
		System.out.println("年:" + c.get(Calendar.YEAR));
		// +1 Calendar返回月从0开始编号
		System.out.println("月:" + (c.get(Calendar.MONTH) + 1));
		System.out.println("日:" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("小时:" + c.get(Calendar.HOUR));
		System.out.println("分钟:" + c.get(Calendar.MINUTE));
		System.out.println("秒:" + c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.YEAR) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DAY_OF_MONTH) +
				" " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
	}
}
