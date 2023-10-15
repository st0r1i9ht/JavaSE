package JavaSE1_OOPMiddle.OOPMiddle3_Encap.Encap;

public class Encapsulation01
{
	public static void main(String[] args)
	{
		Person person = new Person();
		person.setName("jack");
		person.setAge(30);
		person.setSalary(30000);
		System.out.println(person.info());
	}
}

class Person
{
	public String name;// 名字公开
	private int age;// age 私有化
	private double salary;

	// 无参构造器
	public Person()
	{
	}

	// 封装和构造器
	public Person(String name, int age, double salary)
	{
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name.length() >= 2 && name.length() <= 6)
			this.name = name;
		else
		{
			System.out.println("姓名输入有误 name长度应大于2小于6 默认姓名为'无名'");
			this.name = "无名";
		}
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		if (age >= 1 && age <= 120)
			this.age = age;
		else
		{
			System.out.println("设置的年龄有误 1 <= age <= 120 默认年龄已设置为18");
			this.age = 18;
		}
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String info()
	{
		return name + " " + age + " " + salary;
	}
}