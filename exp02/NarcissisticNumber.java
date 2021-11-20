package exp02;

import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("请输入一个三位数：");
            num = sc.nextInt();
            if (num >= 100 && num <= 999) {
                break;
            }else{
                System.out.println("输入错误");
            }
        }
        sc.close();
        int[] array = new int[3];
        int sum = 0;
        array[0] = num % 10;
        array[1] = num / 10 % 10;
        array[2] = num / 100 % 10;
        for (int i = 0; i < 3; i++) {
            sum += Math.pow(array[i], 3);
        }
        if (sum == num) {
            System.out.println(num + "是水仙花数");
        } else {
            System.out.println(num + "不是水仙花数");
        }
    }
}
