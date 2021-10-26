package exp9.content2;

import java.util.Scanner;

public class Calculator {
    private double number1;
    private double number2;
    private char operator;
    
    private void init() throws MyExpressionException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个表达式，数字与运算符之间使用空格隔开（例如32 + 54）：");

        String regex = "\\w+\\p{Blank}\\p{Punct}\\p{Blank}\\w+";
        String str = sc.nextLine();
        if (!str.matches(regex)) {
            throw new MyExpressionException("格式不匹配");
        }
        String[] strs = str.split(" ");

        try {
            // this.number1 = sc.nextDouble();
            // this.operator = sc.next().charAt(0);
            // this.number2 = sc.nextDouble();
            this.number1 = Double.parseDouble(strs[0]);
            this.operator = strs[1].charAt(0);
            this.number2 = Double.parseDouble(strs[2]);

        } catch (NumberFormatException e) {
            throw new MyOperandException("操作数非法");
        }

        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new MyOperatorException("请输入正确的操作符（+，-，*，/）");
        }
        if (number2 == 0) {
            throw new MyDivisorlsZeroException("错误，0不能作除数");
        }

    }

    private double compute() {
        double result = 0;
        switch (operator) {
        case '+':
            result = number1 + number2;
            break;
        case '-':
            result = number1 - number2;
            break;
        case '*':
            result = number1 * number2;
            break;
        case '/':
            result = number1 / number2;
            break;
        }
        return result;
    }

    public double work() {
        char flag = 'y';
        Scanner sc = new Scanner(System.in);
        while (flag == 'y') {
            try {
                init();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println(compute());
            System.out.println("是否继续计算？(y/n)");
            flag = sc.next().charAt(0);
        }
        return 0;
    }
}
