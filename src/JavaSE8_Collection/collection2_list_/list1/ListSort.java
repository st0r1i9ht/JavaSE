package JavaSE8_Collection.collection2_list_.list1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ListSort
{
	@SuppressWarnings({"all"})
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add(new Book("红楼梦", "曹雪芹", 100.0));
		list.add(new Book("西游记", "吴承恩", 10.0));
		list.add(new Book("水浒传", "施耐庵", 9.0));
		list.add(new Book("三国演义", "罗贯中", 80.0));

		for (Object o : list)
		{
			System.out.println(o);
		}
		System.out.println("排序后");
		// 冒泡排序
		sort(list);

		for (Object o : list)
		{
			System.out.println(o);
		}

	}

	public static void sort(List list)
	{
		int listSize = list.size();
		for (int i = 0; i < listSize - 1; i++)
			for (int j = 0; j < listSize - 1 - i; j++)
			{
				// 取出对象
				Book book1 = (Book) list.get(j);
				Book book2 = (Book) list.get(j + 1);
				// 交换
				if (book1.getPrice() > book2.getPrice())
				{
					list.set(j, book2);
					list.set(j + 1, book1);
				}
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
		return "名称：" + name + "\t\t价格：" + price + "\t\t作者：" + author;
	}
}