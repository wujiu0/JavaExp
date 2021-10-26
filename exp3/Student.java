package exp3;

import java.util.Scanner;

public class Student {
    String name;
    char sex;
    float[] grade = new float[4];

    // 信息录入
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生姓名：");
        name = sc.next();
        System.out.print("请输入性别：");
        sc.nextLine();
        sex = sc.next().charAt(0);
        System.out.println("请分别输入高数，线代，C语言，面向对象成绩：");
        for (int i = 0; i < grade.length; i++) {
            grade[i] = sc.nextFloat();
        }
    }

    // 信息输出
    public void output() {
        System.out.println("姓名    性别    高数成绩  线代成绩  C语言成绩  面向对象成绩");
        System.out.print(name+"    "+sex+"      ");

        for (int i = 0; i < grade.length; i++) {
            System.out.print(grade[i]+"      ");
        }
    }

    // 返回平均成绩
    public float average() {
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        return sum / 4;
    }
}
