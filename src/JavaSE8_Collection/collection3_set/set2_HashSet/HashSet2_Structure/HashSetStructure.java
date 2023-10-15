package JavaSE8_Collection.collection3_set.set2_HashSet.HashSet2_Structure;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetStructure
{
	public static void main(String[] args)
	{
		// 模拟HashSet底层(HashMap底层结构)
		// 数组+链表/树

		// 1. 创建一个数组 数组的类型是Node[]
		Node[] table = new Node[16];
		Node john = new Node("john", null);

		table[2] = john;
		Node jack = new Node("jack", null);
		john.next = jack;
		System.out.println(table);
	}
}

// 结点
class Node
{
	Object item; // 数据域
	Node next; // 指针域

	public Node(Object item, Node next)
	{
		this.item = item;
		this.next = next;
	}
}