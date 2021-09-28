package week1.exp1;

public class TestHello2 {
    public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.speak();
	}    
}

class Student {
    String name = "张三"; //姓名
	
    public void speak() {
        System.out.println(name + "说：HelloWorld");
    }
    
}

