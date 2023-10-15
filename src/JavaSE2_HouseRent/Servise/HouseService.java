package JavaSE2_HouseRent.Servise;

import JavaSE2_HouseRent.Domain.House;

public class HouseService
{
	private House[] houses;
	private int houseNums = 0;
	private int idCounter = 0;

	//初始化房屋个数
	public HouseService()
	{
		houses = new House[1];
	}

	//删除房屋
	public boolean del(int delId)
	{
		int index = -1;
		for (int i = 0; i < houses.length; i++)
		{
			if (delId == houses[i].getId())
			{
				index = i;
			}
		}

		if (index == -1)
		{
			return false;
		}
		//移动数组元素
		for (int i = index; i < houseNums - 1; i++)
		{
			houses[i] = houses[i + 1];
		}
		houses[--houseNums] = null;// 置空尾部数组 房屋数量更新

		return true;
	}

	//数组扩容
	public void moreHouses()
	{
		House[] newHouses = new House[houses.length + 1];
		for (int i = 0; i < houses.length; i++)
		{
			newHouses[i] = houses[i];
		}
		houses = newHouses;
	}

	//添加房屋
	public void add(House newHouse)
	{
		if (houseNums == houses.length)
			moreHouses();
		houses[houseNums++] = newHouse;
		newHouse.setId(++idCounter);//id更新
	}

	public House[] list()
	{
		return houses;
	}
}