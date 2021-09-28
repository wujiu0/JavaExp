import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();//正确
        // System.out.println(num2);

        // int num = sc.nextInt();
        // sc.nextLine();
        // String str = sc.nextLine();//出错
        // System.out.println(str);

        // int num = sc.nextInt();
        // String str = sc.next();//正确
        // System.out.println(str);

        // String str1 = sc.next();
        // String str2 = sc.nextLine();//出错
        // System.out.println(str2);

        // String str1 = sc.nextLine();
        // String str2 = sc.nextLine();//正确
        // System.out.println(str2);

        sc.close();
    }

}
