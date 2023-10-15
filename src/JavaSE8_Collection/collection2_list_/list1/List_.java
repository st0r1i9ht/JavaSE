package JavaSE8_Collection.collection2_list_.list1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class List_
{
	@SuppressWarnings({"all"})
	public static void main(String[] args)
	{
		// 1. List集合类中元素有序(添加顺序和取出顺序一致) 可重复
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");
		list.add("rhp");
		list.add("tom");
		System.out.println(list);

		// 2. List集合中的每个元素都有其对应的顺序索引 即支持索引
		// 索引是从0开始的
		System.out.println(list.get(3));// rhp
	}
}
