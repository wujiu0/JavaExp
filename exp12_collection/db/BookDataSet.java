package exp12_collection.db;

import java.util.*;

import exp12_collection.entity.*;

public class BookDataSet {
    private static List<Book> books;// 书籍数据
    private static List<Category> categories;
    static {
        books = new ArrayList<>();
        categories = new ArrayList<>();
        categories.add(new Category());
        categories.add(new Category(1, "工具类", "软件编程"));
        categories.add(new Category(2, "小说类", "历史"));
        books.add(new Book("b01", "Java核心技术", "霍斯特曼", 50, categories.get(1)));
        books.add(new Book("b02", "名著-三国演义", "罗贯中", 40, categories.get(2)));
        books.add(new Book("b03", "名著-水浒传", "施耐庵", 30, categories.get(2)));
        books.add(new Book("b04", "名著-红楼梦", "曹雪芹", 20, categories.get(2)));
    }

    public BookDataSet() {
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static void setBooks(List<Book> books) {
        BookDataSet.books = books;
    }

    public static List<Category> getCategories() {
        return categories;
    }

    public static void setCategories(List<Category> categories) {
        BookDataSet.categories = categories;
    }

}
