package exp13.dao;

import java.util.ArrayList;
import java.util.List;

import exp13.db.BookDataSet;
import exp13.entity.*;

public class BookDaoImpl implements BookDao {

    @Override
    public List<Book> getBooks() {
        return BookDataSet.getBooks();
    }

    @Override
    public boolean addBook(Book book) {
        return BookDataSet.addBook(book);
    }

    @Override
    public Book set(int index, Book book) {
        return BookDataSet.setBook(index,book);
    }

    @Override
    public Book queryByAuthor(String author) {
        List<Book> books = BookDataSet.getBooks();
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b != null) {
                if (books.get(i).getAuthor().equals(author)) {
                    return b;
                }
            }
        }
        return null;
    }

    @Override
    public Book queryById(String id) {
        List<Book> books = BookDataSet.getBooks();
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b != null) {
                if (books.get(i).getBid().equals(id)) {
                    return b;
                }
            }
        }
        return null;
    }

    @Override
    public Book queryByName(String name) {
        List<Book> books = BookDataSet.getBooks();
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b != null) {
                if (books.get(i).getAuthor().equals(name)) {
                    return b;
                }
            }
        }
        return null;
    }

    @Override
    public List<Book> queryByCategory(Category category) {
        List<Book> books = BookDataSet.getBooks();
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b != null) {
                if (books.get(i).getCategory().equals(category)) {
                    result.add(b);
                }
            }
        }
        return result;
    }

}
