package JavaSE3_OOPAdvanced.A8_InnerClass.InnerClass5_AnonymousExperiment;

public class Experiment1
{
	public static void main(String[] args)
	{
		//匿名内部类返回对象 可以当作实参直接传递
		f1(new IL()
		{
			@Override
			public void show()
			{
				System.out.println("Anonymous1 show");
			}
		});

		f1(new IL()
		{
			@Override
			public void show()
			{
				System.out.println("Anonymous2 show");
			}
		});
	}

	public static void f1(IL il)
	{
		il.show();//动态绑定
	}
}

interface IL
{
	void show();
}