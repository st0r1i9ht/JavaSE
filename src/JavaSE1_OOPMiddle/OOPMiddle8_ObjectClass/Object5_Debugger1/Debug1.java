package JavaSE1_OOPMiddle.OOPMiddle8_ObjectClass.Object5_Debugger1;

public class Debug1
{
	public static void main(String[] args)
	{
		//逐行执行代码 F8
		int sum = 0;
		for (int i = 0; i < 5; i++)
		{
			sum += i;
			System.out.println(i +" " + sum);
		}
	}
}
