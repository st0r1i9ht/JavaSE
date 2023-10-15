package JavaSE3_OOPAdvanced.A6_Interface.Interface1;

public class Interface01
{
	public static void main(String[] args)
	{
		//接口引用可以指向实现了接口的类的对象
		// 创建Phone Camera对象
		Camera camera = new Camera();
		Phone phone = new Phone();
		// 创建计算机
		Computer computer = new Computer();
		computer.work(phone); // 把phone接入到Computer
		System.out.println("==========");
		computer.work(camera);// 把camera接入到Computer
	}
}
