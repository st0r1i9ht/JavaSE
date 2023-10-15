package JavaSE5_Annotaion.Annotation1_Override;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class Override_
{
	public static void main(String[] args)
	{

	}
}

class Father// 父类
{
	public void fly()
	{
		System.out.println("Father.fly");
	}
}

class Son extends Father// 子类
{
	// 1. @Override 注解放在fly方法上 表示子类的fly方法重写了父类的fly
	// 2. 如果这里没有写@Override 还是重写了服了fly
	// 3. 如果写了@Override 注解 编译器会检查是否重写 的确重写了 编译通过 没有构成重写 编译错误
	// 4. @Override 定义
	// @Interface 注解类
	/*
	 @Target(ElementType.METHOD)
	 @Retention(RetentionPolicy.SOURCE)
	 public @interface Override {
	 }
	*/
	// 5. @Override 只能修饰方法
	// @Target 修饰注解的注解 元注解
	@Override// 说明
	public void fly()
	{
		super.fly();
	}
}