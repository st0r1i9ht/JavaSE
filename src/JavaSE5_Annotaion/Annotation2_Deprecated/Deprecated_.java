package JavaSE5_Annotaion.Annotation2_Deprecated;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Deprecated_
{
	public static void main(String[] args)
	{
		A a = new A();
		a.hi();
		System.out.println(a.n1);
	}
}

// 1. @Deprecated 修饰元素 表示该元素已经过时
// 2. 即使不推荐使用 但是仍然可以使用
// 3. @Deprecated 源码
// 4. 可以修饰方法 类 字段 包 参数 等等
// 5. @Deprecated 看可以做版本升级过渡使用
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */
@Deprecated
class A
{
	@Deprecated
	public int n1 = 10;

	@Deprecated
	public void hi()
	{

	}
}

