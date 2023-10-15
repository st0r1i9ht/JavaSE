package JavaSE3_OOPAdvanced.A5_abstract.a4_DesignTemplate;

public class TestTemplate
{
	public static void main(String[] args)
	{
		Template template = new A();
		template.cal();
		template = new B();
		template.cal();
	}
}