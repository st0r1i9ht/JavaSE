package JavaSE1_OOPMiddle.OOPMiddle8_ObjectClass.Object5_Debugger3;

import java.util.Arrays;

public class Debug3
{
	public static void main(String[] args)
	{
		int[] arr = {1, -1, 10, -20, 100};
		//看看Arrays.sort方法的底层实现 alt + shift + F7
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}