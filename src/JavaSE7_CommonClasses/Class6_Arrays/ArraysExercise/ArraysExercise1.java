package JavaSE7_CommonClasses.Class6_Arrays.ArraysExercise;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ArraysExercise1
{
	public static void main(String[] args)
	{
		// 自定义Book类 里面包含name和price 按price排序(从大到小)
		// 要求使用两种方式排序有一个 Book[] books = 4本书对象
		// 使用前面学习过的传递 实现Comparator接口匿名内部类 也称为定制排序
		// 可以按照 price (1)从大到小(2)从小到大(3) 按照书名长度从大到小
		Book[] books = new Book[4];
		books[0] = new Book("计算机组成原理", 100);
		books[1] = new Book("操作系统", 90);
		books[2] = new Book("计算机网络", 80);
		books[3] = new Book("数据结构与算法", 150);
		Arrays.sort(books, new Comparator()
		{
			@Override
			public int compare(Object o1, Object o2)
			{
				Book b1 = (Book) o1;
				Book b2 = (Book) o2;
				double priceVal = b1.getPrice() - b2.getPrice();
				if (priceVal > 0)
					return -1;
				else if (priceVal < 0)
					return 1;
				else
					return 0;
			}
		});
		System.out.println("价格由低到高" + Arrays.toString(books));
		Arrays.sort(books, new Comparator()
		{
			@Override
			public int compare(Object o1, Object o2)
			{
				Book b1 = (Book) o1;
				Book b2 = (Book) o2;
				double priceVal = b1.getPrice() - b2.getPrice();
				if (priceVal < 0)
					return -1;
				else if (priceVal > 0)
					return 1;
				else
					return 0;
			}
		});
		System.out.println("价格由高到低" + Arrays.toString(books));
		Arrays.sort(books, new Comparator()
		{
			@Override
			public int compare(Object o1, Object o2)
			{
				Book b1 = (Book) o1;
				Book b2 = (Book) o2;
				return b2.getName().length() - b1.getName().length();
			}
		});
		System.out.println("书名长度从大到小" + Arrays.toString(books));
	}
}

class Book
{
	private String name;
	private double price;

	public Book(String name, int price)
	{
		this.name = name;
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

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return name +
				":" + price;
	}
}