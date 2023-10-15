package JavaSE8_Collection.collection1_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class CollectionFor
{
	@SuppressWarnings({"all"})
	public static void main(String[] args)
	{
		Collection coll = new ArrayList();
		coll.add(new Book("Book1", "author1", 10.1));
		coll.add(new Book("Book2", "author2", 5.1));
		coll.add(new Book("Book3", "author3", 34.6));

		// Collection集合使用增强For 底层仍然是迭代器 简化版的迭代器
		for (Object book : coll)
		{
			System.out.println(book);
		}
		// 快捷键I
		for (Object o : coll)
		{
			System.out.println(o);
		}
	}
}