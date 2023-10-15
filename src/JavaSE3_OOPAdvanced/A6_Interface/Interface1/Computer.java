package JavaSE3_OOPAdvanced.A6_Interface.Interface1;

public class Computer
{
	public void work(UsbInterface usbInterface)
	{
		// 通过接口调用方法
		usbInterface.start();
		usbInterface.stop();
	}
}
