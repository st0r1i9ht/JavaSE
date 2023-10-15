package JavaSE1_OOPMiddle.OOPMiddle8_ObjectClass.Object1_Equals1;

public class EqualsExercise
{
	/*
	 * 重写自定义类的equals方法
	 * 比较自定义类的属性是否相等
	 */
	public static void main(String[] args)
	{
		Person person = new Person("name", 0, 'm');
		Person person1 = new Person("name", 0, 'm');

		System.out.println(person.equals(person1));
	}
}

class Person
{
	private String name;
	private int age;
	private char gender;

	public Person(String name, int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public boolean equals(Object obj)
	{
		if (obj instanceof Person)//判断obj对象是否属于Person类
		{
			Person obj1 = (Person) obj;
			return this.name.equals(obj1.name) && this.age == obj1.age && this.gender == obj1.gender;
		}
		return false;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public char getGender()
	{
		return gender;
	}

	public void setGender(char gender)
	{
		this.gender = gender;
	}
}