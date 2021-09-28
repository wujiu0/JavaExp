package week3.exp5;

import java.util.Scanner;

public class MyArrayListTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.init();
    }

    public static int menu(MyArrayList list) {
        System.out.println("--------------");
        System.out.println("1.清空线性表");
        System.out.println("2.插入元素");
        System.out.println("3.删除元素");
        System.out.println("4.查找");
        System.out.println("5.显示线性表");
        System.out.println("6.求长度");
        System.out.println("---------------");
        System.out.println("请输入要进行的操作：");
        int tmp = sc.nextInt();
       
        switch (tmp) {
            case 1:
                
                break;
            case 2:
               
                break;
            case 3:
                
                break;
            case 4:
               
                break;
            case 5:
               
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
