package JavaSE2_HouseRent.View;

import JavaSE2_HouseRent.Domain.House;
import JavaSE2_HouseRent.Servise.HouseService;
import JavaSE2_HouseRent.Utils.Utility;

import java.util.Scanner;

public class HouseView
{
	private boolean loop = true;
	private char key;
	private HouseService houseService = new HouseService();

	//退出确认
	public void exit()
	{
		char c = Utility.readConfirmSelection();
		if ('Y' == c)
			loop = false;
	}
	// 删除房屋
	public void delHouse()
	{
		System.out.println("==========删除房间==========");
		System.out.println("请输入待删除房屋的编号(-1退出):");
		int delId = Utility.readIntL(3);
		if (-1 == delId)
		{
			System.out.println("==========放弃删除==========");
			return;
		}
		char choice = Utility.readConfirmSelection();
		if ('Y' == choice)
			if (houseService.del(delId))
				System.out.println("删除成功");
			else
				System.out.println("删除失败");
		else
			System.out.println("==========放弃删除==========");
	}

	// 添加房屋
	public void addHouse()
	{
		System.out.println("==========添加房屋==========");
		System.out.println("姓名: ");
		String name = Utility.readString(8);
		System.out.println("电话: ");
		String phone = Utility.readString(11);
		System.out.println("地址: ");
		String address = Utility.readString(16);
		System.out.println("月租: ");
		int rent = Utility.readIntL(10);
		System.out.println("状态(已出租/未出租): ");
		String state = Utility.readString(3);
		House house = new House(name, phone, address, rent, state);
		houseService.add(house);
	}

	// 显示房屋列表
	public void listHouse()
	{
		System.out.println("==========房屋列表==========");
		System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(已出租/未出租)");
		House[] houses = houseService.list();
		for (int i = 0; i < houses.length; i++)
		{
			if (houses[i] != null)
				System.out.println(houses[i]);
		}
		System.out.println();
	}

	// 显示主菜单
	public void mainMenu()
	{
		do
		{
			System.out.println("\n==========房屋出租系统菜单==========");
			System.out.println("\t\t\t1 新增房源");
			System.out.println("\t\t\t2 查找房屋");
			System.out.println("\t\t\t3 删除房屋信息");
			System.out.println("\t\t\t4 修改房屋信息");
			System.out.println("\t\t\t5 显示房屋信息");
			System.out.println("\t\t\t6 退出");
			System.out.print("请输入你的选择(1-6):");
			Scanner scanner = new Scanner(System.in);
			key = scanner.next().charAt(0);

			switch (key)
			{
				case '1':
					addHouse();
					break;
				case '2':
					System.out.println("查找");
					break;
				case '3':
					delHouse();
					break;
				case '4':
					System.out.println("修改");
					break;
				case '5':
					listHouse();
					break;
				case '6':
					exit();
					break;
				default:
					System.out.println("输入有误");
			}
		} while (loop);
	}
}