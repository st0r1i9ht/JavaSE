package JavaSE8_Collection.collection1_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class CollectionIterator
{
	@SuppressWarnings({"all"})
	public static void main(String[] args)
	{
		Collection coll = new ArrayList();
		coll.add(new Book("Book1", "author1", 10.1));
		coll.add(new Book("Book2", "author2", 5.1));
		coll.add(new Book("Book3", "author3", 34.6));
		System.out.println("coll=" + coll);
		// 遍历coll集合
		// 1. 先得到coll对应的迭代器
		Iterator iterator = coll.iterator();
		// 2. 使用While遍历循环
		while (iterator.hasNext())// 判断是否还有数据
		{
			Object obj = iterator.next();// 返回下一个元素 类型是Object
			System.out.println("obj=" + obj);
		}
		// 快速生成itit
		// 快捷键菜单ctrl + j
		// 3. 当退出当前while循环后 iterator迭代器 指向最后的元素
		// iterator.next();//NoSuchElementException
		// 4. 再次遍历需要重置迭代器
		iterator = coll.iterator();
		while (iterator.hasNext())
		{
			Object next = iterator.next();
			System.out.println(next);
		}
	}
}

class Book
{
	private String name;
	private String author;
	private Double price;

	public Book(String name, String author, Double price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + ", price=" + price + '}';
	}
}