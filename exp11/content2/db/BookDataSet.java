package exp11.content2.db;

import exp11.content2.entity.Book;
import exp11.content2.entity.Category;

public class BookDataSet {
    private Book[] books;// 书籍数据

    public BookDataSet() {
        books = new Book[10];
        Category category1 = new Category(1, "工具类", "软件编程");
        Category category2 = new Category(2, "小说类", "历史");

        books[0] = new Book("b01", "Java核心技术", "霍斯特曼", 50, category1);
        books[1] = new Book("b02", "名著-三国演义", "罗贯中", 40, category2);
        books[2] = new Book("b03", "名著-水浒传", "施耐庵", 30, category2);
        books[3] = new Book("b04", "名著-红楼梦", "曹雪芹", 20, category2);
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

}
