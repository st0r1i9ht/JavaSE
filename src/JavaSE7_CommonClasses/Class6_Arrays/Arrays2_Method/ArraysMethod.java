package JavaSE7_CommonClasses.Class6_Arrays.Arrays2_Method;

import java.util.Arrays;
import java.util.List;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ArraysMethod
{
	public static void main(String[] args)
	{
		Integer[] arr = {1, 2, 90, 123, 567};
		// binarySearch通过二分搜索法进行查找 要求必须排序
		// 1. 使用binarySearch 二叉查找
		// 2. 要求该数组是有序的
		// 3. 如果不存在返回return -(low + 1);  // key not found. 元素应该存在的位置
		int index = Arrays.binarySearch(arr, 92);
		System.out.println("index=" + index);

		// copyOf数组元素复制
		// 1. 从arr数组中 拷贝arr.length个元素到newArr数组中
		// 2. 如果拷贝的长度 > arr.length就在数组后面增加null
		// 3. 如果拷贝的长度 < 0 抛出NegativeArraySizeException
		// 4. 该方法的底层使用的是System.arraycopy方法
		Integer[] newArr = Arrays.copyOf(arr, arr.length + 1);
		System.out.println(Arrays.toString(newArr));

		// fill数组元素的填充
		// 1. 使用99去填充num数组 替换掉所有元素
		Integer[] num = new Integer[]{9, 3, 2};
		Arrays.fill(num, 99);
		System.out.println(Arrays.toString(num));

		// equals比较两个数组元素内容是否完全一致
		// 1. 如果arr和arr2数组的元素一样 返回true
		// 2. 如果不完全一样返回false
		Integer[] arr2 = {1, 2, 90, 123, 567};
		boolean equals = Arrays.equals(arr, arr2);
		System.out.println("equals=" + equals);

		// asList 将一组值转成list
		// 1. asList方法会将(1, 2, 3, 4, 5)数据转成一个List集合
		// 2. 返回的 list编译类型List(接口)
		// 3. 运行类型 java.util.Arrays$ArrayList Arrays的静态内部类
		// private static class ArrayList<E> extends AbstractList<E>
		//         implements RandomAccess, java.io.Serializable
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("list=" + list);
		System.out.println("listClass=" + list.getClass());
	}
}
