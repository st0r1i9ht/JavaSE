package JavaSE7_CommonClasses.Class10_Exercise.Exercise2_RegistrationProcess;

class RegistrationProcess
{
	public static void main(String[] args)
	{
		String name = "st0r1i9ht";
		String pwd = "123456";
		String email = "st0r1i9ht@gmial.com";

		try
		{
			userRegister(name, pwd, email);
			System.out.println("注册成功");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	/*
	 * 输入用户名/密码/邮箱, 如果信息录入正确 则提示注册成功 否则生成异常对象
	 * 要求
	 * 1. 用户名长度为2/3/4
	 * 2. 密码长度为6 要求全是数字isDigital
	 * 3. 邮箱中包含@和. 并且@在.的前面
	 * 思路分析
	 * 1. 先编写方法userRegister(String name, String pwd, String email)
	 * 2. 针对输入的内容进行校核 如果发现有问题 就抛出异常 给出提示
	 */
	public static void userRegister(String name, String pwd, String email)
	{
		if (!(name != null && pwd != null && email != null))
		{
			throw new RuntimeException("参数不能为null");
		}

		int userLength = name.length();
		if (!(userLength >= 2 && userLength <= 10))
		{
			throw new RuntimeException("用户名长度为2-4");
		}

		if (!(pwd.length() == 6))
		{
			throw new RuntimeException("密码长度为6 要求全是数字");
		}

		int i = email.indexOf('@');
		int j = email.indexOf('.');
		if (!(i > 0 && j > i))
		{
			throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
		}
	}

	public static boolean isDigital(String str)
	{
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++)
		{
			if (!(chars[i] > '0' && chars[i] < '9'))
			{
				return false;
			}
		}

		return true;
	}
}
