package JavaSE1_OOPMiddle.OOPMiddle7_poly.Poly1;

public class Master
{
	private String name;

	public Master(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void feed(Animal animal, Food food)
	{
		System.out.println(name + "->" + animal.getName() + " " + food.getName());
	}

}
