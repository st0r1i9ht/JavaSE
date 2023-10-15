package JavaSE1_OOPMiddle.OOPMiddle7_poly.poly7_PolyParameter;

/*
 * 多态参数
 */
public class PolyParameter
{
	public static void main(String[] args)
	{
		Worker tom = new Worker("tom", 2500);
		Manager milan = new Manager("5000", 5000, 200000);

		PolyParameter polyParameter = new PolyParameter();
		polyParameter.showEmpAnnual(tom);
		polyParameter.showEmpAnnual(milan);

		polyParameter.testWork(tom);
		polyParameter.testWork(milan);
	}

	//动态绑定实现多态参数
	public void showEmpAnnual(Employee e)
	{
		System.out.println(e.getAnnual());
	}

	public void testWork(Employee e)
	{
		if (e instanceof Worker)
			((Worker) e).work();
		else if (e instanceof Manager)
			((Manager) e).manage();
		else
			System.out.println("wrong");
	}
}