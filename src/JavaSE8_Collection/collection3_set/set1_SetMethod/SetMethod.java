package JavaSE8_Collection.collection3_set.set1_SetMethod;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SetMethod
{
	public static void main(String[] args)
	{
		// 1.Set接口的实现类HashSet演示Set接口的方法
		// 2.Set接口的实现类对象(Set接口对象) 不能存放重复的元素
		// 3.可以添加一个null
		// 4.Set接口存放对象数据无序(添加的顺序和取出的顺序不一致) 但固定
		HashSet set = new HashSet();
		set.add("set1");
		set.add("set2");
		set.add("set2");// 重复
		set.add("set4");
		set.add(null);
		set.add(null);// 再次添加

		System.out.println("set=" + set);
		// 遍历
		// 1. 迭代器
		Iterator iterator = set.iterator();
		while (iterator.hasNext())
		{
			Object next =  iterator.next();
			System.out.println("next=" + next);
		}

		set.remove(null);

		// 2. 增强for
		for (Object o : set)
		{
			System.out.println("o=" + o);
		}

	}
}