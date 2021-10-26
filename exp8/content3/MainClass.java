package exp8.content3;

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
        Book book = bd.queryByName(name);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("查无此书");
        }

        // 添加商品
        System.out.println();

        book = new Book("b10", "新添加的书", "未知作者", 20, new Category());
        bd.add(book);

        // 修改商品
        book = new Book("b11", "修改后的书", "未知作者", 20, new Category());
        bd.modify(2, book);

        System.out.println("添加，修改后的商品列表：");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }

    }
}
