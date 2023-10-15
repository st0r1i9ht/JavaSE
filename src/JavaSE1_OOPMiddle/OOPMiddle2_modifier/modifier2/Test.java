package JavaSE1_OOPMiddle.OOPMiddle2_modifier.modifier2;

import JavaSE1_OOPMiddle.OOPMiddle2_modifier.modifier1.A;

public class Test
{
    public static void main(String[] args)
    {
        A a = new A();
        //在不同包下只能访问public修饰的属性或方法
        //System.out.println(a.n1 + a.n2 + a.n3 + a.n4);

    }
}