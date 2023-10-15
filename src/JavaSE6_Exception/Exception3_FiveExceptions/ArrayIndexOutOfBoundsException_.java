package JavaSE6_Exception.Exception3_FiveExceptions;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ArrayIndexOutOfBoundsException_
{
	// 数组下标越界异常
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3};
		for (int i = 0; i <= arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
