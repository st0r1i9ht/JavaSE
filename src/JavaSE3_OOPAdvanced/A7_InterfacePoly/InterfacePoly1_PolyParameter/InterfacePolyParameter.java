package JavaSE3_OOPAdvanced.A7_InterfacePoly.InterfacePoly1_PolyParameter;

public class InterfacePolyParameter
{
	public static void main(String[] args)
	{
		//接口的多态
		//接口类型的变量if1可以指向 实现IF接口的类的对象实例
		IF if1 = new Monster();
		if1 = new Car();

		//继承体现多态
		//父类类型的变量a可以指向继承A的子类的对象实例 向上转型
		A a = new B();
		a = new C();
	}
}

class A
{

}

class B extends A
{

}

class C extends A
{

}

interface IF
{

}

class Monster implements IF
{

}

class Car implements IF
{

}