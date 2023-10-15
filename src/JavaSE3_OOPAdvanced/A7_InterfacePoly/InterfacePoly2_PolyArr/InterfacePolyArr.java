package JavaSE3_OOPAdvanced.A7_InterfacePoly.InterfacePoly2_PolyArr;

public class InterfacePolyArr
{
	public static void main(String[] args)
	{
		Usb[] usbs = new Usb[2];
		usbs[0] = new Phone();
		usbs[1] = new Camera();

		for (int i = 0; i < 2; i++)
		{
			usbs[i].work();//动态绑定
			if (usbs[i] instanceof Phone)
			{
				((Phone)usbs[i]).call();//向下转型
			}
		}
	}
}

interface Usb
{
	void work();
}

class Phone implements Usb
{
	public void call()
	{
		System.out.println("Phone call");
	}

	@Override
	public void work()
	{
		System.out.println("Phone work");
	}
}

class Camera implements Usb
{

	@Override
	public void work()
	{
		System.out.println("Camera work");
	}
}