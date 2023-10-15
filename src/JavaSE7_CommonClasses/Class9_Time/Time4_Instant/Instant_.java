package JavaSE7_CommonClasses.Class9_Time.Time4_Instant;

import java.time.Instant;
import java.util.Date;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Instant_
{
	public static void main(String[] args)
	{
		// 1. 通过 静态方法now()获取表示当前时间戳的对象
		Instant now = Instant.now();
		System.out.println(now);
		// 2. 通过 from方法 可以把Instant转成Date
		Date date = Date.from(now);
		// 3. 通过date的toInstant()可以把date转成Instant对象
		Instant instant = date.toInstant();
	}
}
