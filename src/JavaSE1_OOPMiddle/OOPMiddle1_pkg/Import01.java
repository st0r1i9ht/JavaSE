//一个类中最多只有一句package
package JavaSE1_OOPMiddle.OOPMiddle1_pkg;

//import放在package下面，在类定义前面，可以有多句且没有顺序要求
//com.公司名.项目名.模块名
import java.util.Arrays;

public class Import01
{
    public static void main(String[] args)
    {
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

}

/*
 * 快捷键
 * ctrl + d 复制并粘贴一行
 * ctrl + y 删除一行
 * ctrl + / 注释
 * alt + insert 生成代码
 * alt + l 快速格式化
 * alt + enter 显示提示
 */