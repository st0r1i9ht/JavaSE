package JavaSE3_OOPAdvanced.A6_Interface.Interface3;

public class Interface03
{
	public static void main(String[] args)
	{
		MysqlDB mysqlDB = new MysqlDB();
		t(mysqlDB);
		OracleDB oracleDB = new OracleDB();
		t(oracleDB);
	}

	public static void t(DBInterface db)
	{
		db.connect();
		db.close();
	}
}