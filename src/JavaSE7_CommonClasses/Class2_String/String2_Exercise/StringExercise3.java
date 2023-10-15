package JavaSE7_CommonClasses.Class2_String.String2_Exercise;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class StringExercise3
{
	String str = new String("rhp");
	final char[] ch = {'j', 'a', 'v', 'a'};
	public void change(String str, char ch[])
	{
		str = "java";
		ch[0] = 'h';
	}
	public static void main(String[] args)
	{
		StringExercise3 ex = new StringExercise3();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.println(ex.ch);
	}
}
