package JavaSE7_CommonClasses.Class2_String.String2_Exercise;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringExercise1
{
	public static void main(String[] args)
	{
		String a = "rhp";
		String b = new String("rhp");
		System.out.println(a.equals(b));//T
		System.out.println(a == b);//F
		// 当调用intern方法时，如果池已经包含与equals(Object)方法确定的相当于此String对象的字符串，则返回来自池的字符串
		// 否则，此String对象将添加到池中，并返回对此String对象的引用。
		System.out.println(a == b.intern());//T
		System.out.println(b == b.intern());//F
		System.out.println("==============");
		Person p1 = new Person();
		p1.name = "hello";
		Person p2 = new Person();
		p2.name = "hello";
		System.out.println(p1.name.equals(p2.name));// T
		System.out.println(p1.name == p2.name);// T
		System.out.println(p1.name == "hello");// T

		String s1 = new String("abcd");
		String s2 = new String("abcd");
		System.out.println(s1 == s2);// F
	}
}

class Person
{
	public String name;
}