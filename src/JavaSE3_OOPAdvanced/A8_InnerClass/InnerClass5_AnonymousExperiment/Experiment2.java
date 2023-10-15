package JavaSE3_OOPAdvanced.A8_InnerClass.InnerClass5_AnonymousExperiment;

public class Experiment2
{
	public static void main(String[] args)
	{
		CellPhone cellPhone = new CellPhone();
		//运行类型 匿名内部类
		cellPhone.alarmClock(new Bell()
		{
			@Override
			public void ring()
			{
				System.out.println("alarm ring");
			}
		});
		cellPhone.alarmClock(new Bell()
		{
			@Override
			public void ring()
			{
				System.out.println("Class ring");
			}
		});
	}
}

interface Bell
{
	void ring();
}

class CellPhone
{
	public void alarmClock(Bell bell)
	{
		bell.ring();//动态绑定
	}
}