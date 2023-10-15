package JavaSE3_OOPAdvanced.A5_abstract.a4_DesignTemplate;

public class B extends Template
{
	@Override
	public void job()
	{
		long num = 0;
		for (int i = 1; i <= 100000000; i++)
		{
			num *= i;
		}
	}
}