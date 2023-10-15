package JavaSE1_OOPMiddle.OOPMiddle3_Encap.Encap1;

public class Account
{
	private String name;
	private double balance;
	private String pwd;

	public Account()
	{
	}

	public Account(String name, double balance, String pwd)
	{
		this.setName(name);
		this.setBalance(balance);
		this.setPwd(pwd);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name.length() >= 2 && name.length() <= 4)
			this.name = name;
		else
		{
			System.out.println("姓名要求2-4个字 默认'无名'");
			this.name = "无名";
		}
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		if (balance > 20)
			this.balance = balance;
		else
		{
			System.out.println("余额要求大于20 默认0");
		}
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		if (pwd.length() == 6)
			this.pwd = pwd;
		else
		{
			System.out.println("密码要求6位 默认123456");
			this.pwd = "123456";
		}
	}

	public boolean cmpPwd(String pwd)
	{
		return this.pwd.equals(pwd);
	}

	public void shouInfo(String pwd)
	{
		if (cmpPwd(pwd))
			System.out.println(name + " " + balance);
		else
			System.out.println("你无权查看");
	}
}