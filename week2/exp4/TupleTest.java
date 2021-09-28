package week2.exp4;

import java.util.Scanner;

public class TupleTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Tuple t1 = new Tuple();
        System.out.println("请输入N元组的元素个数：");
        int N = sc.nextInt();
        t1.init(N);
        int flag = 1;
        while (flag == 1) {
            flag = menu(t1);
        }
        sc.close();
        Tuple.destory(t1);
    }

    public static int menu(Tuple t) {
        System.out.println("--------------");
        System.out.println("1.取某个分量");
        System.out.println("2.置某个分量");
        System.out.println("3.求最大值");
        System.out.println("4.求最小值");
        System.out.println("5.显示N元组");
        System.out.println("6.退出");
        System.out.println("---------------");
        System.out.println("请输入要进行的操作：");
        int tmp = sc.nextInt();
        int num;
        float value;
        switch (tmp) {
            case 1:
                System.out.println("请输入序号：");
                num = sc.nextInt();
                value = t.get(num);
                System.out.println("第" + num + "个分量是" + value);
                break;
            case 2:
                System.out.println("请输入分量序号：");
                num = sc.nextInt();
                System.out.println("请输入变量值：");
                value = sc.nextInt();
                t.set(num, value);
                break;
            case 3:
                System.out.println("最大值是：" + t.getMax());
                break;
            case 4:
                System.out.println("最小值是：" + t.getMin());
                break;
            case 5:
                t.show();
                break;
            case 6:
                return 0;
            default:
                System.out.println("输入出错");
                break;
        }
        return 1;
    }
}
