package JavaSE1_OOPMiddle.OOPMiddle4_extends.Extends1;

//父类
public class Extends01
{
	//共有属性
	public String name;
	public int age;
	private double score;

	//共有方法
	public void setScore(double score)
	{
		this.score = score;
	}

	public void showInfo()
	{
		System.out.println(name + " " + age + " " + score);
	}
}