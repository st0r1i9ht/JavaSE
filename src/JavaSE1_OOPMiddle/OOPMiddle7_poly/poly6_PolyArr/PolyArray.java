package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly6_PolyArr;

public class PolyArray
/*
 * 多态数组
 */
{
	public static void main(String[] args)
	{
		Person[] persons = new Person[5];//类数组开五个空间 每个空间都没东西
		// 为每个数组开空间 创建对象
		persons[0] = new Person("jack", 20);
		persons[1] = new Student("jack", 18, 100);
		persons[2] = new Student("smith", 19, 30.1);
		persons[3] = new Teacher("scott", 30, 20000);
		persons[4] = new Teacher("king", 50, 25000);

		for (int i = 0; i < persons.length; i++)
		{
			System.out.println(persons[i].show());

			if (persons[i] instanceof Student)
				((Student) persons[i]).learn();
			else if (persons[i] instanceof Teacher)
				((Teacher) persons[i]).teach();
			else
				System.out.println("wrong");
		}
	}
}