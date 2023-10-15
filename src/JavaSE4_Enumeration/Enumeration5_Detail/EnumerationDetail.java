package JavaSE4_Enumeration.Enumeration5_Detail;

/**
 * @author st0r1i9ht
 * @version 1.0
 */
public class EnumerationDetail
{
	public static void main(String[] args)
	{
		Music.CLASSICMUSIC.playing();
	}
}

class A
{

}
//1.enum不能继承类 Java是单继承机制 enum已经隐式继承了Enum
//enum Enum extends A
//{
//
//}
//2.enum实现的枚举类 仍然是一个类 可以实现接口
interface IPlaying
{
	void playing();
}
enum Music implements IPlaying
{
	CLASSICMUSIC;

	@Override
	public void playing()
	{

	}
}
