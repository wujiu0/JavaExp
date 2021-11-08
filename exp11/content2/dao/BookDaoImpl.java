package exp11.content2.dao;

import exp11.content2.db.BookDataSet;
import exp11.content2.entity.*;

public class BookDaoImpl implements BookDao {
    BookDataSet bds = new BookDataSet();

    public Book[] queryBooks() {
        return bds.getBooks();
    }

    @Override
    public boolean add(Book book) {
        Book[] books = bds.getBooks();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean modify(int index, Book book) {
        Book[] books = bds.getBooks();
        books[index] = book;
        return true;
    }

    @Override
    public Book queryByAuthor(String author) {
        Book[] books = bds.getBooks();
        for (int i = 0; i < books.length && books[i] != null; i++) {
            if (books[i].getAuthor().equals(author)) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book queryById(String id) {
        Book[] books = bds.getBooks();
        for (int i = 0; i < books.length && books[i] != null; i++) {
            if (books[i].getBid().equals(id)) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book queryByName(String name) {
        Book[] books = bds.getBooks();
        for (int i = 0; i < books.length && books[i] != null; i++) {
            if (books[i].getName().equals(name)) {
                return books[i];
            }
        }
        return null;
    }

}
