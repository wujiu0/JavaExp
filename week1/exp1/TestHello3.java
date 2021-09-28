package week1.exp1;

public class TestHello3 {
    public static void main(String[] args) {
        Student2 stu1 = new Student2("张三");
        Student2 stu2 = new Student2("李四");
        Student2 stu3 = new Student2("王五");
        stu1.speak("你好");
        stu2.speak("你也好");
        stu3.speak("你更好");
    }
}

class Student2 {
    String name = "张三"; // 姓名

    Student2(String name) {
        this.name = name;
    }

    public void speak(String sentence) {
        System.out.println(name + "说：" + sentence);
    }

}
