package JavaSE8_Collection.collection1_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class CollectionMethod
{
	@SuppressWarnings({"all"})
	public static void main(String[] args)
	{
		List list = new ArrayList();
		// add 添加单个元素
		list.add("jack");
		list.add(10);// list.add(new Integer(10))
		list.add(true);
		System.out.println("list=" + list);
		// remove 删除单个元素
		list.remove(1); // 删除第一个元素
		list.remove("jack"); // 指定删除某个元素
		System.out.println("list=" + list);
		// contains 查找元素是否存在
		System.out.println(list.contains("jack"));
		// size 获取元素个数
		System.out.println(list.size());
		// isEmpty 判断是否为空
		System.out.println(list.isEmpty());
		// clear 清空
		list.clear();
		System.out.println("list=" + list);
		// addAll 添加多个元素
		ArrayList list1 = new ArrayList();
		list1.add("Book1");
		list1.add("Book2");
		list.addAll(list1);
		System.out.println("list=" + list);
		// containsAll 查找多个元素是否都存在
		System.out.println(list.containsAll(list1));
		// removeAll 删除多个元素
		list.add("Book3");
		list.removeAll(list1);
		System.out.println("list=" + list);
	}
}