package exp11.content2.dao;

import exp11.content2.entity.*;

public interface BookDao {

    public Book[] queryBooks();

    // 商品信息录入
    public boolean add(Book book);

    // 商品信息修改
    public boolean modify(int index, Book book);

    // 按id查询
    public Book queryById(String id);

    // 按书名查询
    public Book queryByName(String name);

    // 按作者查询
    public Book queryByAuthor(String author);

}
