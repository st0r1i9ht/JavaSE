package JavaSE1_OOPMiddle.OOPMiddle3_Encap.Encap1;

import java.util.Scanner;

public class TestAccount
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		account.setName("st0r");
		account.setBalance(60);
		account.setPwd("123456");

		System.out.print("输入密码查看信息：");
		account.shouInfo(scanner.next());
	}
}