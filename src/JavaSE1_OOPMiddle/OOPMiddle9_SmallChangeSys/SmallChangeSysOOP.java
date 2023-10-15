package JavaSE1_OOPMiddle.OOPMiddle9_SmallChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 该类是完成零钱通的各个功能的类
 */
public class SmallChangeSysOOP
{
	// 变量定义区
	boolean loop = true;
	Scanner scanner = new Scanner(System.in);
	String key;
	String details = "----------零钱通明细----------\n";
	double money;
	double balance = 0;
	Date date; // Date是java.util.Date类型 表示日期
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String note;

	public void consMenu()
	{
		do
		{
			this.mainMenu();
		} while (loop);
	}

	// 菜单
	public void mainMenu()
	{
		System.out.println("==========零钱通菜单==========");
		System.out.println("\t\t\t1 零钱通明细");
		System.out.println("\t\t\t2 收益入账");
		System.out.println("\t\t\t3 消费");
		System.out.println("\t\t\t4 退出");

		System.out.print("请选择(1-4): ");
		key = scanner.next();

		switch (key)
		{
			case "1":
				this.detail();
				break;
			case "2":
				this.income();
				break;
			case "3":
				this.pay();
				break;
			case "4":
				this.exit();
				break;
			default:
				System.out.println("选择有误");
		}
	}

	// 完成零钱通明细
	public void detail()
	{
		System.out.println(details);
	}

	// 收益入账
	public void income()
	{
		System.out.print("收益入账金额: ");
		money = scanner.nextDouble();
		if (money <= 0)
		{
			System.out.println("收益<=0");
			return;
		}

		balance += money;
		System.out.println("余额 " + balance);
		date = new Date();// 获取当前日期
		details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额" + balance;
	}

	// 消费
	public void pay()
	{
		System.out.print("消费金额: ");
		money = scanner.nextDouble();
		if (money > balance || money <= 0)
		{
			System.out.println("支付失败\n余额" + balance);
			return;
		}

		System.out.print("消费说明: ");
		note = scanner.next();

		balance -= money;
		System.out.println("余额 " + balance);
		date = new Date();// 获取当前日期
		details += "\n" + note + "\t" + money + "\t" + sdf.format(date) + "\t余额" + balance;
	}

	// 退出
	public void exit()
	{
		String choice;
		while (true)
		{
			System.out.println("你确定退出吗? y/n");
			choice = scanner.next();
			if ("y".equals(choice) || "n".equals(choice))
				break;
		}

		if ("y".equals(choice))
		{
			loop = false;
			System.out.println("----------退出了零钱通项目----------");
		}
	}
}
