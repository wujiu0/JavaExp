import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.inputInfo();
        stu.printInfo();
    }
}

class Student { // （1）{
    int number;
    String name;
    String course[] = { "java", "离散数学", "大学英语", "中国近代史纲要", "高数", "大学物理" };
    float score[];
    float sum = 0, ave;

    public void inputInfo() {
        Scanner reader = new Scanner(System.in);
        System.out.println("请进入该同学的基本信息：");
        System.out.print("学号：");
        number = reader.nextInt();
        System.out.print("姓名：");
        name = reader.next();
        score = new float[course.length]; // （2）score 数组的创建
        for (int i = 0; i < course.length; i++) {
            System.out.println(course[i] + "成绩：");
            score[i] = reader.nextFloat(); // （3）score 数组元素的初始化
        }
    }

    public float getSum() {
        for (int i = 0; i < course.length; i++)
            sum += score[i]; // （4）
        return sum;
    }

    public float getAve() {
        ave = sum / course.length; // （5）
        return ave;
    }

    public void printInfo() {
        System.out.println("该同学的基本信息为：");
        System.out.println("学号：" + number);
        System.out.println("姓名：" + name);
        System.out.println("总分：" + getSum());
        System.out.println("均分：" + getAve());
    }
}