import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] b = { 1, 2 };
        b = Arrays.copyOf(b,3);
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));

    }
}
