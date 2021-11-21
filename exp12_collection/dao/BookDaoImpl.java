package exp12_collection.dao;

import java.util.ArrayList;
import java.util.List;

import exp12_collection.db.BookDataSet;
import exp12_collection.entity.*;

public class BookDaoImpl implements BookDao {

    public List<Book> queryBooks() {
        return BookDataSet.getBooks();
    }

    @Override
    public boolean add(Book book) {
        List<Book> books = BookDataSet.getBooks();

        return books.add(book);
    }

    @Override
    public Book set(int index, Book book) {
        List<Book> books = BookDataSet.getBooks();
        return books.set(index, book);
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
