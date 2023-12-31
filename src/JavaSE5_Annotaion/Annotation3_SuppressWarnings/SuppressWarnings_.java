package JavaSE5_Annotaion.Annotation3_SuppressWarnings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class SuppressWarnings_
{
	// 1. 当我们不希望看到警告 使用@SuppressWarnings 注解来抑制警告信息
	// 2. 在{""}中写入希望抑制的警告信息
	// 3. 可以指定的警告类型有
	// @SuppressWarning 中的属性介绍以及属性说明
	//
	// all，抑制所有警告
	// boxing，抑制与封装/拆装作业相关的警告
	// cast，抑制与强制转型作业相关的警告
	// dep-ann，抑制与淘汰注释相关的警告
	// deprecation，抑制与淘汰的相关警告
	// fallthrough，抑制与switch陈述式中遗漏break相关的警告
	// finally，抑制与未传回finally区块相关的警告
	// hiding，抑制与隐藏变数的区域变数相关的警告
	// incomplete-switch，抑制与switch陈述式(enum case)中遗漏项目相关的警告
	// javadoc，抑制与javadoc相关的警告
	// nls，抑制与非nls字串文字相关的警告
	// null，抑制与空值分析相关的警告
	// rawtypes，抑制与使用raw类型相关的警告
	// resource，抑制与使用Closeable类型的资源相关的警告
	// restriction，抑制与使用不建议或禁止参照相关的警告
	// serial，抑制与可序列化的类别遗漏serialVersionUID栏位相关的警告
	// static-access，抑制与静态存取不正确相关的警告
	// static-method，抑制与可能宣告为static的方法相关的警告
	// super，抑制与置换方法相关但不含super呼叫的警告
	// synthetic-access，抑制与内部类别的存取未最佳化相关的警告
	// sync-override，抑制因为置换同步方法而遗漏同步化的警告
	// unchecked，抑制与未检查的作业相关的警告
	// unqualified-field-access，抑制与栏位存取不合格相关的警告
	// unused，抑制与未用的程式码及停用的程式码相关的警告
	// 4. 关于SuppressWarnings 作用范围和防止的位置有关
	//    比如@SuppressWarnings 放在main方法 那么抑制警告的范围是main
	//    通常可以放置在语句 方法 类上
	// 5. @SuppressingWarnings 源码
	// (1). 放置的位置 TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
	// (2). 该注解数有数组String[] values() 设置一个数组 比如{"rawtypes", "unchecked", "unused"}
	/*
		@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
		@Retention(RetentionPolicy.SOURCE)
		public @interface SuppressWarnings {

			String[] value();
		}
	 */
	@SuppressWarnings({"rawtypes", "unchecked", "unused"})
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");
		int i;
		System.out.println(list.get(1));
	}

	public void f1()
	{
		// @SuppressWarnings({"rawtypes"})
		List list = new ArrayList();

		list.add("jack");
		list.add("tom");
		list.add("mary");
		// @SuppressWarnings({"unused"})
		int i;
		System.out.println(list.get(1));
	}
}

// 补充四种元注解
// 1. @Retention 指定注解的作用范围 SOURCE, CLASS, RUNTIME
// 2. @Target 指定注解可以在哪些地方使用
// 3. @Document 指定该注解是否会在javadoc体现
// 4. @Inherited 子类会继承父类注解