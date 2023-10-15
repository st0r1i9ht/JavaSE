package JavaSE3_OOPAdvanced.A2_CodeBlock.CB1;

public class Test
{
	public static void main(String[] args)
	{
		Movie movie = new Movie("星际穿越");
		Movie movie1 = new Movie("沙丘", 40);
		Movie movie2 = new Movie("盗梦空间", 45, "诺兰");


	}
}

class Movie
{
	private String name;
	private double price;
	private String director;

	// 构造器初始化前先调用代码块
	{
		System.out.println("电影屏幕打开");
		System.out.println("广告开始");
		System.out.println("电影正式开始");
	}

	// 构造器重载内有相同语句 代码复用性低
	public Movie(String name)
	{
		this.name = name;
		System.out.println("Movie(String name) active");
	}

	public Movie(String name, double price)
	{
		this.name = name;
		this.price = price;
		System.out.println("Movie(String name, double price) active");
	}

	public Movie(String name, double price, String director)
	{
		this.name = name;
		this.price = price;
		this.director = director;
		System.out.println("Movie(String name, double price, String director)");
	}
}