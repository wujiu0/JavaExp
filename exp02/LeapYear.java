package exp02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年份：（输入-1退出程序）");
            int year = sc.nextInt();
            if (year < 0) {
                sc.close();
                return;
            } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "年是闰年");
            } else {
                System.out.println(year + "年不是闰年");
            }
        }
    }
}
