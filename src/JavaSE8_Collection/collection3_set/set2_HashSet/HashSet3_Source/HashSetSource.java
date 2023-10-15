package JavaSE8_Collection.collection3_set.set2_HashSet.HashSet3_Source;

import java.util.HashSet;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetSource
{
	public static void main(String[] args)
	{
		HashSet hashSet = new HashSet();
		hashSet.add("java");
		hashSet.add("php");
		hashSet.add("java");

		System.out.println(hashSet);
/* 		1.     public HashSet() {
		        map = new HashMap<>();
		    }
		2.     public boolean add(E e) {
		        return map.put(e, PRESENT)==null; // PRESENT     private static final Object PRESENT = new Object();
		    }
		3.     public V put(K key, V value) { // key = "java" value = PRESENT 共享
		        return putVal(hash(key), key, value, false, true);
		    }
		//执行hash方法 得到key对应的hash值 算法
		static final int hash(Object key) {
		        int h;
		        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
		    }
		4.     final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
		                   boolean evict) {
		        Node<K,V>[] tab; Node<K,V> p; int n, i; // 定义了辅助变量
		            // table 是HashMap的一个数组 类型是Node[]
		            // table 为null或者大小=0时第一次扩容16个空间
		        if ((tab = table) == null || (n = tab.length) == 0)
		            n = (tab = resize()).length;
		            // 根据key得到hash 去计算该key应该存放到table表的哪个索引位置
		            // 并且把这个位置的对象 赋给辅助变量p
		        else {
		        if ((p = tab[i = (n - 1) & hash]) == null)
		            tab[i] = newNode(hash, key, value, null);
		            Node<K,V> e; K k;
		            if (p.hash == hash &&
		                ((k = p.key) == key || (key != null && key.equals(k))))
		                e = p;
		            else if (p instanceof TreeNode)
		                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
		            else {
		                for (int binCount = 0; ; ++binCount) {
		                    if ((e = p.next) == null) {
		                        p.next = newNode(hash, key, value, null);
		                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
		                            treeifyBin(tab, hash);
		                        break;
		                    }
		                    if (e.hash == hash &&
		                        ((k = e.key) == key || (key != null && key.equals(k))))
		                        break;
		                    p = e;
		                }
		            }
		            if (e != null) { // existing mapping for key
		                V oldValue = e.value;
		                if (!onlyIfAbsent || oldValue == null)
		                    e.value = value;
		                afterNodeAccess(e);
		                return oldValue;
		            }
		        }
		        ++modCount;
		        if (++size > threshold)
		            resize();
		        afterNodeInsertion(evict);
		        return null;
		    }
		5. */
	}
}
