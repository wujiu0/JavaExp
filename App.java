import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String regex = "\\w+\\p{Blank}\\p{Punct}\\p{Blank}\\w+";

        System.out.println("21 + 1".matches(regex));
    //     String str = new Scanner(System.in).nextLine();

    //     String[] a =  str.split(" ");
    //     double d = Double.parseDouble(a[0]);
    //     System.out.println(d);
    // }
    }
}
