package JavaSE7_CommonClasses.Class6_Arrays.Arrays1_Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ArraysSortCustom
{
	public static void main(String[] args)
	{
		int[] arr = {1, -1, 8, 0, 2};
		bubble1(arr);
		System.out.println(Arrays.toString(arr));
		bubble2(arr, new Comparator()
		{
			@Override
			public int compare(Object o1, Object o2)
			{
				int i1 = (Integer) o1;
				int i2 = (Integer) o2;
				return i2 - i1;
			}
		});
		System.out.println(Arrays.toString(arr));
	}

	// 使用冒泡排序
	public static void bubble1(int[] arr)
	{
		int temp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - 1 - i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// 定制冒泡
	public static void bubble2(int[] arr, Comparator c)
	{
		int temp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - 1 - i; j++)
			{
				// 数组排序由c.compare(arr[j], arr[j + 1])返回的值决定
				if (c.compare(arr[j], arr[j + 1]) > 0)
				{
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
