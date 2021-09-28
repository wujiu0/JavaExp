package week1.exp2;

import java.util.Scanner;

public class TestTriplet {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Triplet t1 = new Triplet();
        t1.init();
        int flag = 1;
        while (flag == 1) {
            flag = menu(t1);
        }
        sc.close();
        Triplet.destory(t1);
    }

    public static int menu(Triplet t) {
        System.out.println("--------------");
        System.out.println("1.取某个分量");
        System.out.println("2.置某个分量");
        System.out.println("3.求最大值");
        System.out.println("4.求最小值");
        System.out.println("5.显示三元组");
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
