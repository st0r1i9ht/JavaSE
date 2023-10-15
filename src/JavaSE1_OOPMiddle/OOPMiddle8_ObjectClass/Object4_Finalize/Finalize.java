package JavaSE1_OOPMiddle.OOPMiddle8_ObjectClass.Object4_Finalize;

public class Finalize
{
	/*
	 * 垃圾回收
	 * finalize 开发中很少用
	 */
	public static void main(String[] args)
	{
		Car car = new Car("car");
		car = null;
		// car失去引用 垃圾回收器回收（销毁）对象 释放内存空间
		// 对象销毁前，会调用该对象的finalize
		// 此时 finalize 可以重写以实现功能需求
		// 垃圾回收机制由JVM算法（GC算法）决定 不是一直在回收
		System.gc();// 主动调用垃圾回收机制

		System.out.println("end");
	}
}

class Car
{
	private String name;

	public Car(String name)
	{
		this.name = name;
	}

	//重写finalize

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Override finalize");
		super.finalize();
	}
}