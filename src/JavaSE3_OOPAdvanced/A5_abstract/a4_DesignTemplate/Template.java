package JavaSE3_OOPAdvanced.A5_abstract.a4_DesignTemplate;

/*
 * 抽象类-模板设计模式
 */
public abstract class Template
{
	public abstract void job();
	public void cal()
	{
		// 得到开始时间
		long start = System.currentTimeMillis();
		job();// 动态绑定
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}
}