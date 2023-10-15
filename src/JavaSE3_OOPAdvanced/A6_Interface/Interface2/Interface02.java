package JavaSE3_OOPAdvanced.A6_Interface.Interface2;

public class Interface02
{
	public static void main(String[] args)
	{
		IA.cry();
	}
}

class A implements IA
{
	@Override
	public void hi()
	{
		System.out.println("A hi()");
	}
}