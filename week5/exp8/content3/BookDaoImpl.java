package week5.exp8.content3;

public class BookDaoImpl implements BookDao {

    @Override
    public Book queryByAuthor(Book[] books, String author) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Book queryByCategory(Book[] books, String category) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Book queryById(Book[] books, String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Book queryByName(Book[] books, String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public boolean add(Book book) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Book[] getBooks() {
        // TODO Auto-generated method stub
        return null;
    }

}
