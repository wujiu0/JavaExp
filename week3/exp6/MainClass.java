package week3.exp6;

public class MainClass {
    public static void main(String[] args) {
        BookDataSet bookDataSet = new BookDataSet();
        Book[] books= bookDataSet.getBooks();
        
        System.out.println("站点商品明细：");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
