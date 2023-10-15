package JavaSE8_Collection.collection2_list_.list5_LinkedList;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class LinkedList01
{
	// 模拟双向链表
	public static void main(String[] args)
	{
		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");

		// 连接三个结点 形成双向链表
		node1.next = node2;
		node2.next = node3;
		node3.pre = node2;
		node2.pre = node1;

		Node first = node1;// 让first引用指向node1 双向链表的头结点
		Node last = node3;// 让last引用指向node2 双向链表的尾结点

		// 从头到尾遍历
		while (true)
		{
			if (first == null)
				break;
			System.out.println(first);
			first = first.next;
		}

		// 从尾到头遍历
		while (true)
		{
			if (last == null)
				break;
			System.out.println(last);
			last = last.pre;
		}

		// 添加对象
		// 先创建结点
		Node node4 = new Node("node4");
		// 将新结点加入到双向链表
		node4.pre = node2;
		node4.next = node3;
		node2.next = node4;
		node3.pre = node4;

		// 遍历 先重置first
		first = node1;
		while (true)
		{
			if (first == null)
				break;
			System.out.println(first);
			first = first.next;
		}
	}
}

// 定义一个Node类 Node对象 表示双向链表的一个结点
class Node
{
	public Object item;
	public Node next;
	public Node pre;

	public Node(Object item)
	{
		this.item = item;
	}

	@Override
	public String toString()
	{
		return "Node{" +
				"item=" + item +
				'}';
	}
}
