package week5.exp8.content3;

import java.util.Scanner;

public class MainClass {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BookDao bd = new BookDaoImpl();

        Book[] books = bd.queryBooks();
        System.out.println("站点商品明细：");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }

        System.out.println("请输入想要查询的书名：");
        String name = sc.next();
        Book b = bd.queryByName(name);
        if (b != null) {
            System.out.println(b);
        } else {
            System.out.println("查无此书");
        }


        
    }
}
