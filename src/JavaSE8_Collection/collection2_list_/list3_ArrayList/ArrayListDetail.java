package JavaSE8_Collection.collection2_list_.list3_ArrayList;

import java.util.ArrayList;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ArrayListDetail
{
	public static void main(String[] args)
	{
		// 1. 可以加入多个null
		// 2. 由数组来实现存储
		// 3. 基本等同于Vector 但ArrayList线程不安全 执行效率高
		// 线程不安全 源码 没有synchronized 多线程考虑使用Vector
		// 	public boolean add (E e){
		// 	ensureCapacityInternal(size + 1);  // Increments modCount!!
		// 	elementData[size++] = e;
		// 	return true;
		// }
		ArrayList arrayList = new ArrayList();
		arrayList.add(null);
		arrayList.add("jack");
		arrayList.add(null);
		System.out.println(arrayList);
	}
}
