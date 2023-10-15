package JavaSE1_OOPMiddle.OOPMiddle2_modifier.modifier1;

public class B
{
    public void say()
    {
        A a = new A();
        //同一个包下可以访问public protected 默认 不能访问private
        System.out.println(a.n1 +  " " + a.n2 + " " + a.n3);
    }
}