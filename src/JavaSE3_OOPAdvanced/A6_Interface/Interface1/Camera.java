package JavaSE3_OOPAdvanced.A6_Interface.Interface1;

public class Camera implements UsbInterface // 本质是实现了接口的方法
{
	@Override
	public void start()
	{
		System.out.println("Camera start");
	}

	@Override
	public void stop()
	{
		System.out.println("Camera stop");
	}
}
