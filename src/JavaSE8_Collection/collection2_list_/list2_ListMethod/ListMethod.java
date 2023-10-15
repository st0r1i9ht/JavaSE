package JavaSE8_Collection.collection2_list_.list2_ListMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ListMethod
{
	@SuppressWarnings({"all"})
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add("name1");
		list.add("name2");
		// void add(int index, Object ele) 在index位置插入ele元素
		// 在index = 1的位置插入一个对象
		list.add(1, "韩顺平");
		System.out.println("list=" + list);
		// boolean addAll(int index, Collection eles) 从index位置开始将eles中的所有元素添加进来
		List list1 = new ArrayList();
		list1.add("tom");
		list1.add("jack");
		list.addAll(1, list1);
		System.out.println(list);
		// Object get(int index) 获取指定index位置的元素
		// int indexOf(Object obj) 返回obj在集合中首次出现的位置
		System.out.println(list.indexOf("tom")); // 2
		// int lastIndexOf(Object obj) 返回obj在集合中末次出现的位置
		list.add("韩顺平");
		System.out.println(list);
		System.out.println(list.lastIndexOf("韩顺平"));
		// Object remove(int index) 移除指定index位置的元素 并返回此元素
		list.remove(0);
		System.out.println(list);
		// Object set(int index, Object ele) 设置指定index位置的元素为ele 相当于是替换 索引不存在IndexOutOfBoundException
		list.set(1, "mary");
		System.out.println(list);
		// List subList(int fromIndex, int toIndex) 返回从fromIndex到toIndex位置的子集合
		// 返回子集合范围[fromIndex, toIndex)
		List returnlist = list.subList(0, 2);
		System.out.println("returnlist=" + returnlist);
	}
}
