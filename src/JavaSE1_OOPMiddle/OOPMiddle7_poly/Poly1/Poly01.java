package JavaSE1_OOPMiddle.OOPMiddle7_poly.Poly1;

/*
 * 多态
 */
public class Poly01
{

	public static void main(String[] args)
	{
		Master tom = new Master("Tom");
		Dog dog = new Dog("dog");
		Bone bone = new Bone("bone");
		Cat cat = new Cat("cat");
		Fish fish = new Fish("fish");
		Pig pig = new Pig("pig");
		Rice rice = new Rice("rice");

		tom.feed(dog, bone);
		tom.feed(cat, fish);
		tom.feed(pig, rice);
	}
}
