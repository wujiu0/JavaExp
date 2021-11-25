package exp13.db;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import exp13.entity.Book;
import exp13.entity.Category;

public class BookDataSet {
    private static List<Category> categories = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();// 书籍数据
    static {
        categories.add(new Category());
        categories.add(new Category(1, "工具类", "软件编程"));
        categories.add(new Category(2, "小说类", "历史"));
        // books.add(new Book("b01", "Java核心技术", "霍斯特曼", 50, categories.get(1)));
        // books.add(new Book("b02", "名著-三国演义", "罗贯中", 40, categories.get(2)));
        // books.add(new Book("b03", "名著-水浒传", "施耐庵", 30, categories.get(2)));
        // books.add(new Book("b04", "名著-红楼梦", "曹雪芹", 20, categories.get(2)));
        setBooks();
    }

    public BookDataSet() {
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static void setBooks() {
        File f = new File(DatabaseConfig.BOOK_FILE_PATH);
        try (FileInputStream fis = new FileInputStream(f); ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = null;
            while ((obj = ois.readObject()) != null && (obj instanceof List)) {
                for (Object item : (List<?>) obj) {
                    if (item instanceof Book) {
                        books.add((Book) item);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Book setBook(int index, Book book) {
        Book b = books.set(index, book);
        saveData();
        return b;
    }

    public static List<Category> getCategories() {
        return categories;
    }

    public static void setCategories(List<Category> categories) {
        BookDataSet.categories = categories;
    }

    public static boolean addBook(Book book) {
        boolean b = books.add(book);
        saveData();
        return b;
    }

    private static void saveData() {

        File f = new File(DatabaseConfig.BOOK_FILE_PATH);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));) {
            oos.writeObject(getBooks());
            oos.writeObject(null);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
