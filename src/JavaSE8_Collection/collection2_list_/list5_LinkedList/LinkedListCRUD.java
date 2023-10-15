package JavaSE8_Collection.collection2_list_.list5_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
// ArrayList 可变数组 增删效率低 改查效率高
// LinkedList 双向链表 增删效率高 改查效率低
@SuppressWarnings({"all"})
public class LinkedListCRUD
{
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		// 添加
		linkedList.add(1);
		linkedList.add(2);
		System.out.println(linkedList);
		// 1.     public LinkedList() {
		//     }
		// 2.  此时first last = null
		// 3. 添加
		// public boolean add(E e) {
		//         linkLast(e);
		//         return true;
		//     }
		// 4. 将新的结点 加入到双向链表的最后
		//     void linkLast(E e) {
		//         final Node<E> l = last;
		//         final Node<E> newNode = new Node<>(l, e, null);
		//         last = newNode;
		//         if (l == null)
		//             first = newNode;
		//         else
		//             l.next = newNode;
		//         size++;
		//         modCount++;
		//     }

		// 删除
		linkedList.remove();// 默认删除第一个结点
		// linkedList.remove(2);
		System.out.println(linkedList);

		// 源码
		// 1.     public E remove() {
		//         return removeFirst();
		//     }
		// 2.     public E removeFirst() {
		//         final Node<E> f = first;
		//         if (f == null)
		//             throw new NoSuchElementException();
		//         return unlinkFirst(f);
		//     }
		// 3. 执行unlinkedFirst
		//  private E unlinkFirst(Node<E> f) {
		//         // assert f == first && f != null;
		//         final E element = f.item;
		//         final Node<E> next = f.next;
		//         f.item = null;
		//         f.next = null; // help GC
		//         first = next;
		//         if (next == null)
		//             last = null;
		//         else
		//             next.prev = null;
		//         size--;
		//         modCount++;
		//         return element;
		//     }

		// 修改某个结点
		linkedList.set(0, 999);
		System.out.println(linkedList);

		// 得到某个结点对象
		Object o = linkedList.get(0);// 得到第一个对象
		System.out.println(o);

		// 迭代器遍历
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext())
		{
			Object next = iterator.next();
			System.out.println(next);
		}

		for (Object o1 : linkedList)
		{
			System.out.println(o1);
		}

		for (int i = 0; i < linkedList.size(); i++)
		{
			System.out.println(linkedList.get(i));
		}

	}
}
