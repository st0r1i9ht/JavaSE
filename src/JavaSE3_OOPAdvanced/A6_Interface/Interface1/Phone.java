package JavaSE3_OOPAdvanced.A6_Interface.Interface1;

// Phone类 实现 UsbInterface
public class Phone implements UsbInterface
{
	@Override
	public void start()
	{
		System.out.println("Phone start");
	}

	@Override
	public void stop()
	{
		System.out.println("Phone stop");
	}
}
