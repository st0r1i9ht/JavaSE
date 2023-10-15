package JavaSE3_OOPAdvanced.A6_Interface.Interface3;

public class OracleDB implements DBInterface
{
	@Override
	public void connect()
	{
		System.out.println("connect Oracle");
	}

	@Override
	public void close()
	{
		System.out.println("close Oracle");
	}
}