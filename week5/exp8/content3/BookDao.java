package week5.exp8.content3;

public interface BookDao {

    // 商品信息录入
    public boolean add(Book book);
    // 商品信息修改

    // 按id查询
    public Book queryById(Book[] books,String id);

    // 按书名查询
    public Book queryByName(Book[] books,String name);

    // 按作者查询
    public Book queryByAuthor(Book[] books, String author);

    // 按类目查询
    public Book queryByCategory(Book[] books,String category);

    public Book[] getBooks();



}
