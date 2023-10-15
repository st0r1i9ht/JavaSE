package JavaSE8_Collection.collection2_list_.list3_ArrayList;

import java.util.ArrayList;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class ArrayListSource
{
	@SuppressWarnings({"all"})
	public static void main(String[] args)
	{
		// 1. ArrayList中维护了一个Object类型的elementData
		// transient Object[] elementData// transient 瞬间 表示该属性不会被序列化
		// 2. 当创建ArrayList对象时 如果使用的是无参构造器 则初始elementData容量为0
		// 第一次添加 则扩容elementData为10
		// 如需要再次扩容 则扩容elementData为1.5倍
		// 3. 如果使用的是指定大小的构造器 则初始elementData容量为指定大小
		// 如果需要扩容 则直接扩容elementData为1.5倍

		// 看源码
		// 使用无参构造器创建对象
		//     public ArrayList() {
		//         this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		//     }
		// 创建了一个空的elementData数组={}
		//
		// 使用有参构造器创建和使用ArrayList 除创建不同外 扩容机制和无参构造器没区别
		// 创建了一个指定大小的elementData数组this.elementData = new Object[initialCapacity]
		// ArrayList list = new ArrayList();
		//     public ArrayList(int initialCapacity) {
		//         if (initialCapacity > 0) {
		//             this.elementData = new Object[initialCapacity];
		//         } else if (initialCapacity == 0) {
		//             this.elementData = EMPTY_ELEMENTDATA;
		//         } else {
		//             throw new IllegalArgumentException("Illegal Capacity: "+
		//                                                initialCapacity);
		//         }
		//     }
		ArrayList list = new ArrayList(8);
		// 使用for循环给list集合添加1-10数据
		for (int i = 1; i <= 10; i++)
		{
			list.add(i);// 先将数据装箱
			//     public boolean add(E e) {
			//         ensureCapacityInternal(size + 1);  // Increments modCount!!
			//         elementData[size++] = e;
			//         return true;
			//     }
			// 执行list.add
			// 1. 先确定是否要扩容
			// 2. 然后再执行赋值操作
			// ensureCapacityInternal
			//     private static int calculateCapacity(Object[] elementData, int minCapacity) {
			//         if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {// 判断是不是第一次扩容
			//             return Math.max(DEFAULT_CAPACITY, minCapacity);
			//         }
			//         return minCapacity;
			//     }
			//
			//     private void ensureCapacityInternal(int minCapacity) {
			//         ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
			//     }
			//
			//     private void ensureExplicitCapacity(int minCapacity) {
			//         modCount++;
			//
			//         // overflow-conscious code
			//         if (minCapacity - elementData.length > 0)
			//             grow(minCapacity);
			//     }
			// 1. modCount++记录集合被修改的次数 防止多线程操作
			// 2. 如果elementData的大小不够 就调用grow扩容
			//     private void grow(int minCapacity) {
			//         // overflow-conscious code
			//         int oldCapacity = elementData.length;
			//         int newCapacity = oldCapacity + (oldCapacity >> 1);// 1.5倍扩容 向右位移除以2
			//         if (newCapacity - minCapacity < 0)
			//             newCapacity = minCapacity;
			//         if (newCapacity - MAX_ARRAY_SIZE > 0)
			//             newCapacity = hugeCapacity(minCapacity);
			//         // minCapacity is usually close to size, so this is a win:
			//         elementData = Arrays.copyOf(elementData, newCapacity);
			//     }
			// 1. 真的扩容
			// 2. 使用扩容机制来确定要扩容到多大
			// 3. 第一次newCapacity=10
			// 4. 第二次后及其以后按照1.5倍扩容
			// 5. 扩容使用的是Arrays.copyOf
		}
		// 使用for给list集合添加11-15数据
		for (int i = 11; i <= 15; i++)
		{
			list.add(i);
		}
		list.add(100);
		list.add(200);
		list.add(null);
	}
}
