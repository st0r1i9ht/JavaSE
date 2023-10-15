package JavaSE7_CommonClasses.Class6_Arrays.Arrays1_Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ArraysSort
{
	public static void main(String[] args)
	{
		Integer[] integers = {1, 20, 90};
		// 遍历数组 直接使用Arrays.toString方法 显示数组
		//     public static String toString(Object[] a) {
		//         if (a == null)
		//             return "null";
		//
		//         int iMax = a.length - 1;
		//         if (iMax == -1)
		//             return "[]";
		//
		//         StringBuilder b = new StringBuilder();
		//         b.append('[');
		//         for (int i = 0; ; i++) {
		//             b.append(String.valueOf(a[i]));
		//             if (i == iMax)
		//                 return b.append(']').toString();
		//             b.append(", ");
		//         }
		//     }
		System.out.println(Arrays.toString(integers));

		// sort
		Integer arr[] = {1, -1, 7, 0, 89};
		// 默认排序
		// 1. 冒泡排序麻烦 直接使用Arrays.sort方法
		// 2. 数组是引用类型 通过sort排序后会直接影响到实参arr
		// 3. sort重载的 也可以通过传入一个接口 Comparator实现定制排序
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// 定制排序
		// 1. 调用定制排序时 传入两个参数
		//      param1. 排序的数组 arr
		//      param2. 实现了 Comparator 接口的匿名内部类 要求实现compare方法
		// 2. 最终到 TimSort类的 static <T> void sort(T[] a, int lo, int hi, Comparator<? super T> c,
		//                          T[] work, int workBase, int workLen)
		// 3. 执行到binarySort方法的代码会根据动态绑定机制 c.compare执行传入的匿名内部类的compare
		//             while (left < right) {
		//                 int mid = (left + right) >>> 1;
		//                 if (c.compare(pivot, a[mid]) < 0)
		//                     right = mid;
		//                 else
		//                     left = mid + 1;
		//             }
		// 4. new Comparator()
		// 		{
		// 			@Override
		// 			public int compare(Object o1, Object o2)
		// 			{
		// 				Integer i1 = (Integer) o1;
		// 				Integer i2 = (Integer) o2;
		// 				return i2 - i1;
		// 			}
		// 		}
		// 5. public int compare(Object o1, Object o2) 返回的值是>0还是<0会影响整个排序结果
		// 体现接口编程+动态绑定+匿名内部类综合使用
		// 在底层框架和源码的使用方式非常常见
		Arrays.sort(arr, new Comparator()
		{
			@Override
			public int compare(Object o1, Object o2)
			{
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				return i2 - i1;
			}
		});
	}
}
