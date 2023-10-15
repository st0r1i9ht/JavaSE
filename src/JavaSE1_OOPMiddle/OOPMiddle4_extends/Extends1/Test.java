package JavaSE1_OOPMiddle.OOPMiddle4_extends.Extends1;

public class Test
{
	public static void main(String[] args)
	{
		Pupil pupil = new Pupil();
		pupil.name = "name1";
		pupil.age = 11;
		pupil.testing();
		pupil.setScore(50);
		pupil.showInfo();
		System.out.println();

		Graduate graduate = new Graduate();
		graduate.name = "name2";
		graduate.age = 23;
		graduate.testing();
		graduate.setScore(80);
		graduate.showInfo();
	}
}