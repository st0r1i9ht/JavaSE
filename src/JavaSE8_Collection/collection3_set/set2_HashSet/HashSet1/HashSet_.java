package JavaSE8_Collection.collection3_set.set2_HashSet.HashSet1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet_
{
	public static void main(String[] args)
	{
		// 1.构造器源码
		// HashSet底层实际是HashMap
		//     public HashSet() {
		//         map = new HashMap<>();
		//     }
		// 2. HashSet可以存放null但是只能存放一个 元素不能重复
		// 3. 不保证元素是有序的 取决于null后再确定索引的结果
		Set hashSet = new HashSet();
		hashSet.add(null);
		hashSet.add(null);
		System.out.println("hashSet=" + hashSet);
	}
}
