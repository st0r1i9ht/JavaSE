package JavaSE3_OOPAdvanced.A7_InterfacePoly.InterfacePoly3_PolyPass;

/*
	多态传递现象
 */
public class InterfacePolyPass
{
	public static void main(String[] args)
	{
		//接口类型的引用可以指向 实现该接口的类的对象实例
		IG ig = new Teacher();
		//如果IG 继承了IH接口 而Teacher类实现了IG接口
		//那么实际上就相当于Teacher类也实现了IH接口
		//接口多态传递现象
		IH ih = new Teacher();
	}
}

interface IH
{

}

interface IG extends IH
{

}

class Teacher implements IG
{

}