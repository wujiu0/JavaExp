package week3.exp6;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private char op;

    public Calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个表达式，数字与运算符之间使用空格隔开（例如32 + 54）：");
        this.num1 = sc.nextInt();
        this.op = sc.next().charAt(0);
        this.num2 = sc.nextInt();
    }

    public int cal() {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                System.out.println("运算符输入错误");
                return 0;
        }
    }

}
