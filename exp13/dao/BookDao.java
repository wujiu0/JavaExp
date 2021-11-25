package exp13.dao;

import java.util.List;

import exp13.entity.*;

public interface BookDao {

    public List<Book> getBooks();

    // 商品信息录入
    public boolean addBook(Book book);

    // 商品信息修改
    public Book set(int index, Book book);

    // 按id查询
    public Book queryById(String id);

    // 按书名查询
    public Book queryByName(String name);

    // 按作者查询
    public Book queryByAuthor(String author);

    // 按分类查询
    public List<Book> queryByCategory(Category category);

}
