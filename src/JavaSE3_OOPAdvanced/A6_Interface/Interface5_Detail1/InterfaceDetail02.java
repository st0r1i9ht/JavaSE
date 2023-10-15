package JavaSE3_OOPAdvanced.A6_Interface.Interface5_Detail1;

public class InterfaceDetail02
{
	public static void main(String[] args)
	{
		//System.out.println(IB.n1);
		//证明是static 可以用类调用
		//IB.n1 = 30;
		//证明是final 无法修改值
	}
}

interface IB
{
	//接口中的属性 只能是final的 而且是public static final 因此接口中属性的访问形式为接口名.属性名
	int n1 = 10;//等价 public static final int n1 = 10;
	//加修饰符会报错 证明不能是protected private
	//在不同包下能够访问 证明是public不是默认
}

interface IC
{

}

//一个类可以同时实现多个接口
class Pig implements IB, IC
{

}

//接口不能继承类 可以继承多个接口
interface ID extends IB, IC
{

}

//接口的修饰符只能是public或默认 与类一致