import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String regex = "\\w+\\p{Blank}\\p{Punct}\\p{Blank}\\w+";

        System.out.println("21 + 1".matches(regex));
        System.out.println("你好".getBytes().length);
        System.out.println(System.getProperty("file.encoding"));
    //     String str = new Scanner(System.in).nextLine();

    //     String[] a =  str.split(" ");
    //     double d = Double.parseDouble(a[0]);
    //     System.out.println(d);
    // }
	}
}