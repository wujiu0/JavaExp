package exp6;

import java.util.Scanner;

public class MainClass {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BookDataSet bookDataSet = new BookDataSet();
        Book[] books = bookDataSet.getBooks();

        System.out.println("站点商品明细：");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("请输入想要查询的书名：");
        String name = sc.next();
        Book b = bookDataSet.queryByName(name);
        if (b != null) {
            System.out.println(b);
        } else {
            System.out.println("查无此书");
        }

    }
}
