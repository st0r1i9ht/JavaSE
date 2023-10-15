package JavaSE8_Collection.collection3_set.set2_HashSet.HashSet1;

import java.util.HashSet;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet01
{
	public static void main(String[] args)
	{
		HashSet hashSet = new HashSet();
		// 1. 在执行add方法后 会返回一个boolean值
		// 2. 如果添加成功 返回ture 否则返回false
		// 3. 可以通过 remove指定删除哪个对象
		System.out.println(hashSet.add("john"));// T
		System.out.println(hashSet.add("lucy"));// T
		System.out.println(hashSet.add("john"));// F
		System.out.println(hashSet.add("jack"));// T
		System.out.println(hashSet.add("Rose"));// T

		hashSet.remove("john");
		System.out.println("set=" + hashSet);// 3

		// 不能加入相同元素
		hashSet = new HashSet();
		System.out.println("set=" + hashSet);
		hashSet.add("lucy");
		hashSet.add("lucy");
		hashSet.add(new Dog("tom"));
		hashSet.add(new Dog("tom")); // 两个不同对象
		System.out.println("set=" + hashSet);

		// 底层机制复杂
		hashSet.add(new String("abc"));// T
		hashSet.add(new String("abc"));// F
		System.out.println(hashSet);
	}
}

class Dog
{
	private String name;

	public Dog(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return this.name;
	}
}